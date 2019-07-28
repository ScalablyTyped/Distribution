package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPaymentMethod extends js.Object

@JSImport("steam-client", "EPaymentMethod")
@js.native
object EPaymentMethod extends js.Object {
  @js.native
  sealed trait ActivationCode extends EPaymentMethod
  
  @js.native
  sealed trait Akbank extends EPaymentMethod
  
  @js.native
  sealed trait AliPay extends EPaymentMethod
  
  @js.native
  sealed trait AmexBrazil extends EPaymentMethod
  
  @js.native
  sealed trait Aura extends EPaymentMethod
  
  @js.native
  sealed trait AuthorizedDevice extends EPaymentMethod
  
  @js.native
  sealed trait AutoGrant extends EPaymentMethod
  
  @js.native
  sealed trait BBVAContinental extends EPaymentMethod
  
  @js.native
  sealed trait BancoCreditoDePeru extends EPaymentMethod
  
  @js.native
  sealed trait BancoDoBrasilOnline extends EPaymentMethod
  
  @js.native
  sealed trait BankAsya extends EPaymentMethod
  
  @js.native
  sealed trait BankTransferJapan extends EPaymentMethod
  
  @js.native
  sealed trait Beeline extends EPaymentMethod
  
  @js.native
  sealed trait BitCoin extends EPaymentMethod
  
  @js.native
  sealed trait BoaCompraGold extends EPaymentMethod
  
  @js.native
  sealed trait BoletoBancario extends EPaymentMethod
  
  @js.native
  sealed trait BookVoucher extends EPaymentMethod
  
  @js.native
  sealed trait BradescoOnline extends EPaymentMethod
  
  @js.native
  sealed trait Carnet extends EPaymentMethod
  
  @js.native
  sealed trait CashU extends EPaymentMethod
  
  @js.native
  sealed trait ClickAndBuy extends EPaymentMethod
  
  @js.native
  sealed trait Complimentary extends EPaymentMethod
  
  @js.native
  sealed trait ConvenientStoreVoucher extends EPaymentMethod
  
  @js.native
  sealed trait CreditCard extends EPaymentMethod
  
  @js.native
  sealed trait CreditCardJapan extends EPaymentMethod
  
  @js.native
  sealed trait CultureVoucher extends EPaymentMethod
  
  @js.native
  sealed trait DenizBank extends EPaymentMethod
  
  @js.native
  sealed trait DinersCardBrazil extends EPaymentMethod
  
  @js.native
  sealed trait EClubPoints extends EPaymentMethod
  
  @js.native
  sealed trait Efecty extends EPaymentMethod
  
  @js.native
  sealed trait Exito extends EPaymentMethod
  
  @js.native
  sealed trait Finansbank extends EPaymentMethod
  
  @js.native
  sealed trait GameStop extends EPaymentMethod
  
  @js.native
  sealed trait GameVoucher extends EPaymentMethod
  
  @js.native
  sealed trait Garanti extends EPaymentMethod
  
  @js.native
  sealed trait Giropay extends EPaymentMethod
  
  @js.native
  sealed trait GuestPass extends EPaymentMethod
  
  @js.native
  sealed trait Halkbank extends EPaymentMethod
  
  @js.native
  sealed trait HappymoneyVoucher extends EPaymentMethod
  
  @js.native
  sealed trait HardwarePromo extends EPaymentMethod
  
  @js.native
  sealed trait Hipercard extends EPaymentMethod
  
  @js.native
  sealed trait Ideal extends EPaymentMethod
  
  @js.native
  sealed trait IsBank extends EPaymentMethod
  
  @js.native
  sealed trait ItauOnline extends EPaymentMethod
  
  @js.native
  sealed trait Kiosk extends EPaymentMethod
  
  @js.native
  sealed trait Konbini extends EPaymentMethod
  
  @js.native
  sealed trait MOLPoints extends EPaymentMethod
  
   // removed "renamed to MaestroBoaCompra"
  @js.native
  sealed trait Maestro extends EPaymentMethod
  
  @js.native
  sealed trait MaestroBoaCompra extends EPaymentMethod
  
  @js.native
  sealed trait MangirKart extends EPaymentMethod
  
  @js.native
  sealed trait MasterComp extends EPaymentMethod
  
  @js.native
  sealed trait MastercardBrazil extends EPaymentMethod
  
  @js.native
  sealed trait MoPay extends EPaymentMethod
  
  @js.native
  sealed trait MoneyBookers extends EPaymentMethod
  
  @js.native
  sealed trait Multibanco extends EPaymentMethod
  
  @js.native
  sealed trait None extends EPaymentMethod
  
  @js.native
  sealed trait OEMTicket extends EPaymentMethod
  
  @js.native
  sealed trait OXXO extends EPaymentMethod
  
  @js.native
  sealed trait OneCard extends EPaymentMethod
  
  @js.native
  sealed trait PSE extends EPaymentMethod
  
  @js.native
  sealed trait PTT extends EPaymentMethod
  
  @js.native
  sealed trait PagoEfectivo extends EPaymentMethod
  
  @js.native
  sealed trait Pagseguro extends EPaymentMethod
  
  @js.native
  sealed trait Paloto extends EPaymentMethod
  
  @js.native
  sealed trait PayEasy extends EPaymentMethod
  
   // removed "renamed to PayEasy"
  @js.native
  sealed trait PayEasyJapan extends EPaymentMethod
  
  @js.native
  sealed trait PayPal extends EPaymentMethod
  
  @js.native
  sealed trait PaySafeCard extends EPaymentMethod
  
  @js.native
  sealed trait Payshop extends EPaymentMethod
  
  @js.native
  sealed trait PinValidda extends EPaymentMethod
  
  @js.native
  sealed trait Promotional extends EPaymentMethod
  
  @js.native
  sealed trait Qiwi extends EPaymentMethod
  
  @js.native
  sealed trait SPEI extends EPaymentMethod
  
  @js.native
  sealed trait SafetyPay extends EPaymentMethod
  
  @js.native
  sealed trait Sofort extends EPaymentMethod
  
  @js.native
  sealed trait Split extends EPaymentMethod
  
   // removed "renamed to MasterComp"
  @js.native
  sealed trait SteamPressMaster extends EPaymentMethod
  
   // removed "renamed to Promotional"
  @js.native
  sealed trait StorePromotion extends EPaymentMethod
  
  @js.native
  sealed trait ThreePay extends EPaymentMethod
  
  @js.native
  sealed trait ToditoCash extends EPaymentMethod
  
  @js.native
  sealed trait Trustly extends EPaymentMethod
  
  @js.native
  sealed trait UnionPay extends EPaymentMethod
  
  @js.native
  sealed trait Valve extends EPaymentMethod
  
  @js.native
  sealed trait VisaBrazil extends EPaymentMethod
  
  @js.native
  sealed trait Wallet extends EPaymentMethod
  
  @js.native
  sealed trait WebMoney extends EPaymentMethod
  
  @js.native
  sealed trait WebMoneyJapan extends EPaymentMethod
  
  @js.native
  sealed trait Yandex extends EPaymentMethod
  
  @js.native
  sealed trait YapiKredi extends EPaymentMethod
  
  @js.native
  sealed trait Zong extends EPaymentMethod
  
  /* 1 */ val ActivationCode: typings.steamDashClient.steamDashClientMod.EPaymentMethod.ActivationCode with Double = js.native
  /* 55 */ val Akbank: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Akbank with Double = js.native
  /* 11 */ val AliPay: typings.steamDashClient.steamDashClientMod.EPaymentMethod.AliPay with Double = js.native
  /* 25 */ val AmexBrazil: typings.steamDashClient.steamDashClientMod.EPaymentMethod.AmexBrazil with Double = js.native
  /* 26 */ val Aura: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Aura with Double = js.native
  /* 30 */ val AuthorizedDevice: typings.steamDashClient.steamDashClientMod.EPaymentMethod.AuthorizedDevice with Double = js.native
  /* 64 */ val AutoGrant: typings.steamDashClient.steamDashClientMod.EPaymentMethod.AutoGrant with Double = js.native
  /* 74 */ val BBVAContinental: typings.steamDashClient.steamDashClientMod.EPaymentMethod.BBVAContinental with Double = js.native
  /* 73 */ val BancoCreditoDePeru: typings.steamDashClient.steamDashClientMod.EPaymentMethod.BancoCreditoDePeru with Double = js.native
  /* 20 */ val BancoDoBrasilOnline: typings.steamDashClient.steamDashClientMod.EPaymentMethod.BancoDoBrasilOnline with Double = js.native
  /* 58 */ val BankAsya: typings.steamDashClient.steamDashClientMod.EPaymentMethod.BankAsya with Double = js.native
  /* 37 */ val BankTransferJapan: typings.steamDashClient.steamDashClientMod.EPaymentMethod.BankTransferJapan with Double = js.native
  /* 33 */ val Beeline: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Beeline with Double = js.native
  /* 79 */ val BitCoin: typings.steamDashClient.steamDashClientMod.EPaymentMethod.BitCoin with Double = js.native
  /* 19 */ val BoaCompraGold: typings.steamDashClient.steamDashClientMod.EPaymentMethod.BoaCompraGold with Double = js.native
  /* 18 */ val BoletoBancario: typings.steamDashClient.steamDashClientMod.EPaymentMethod.BoletoBancario with Double = js.native
  /* 41 */ val BookVoucher: typings.steamDashClient.steamDashClientMod.EPaymentMethod.BookVoucher with Double = js.native
  /* 22 */ val BradescoOnline: typings.steamDashClient.steamDashClientMod.EPaymentMethod.BradescoOnline with Double = js.native
  /* 50 */ val Carnet: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Carnet with Double = js.native
  /* 62 */ val CashU: typings.steamDashClient.steamDashClientMod.EPaymentMethod.CashU with Double = js.native
  /* 32 */ val ClickAndBuy: typings.steamDashClient.steamDashClientMod.EPaymentMethod.ClickAndBuy with Double = js.native
  /* 1024 */ val Complimentary: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Complimentary with Double = js.native
  /* 43 */ val ConvenientStoreVoucher: typings.steamDashClient.steamDashClientMod.EPaymentMethod.ConvenientStoreVoucher with Double = js.native
  /* 2 */ val CreditCard: typings.steamDashClient.steamDashClientMod.EPaymentMethod.CreditCard with Double = js.native
  /* 36 */ val CreditCardJapan: typings.steamDashClient.steamDashClientMod.EPaymentMethod.CreditCardJapan with Double = js.native
  /* 40 */ val CultureVoucher: typings.steamDashClient.steamDashClientMod.EPaymentMethod.CultureVoucher with Double = js.native
  /* 60 */ val DenizBank: typings.steamDashClient.steamDashClientMod.EPaymentMethod.DenizBank with Double = js.native
  /* 29 */ val DinersCardBrazil: typings.steamDashClient.steamDashClientMod.EPaymentMethod.DinersCardBrazil with Double = js.native
  /* 35 */ val EClubPoints: typings.steamDashClient.steamDashClientMod.EPaymentMethod.EClubPoints with Double = js.native
  /* 69 */ val Efecty: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Efecty with Double = js.native
  /* 68 */ val Exito: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Exito with Double = js.native
  /* 59 */ val Finansbank: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Finansbank with Double = js.native
  /* 15 */ val GameStop: typings.steamDashClient.steamDashClientMod.EPaymentMethod.GameStop with Double = js.native
  /* 44 */ val GameVoucher: typings.steamDashClient.steamDashClientMod.EPaymentMethod.GameVoucher with Double = js.native
  /* 54 */ val Garanti: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Garanti with Double = js.native
  /* 3 */ val Giropay: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Giropay with Double = js.native
  /* 8 */ val GuestPass: typings.steamDashClient.steamDashClientMod.EPaymentMethod.GuestPass with Double = js.native
  /* 57 */ val Halkbank: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Halkbank with Double = js.native
  /* 42 */ val HappymoneyVoucher: typings.steamDashClient.steamDashClientMod.EPaymentMethod.HappymoneyVoucher with Double = js.native
  /* 16 */ val HardwarePromo: typings.steamDashClient.steamDashClientMod.EPaymentMethod.HardwarePromo with Double = js.native
  /* 27 */ val Hipercard: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Hipercard with Double = js.native
  /* 5 */ val Ideal: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Ideal with Double = js.native
  /* 53 */ val IsBank: typings.steamDashClient.steamDashClientMod.EPaymentMethod.IsBank with Double = js.native
  /* 21 */ val ItauOnline: typings.steamDashClient.steamDashClientMod.EPaymentMethod.ItauOnline with Double = js.native
  /* 13 */ val Kiosk: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Kiosk with Double = js.native
  /* 34 */ val Konbini: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Konbini with Double = js.native
  /* 31 */ val MOLPoints: typings.steamDashClient.steamDashClientMod.EPaymentMethod.MOLPoints with Double = js.native
  /* 47 */ val Maestro: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Maestro with Double = js.native
  /* 47 */ val MaestroBoaCompra: typings.steamDashClient.steamDashClientMod.EPaymentMethod.MaestroBoaCompra with Double = js.native
  /* 72 */ val MangirKart: typings.steamDashClient.steamDashClientMod.EPaymentMethod.MangirKart with Double = js.native
  /* 130 */ val MasterComp: typings.steamDashClient.steamDashClientMod.EPaymentMethod.MasterComp with Double = js.native
  /* 28 */ val MastercardBrazil: typings.steamDashClient.steamDashClientMod.EPaymentMethod.MastercardBrazil with Double = js.native
  /* 17 */ val MoPay: typings.steamDashClient.steamDashClientMod.EPaymentMethod.MoPay with Double = js.native
  /* 10 */ val MoneyBookers: typings.steamDashClient.steamDashClientMod.EPaymentMethod.MoneyBookers with Double = js.native
  /* 45 */ val Multibanco: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Multibanco with Double = js.native
  /* 0 */ val None: typings.steamDashClient.steamDashClientMod.EPaymentMethod.None with Double = js.native
  /* 256 */ val OEMTicket: typings.steamDashClient.steamDashClientMod.EPaymentMethod.OEMTicket with Double = js.native
  /* 48 */ val OXXO: typings.steamDashClient.steamDashClientMod.EPaymentMethod.OXXO with Double = js.native
  /* 66 */ val OneCard: typings.steamDashClient.steamDashClientMod.EPaymentMethod.OneCard with Double = js.native
  /* 67 */ val PSE: typings.steamDashClient.steamDashClientMod.EPaymentMethod.PSE with Double = js.native
  /* 61 */ val PTT: typings.steamDashClient.steamDashClientMod.EPaymentMethod.PTT with Double = js.native
  /* 76 */ val PagoEfectivo: typings.steamDashClient.steamDashClientMod.EPaymentMethod.PagoEfectivo with Double = js.native
  /* 23 */ val Pagseguro: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Pagseguro with Double = js.native
  /* 70 */ val Paloto: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Paloto with Double = js.native
  /* 38 */ val PayEasy: typings.steamDashClient.steamDashClientMod.EPaymentMethod.PayEasy with Double = js.native
  /* 38 */ val PayEasyJapan: typings.steamDashClient.steamDashClientMod.EPaymentMethod.PayEasyJapan with Double = js.native
  /* 4 */ val PayPal: typings.steamDashClient.steamDashClientMod.EPaymentMethod.PayPal with Double = js.native
  /* 6 */ val PaySafeCard: typings.steamDashClient.steamDashClientMod.EPaymentMethod.PaySafeCard with Double = js.native
  /* 46 */ val Payshop: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Payshop with Double = js.native
  /* 71 */ val PinValidda: typings.steamDashClient.steamDashClientMod.EPaymentMethod.PinValidda with Double = js.native
  /* 131 */ val Promotional: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Promotional with Double = js.native
  /* 14 */ val Qiwi: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Qiwi with Double = js.native
  /* 51 */ val SPEI: typings.steamDashClient.steamDashClientMod.EPaymentMethod.SPEI with Double = js.native
  /* 75 */ val SafetyPay: typings.steamDashClient.steamDashClientMod.EPaymentMethod.SafetyPay with Double = js.native
  /* 7 */ val Sofort: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Sofort with Double = js.native
  /* 512 */ val Split: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Split with Double = js.native
  /* 130 */ val SteamPressMaster: typings.steamDashClient.steamDashClientMod.EPaymentMethod.SteamPressMaster with Double = js.native
  /* 131 */ val StorePromotion: typings.steamDashClient.steamDashClientMod.EPaymentMethod.StorePromotion with Double = js.native
  /* 52 */ val ThreePay: typings.steamDashClient.steamDashClientMod.EPaymentMethod.ThreePay with Double = js.native
  /* 49 */ val ToditoCash: typings.steamDashClient.steamDashClientMod.EPaymentMethod.ToditoCash with Double = js.native
  /* 77 */ val Trustly: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Trustly with Double = js.native
  /* 78 */ val UnionPay: typings.steamDashClient.steamDashClientMod.EPaymentMethod.UnionPay with Double = js.native
  /* 129 */ val Valve: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Valve with Double = js.native
  /* 24 */ val VisaBrazil: typings.steamDashClient.steamDashClientMod.EPaymentMethod.VisaBrazil with Double = js.native
  /* 128 */ val Wallet: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Wallet with Double = js.native
  /* 9 */ val WebMoney: typings.steamDashClient.steamDashClientMod.EPaymentMethod.WebMoney with Double = js.native
  /* 65 */ val WebMoneyJapan: typings.steamDashClient.steamDashClientMod.EPaymentMethod.WebMoneyJapan with Double = js.native
  /* 12 */ val Yandex: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Yandex with Double = js.native
  /* 56 */ val YapiKredi: typings.steamDashClient.steamDashClientMod.EPaymentMethod.YapiKredi with Double = js.native
  /* 39 */ val Zong: typings.steamDashClient.steamDashClientMod.EPaymentMethod.Zong with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPaymentMethod with Double] = js.native
}

