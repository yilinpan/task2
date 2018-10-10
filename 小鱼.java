import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner cin=new Scanner(System.in);
        int a = cin.nextInt(), b = cin.nextInt() ,c = cin.nextInt() ,d = cin.nextInt();
        int e = c - a , f = d - b;
        if (f<0){
            e--;
            f+=60;
        }
        System.out.printf("%d %d",e,f);
    }
}