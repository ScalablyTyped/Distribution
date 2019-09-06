package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CardBrandEnum extends js.Object

@JSImport("square-connect", "CardBrandEnum")
@js.native
object CardBrandEnum extends js.Object {
  @js.native
  sealed trait AMERICAN_EXPRESS extends CardBrandEnum
  
  @js.native
  sealed trait CHINA_UNIONPAY extends CardBrandEnum
  
  @js.native
  sealed trait DISCOVER extends CardBrandEnum
  
  @js.native
  sealed trait DISCOVER_DINERS extends CardBrandEnum
  
  @js.native
  sealed trait JCB extends CardBrandEnum
  
  @js.native
  sealed trait MASTERCARD extends CardBrandEnum
  
  @js.native
  sealed trait OTHER_BRAND extends CardBrandEnum
  
  @js.native
  sealed trait SQUARE_GIFT_CARD extends CardBrandEnum
  
  @js.native
  sealed trait VISA extends CardBrandEnum
  
  /* "AMERICAN_EXPRESS" */ val AMERICAN_EXPRESS: typings.squareDashConnect.squareDashConnectMod.CardBrandEnum.AMERICAN_EXPRESS with String = js.native
  /* "CHINA_UNIONPAY" */ val CHINA_UNIONPAY: typings.squareDashConnect.squareDashConnectMod.CardBrandEnum.CHINA_UNIONPAY with String = js.native
  /* "DISCOVER" */ val DISCOVER: typings.squareDashConnect.squareDashConnectMod.CardBrandEnum.DISCOVER with String = js.native
  /* "DISCOVER_DINERS" */ val DISCOVER_DINERS: typings.squareDashConnect.squareDashConnectMod.CardBrandEnum.DISCOVER_DINERS with String = js.native
  /* "JCB" */ val JCB: typings.squareDashConnect.squareDashConnectMod.CardBrandEnum.JCB with String = js.native
  /* "MASTERCARD" */ val MASTERCARD: typings.squareDashConnect.squareDashConnectMod.CardBrandEnum.MASTERCARD with String = js.native
  /* "OTHER_BRAND" */ val OTHER_BRAND: typings.squareDashConnect.squareDashConnectMod.CardBrandEnum.OTHER_BRAND with String = js.native
  /* "SQUARE_GIFT_CARD" */ val SQUARE_GIFT_CARD: typings.squareDashConnect.squareDashConnectMod.CardBrandEnum.SQUARE_GIFT_CARD with String = js.native
  /* "VISA" */ val VISA: typings.squareDashConnect.squareDashConnectMod.CardBrandEnum.VISA with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CardBrandEnum with String] = js.native
}

