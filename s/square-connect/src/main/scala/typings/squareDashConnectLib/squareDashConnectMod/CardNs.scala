package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Card")
@js.native
object CardNs extends js.Object {
  @js.native
  sealed trait CardBrandEnum extends js.Object
  
  @js.native
  object CardBrandEnum extends js.Object {
    @js.native
    sealed trait AMERICAN_EXPRESS
      extends squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum
    
    @js.native
    sealed trait CHINA_UNIONPAY
      extends squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum
    
    @js.native
    sealed trait DISCOVER
      extends squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum
    
    @js.native
    sealed trait DISCOVER_DINERS
      extends squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum
    
    @js.native
    sealed trait JCB
      extends squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum
    
    @js.native
    sealed trait MASTERCARD
      extends squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum
    
    @js.native
    sealed trait OTHER_BRAND
      extends squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum
    
    @js.native
    sealed trait SQUARE_GIFT_CARD
      extends squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum
    
    @js.native
    sealed trait VISA
      extends squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum
    
    /* "AMERICAN_EXPRESS" */ val AMERICAN_EXPRESS: AMERICAN_EXPRESS with java.lang.String = js.native
    /* "CHINA_UNIONPAY" */ val CHINA_UNIONPAY: CHINA_UNIONPAY with java.lang.String = js.native
    /* "DISCOVER" */ val DISCOVER: DISCOVER with java.lang.String = js.native
    /* "DISCOVER_DINERS" */ val DISCOVER_DINERS: DISCOVER_DINERS with java.lang.String = js.native
    /* "JCB" */ val JCB: JCB with java.lang.String = js.native
    /* "MASTERCARD" */ val MASTERCARD: MASTERCARD with java.lang.String = js.native
    /* "OTHER_BRAND" */ val OTHER_BRAND: OTHER_BRAND with java.lang.String = js.native
    /* "SQUARE_GIFT_CARD" */ val SQUARE_GIFT_CARD: SQUARE_GIFT_CARD with java.lang.String = js.native
    /* "VISA" */ val VISA: VISA with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum with java.lang.String
      ] = js.native
  }
  
}

