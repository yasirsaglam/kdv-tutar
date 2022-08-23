import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double tutar, kdvOran = 0.18, kdvTutar, toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.println("Tutar Giriniz : ");
        tutar = input.nextInt();

        kdvTutar = tutar * kdvOran;
        toplamTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutar :" + toplamTutar);
    }
}
