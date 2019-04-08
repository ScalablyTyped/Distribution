package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Tender")
@js.native
object TenderNs extends js.Object {
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait CARD
      extends squareDashConnectLib.squareDashConnectMod.TenderNs.TypeEnum
    
    @js.native
    sealed trait CASH
      extends squareDashConnectLib.squareDashConnectMod.TenderNs.TypeEnum
    
    @js.native
    sealed trait NOSALE
      extends squareDashConnectLib.squareDashConnectMod.TenderNs.TypeEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.TenderNs.TypeEnum
    
    @js.native
    sealed trait SQUAREGIFTCARD
      extends squareDashConnectLib.squareDashConnectMod.TenderNs.TypeEnum
    
    @js.native
    sealed trait THIRDPARTYCARD
      extends squareDashConnectLib.squareDashConnectMod.TenderNs.TypeEnum
    
    /* "CARD" */ val CARD: CARD with java.lang.String = js.native
    /* "CASH" */ val CASH: CASH with java.lang.String = js.native
    /* "NO_SALE" */ val NOSALE: NOSALE with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    /* "SQUARE_GIFT_CARD" */ val SQUAREGIFTCARD: SQUAREGIFTCARD with java.lang.String = js.native
    /* "THIRD_PARTY_CARD" */ val THIRDPARTYCARD: THIRDPARTYCARD with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.TenderNs.TypeEnum with java.lang.String
      ] = js.native
  }
  
}

