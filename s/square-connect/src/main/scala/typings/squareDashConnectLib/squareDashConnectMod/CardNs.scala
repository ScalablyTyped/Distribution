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
    sealed trait AMERICANEXPRESS
      extends squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum
    
    @js.native
    sealed trait CHINAUNIONPAY
      extends squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum
    
    @js.native
    sealed trait DISCOVER
      extends squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum
    
    @js.native
    sealed trait DISCOVERDINERS
      extends squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum
    
    @js.native
    sealed trait JCB
      extends squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum
    
    @js.native
    sealed trait MASTERCARD
      extends squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum
    
    @js.native
    sealed trait OTHERBRAND
      extends squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum
    
    @js.native
    sealed trait SQUAREGIFTCARD
      extends squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum
    
    @js.native
    sealed trait VISA
      extends squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum
    
    /* "AMERICAN_EXPRESS" */ val AMERICANEXPRESS: AMERICANEXPRESS with java.lang.String = js.native
    /* "CHINA_UNIONPAY" */ val CHINAUNIONPAY: CHINAUNIONPAY with java.lang.String = js.native
    /* "DISCOVER" */ val DISCOVER: DISCOVER with java.lang.String = js.native
    /* "DISCOVER_DINERS" */ val DISCOVERDINERS: DISCOVERDINERS with java.lang.String = js.native
    /* "JCB" */ val JCB: JCB with java.lang.String = js.native
    /* "MASTERCARD" */ val MASTERCARD: MASTERCARD with java.lang.String = js.native
    /* "OTHER_BRAND" */ val OTHERBRAND: OTHERBRAND with java.lang.String = js.native
    /* "SQUARE_GIFT_CARD" */ val SQUAREGIFTCARD: SQUAREGIFTCARD with java.lang.String = js.native
    /* "VISA" */ val VISA: VISA with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.CardNs.CardBrandEnum with java.lang.String
      ] = js.native
  }
  
}

