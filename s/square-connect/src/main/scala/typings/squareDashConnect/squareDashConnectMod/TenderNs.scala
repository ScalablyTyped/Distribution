package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.TenderNs.TypeEnum
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
    sealed trait CARD extends TypeEnum
    
    @js.native
    sealed trait CASH extends TypeEnum
    
    @js.native
    sealed trait NO_SALE extends TypeEnum
    
    @js.native
    sealed trait OTHER extends TypeEnum
    
    @js.native
    sealed trait SQUARE_GIFT_CARD extends TypeEnum
    
    @js.native
    sealed trait THIRD_PARTY_CARD extends TypeEnum
    
    /* "CARD" */ val CARD: typings.squareDashConnect.squareDashConnectMod.TenderNs.TypeEnum.CARD with String = js.native
    /* "CASH" */ val CASH: typings.squareDashConnect.squareDashConnectMod.TenderNs.TypeEnum.CASH with String = js.native
    /* "NO_SALE" */ val NO_SALE: typings.squareDashConnect.squareDashConnectMod.TenderNs.TypeEnum.NO_SALE with String = js.native
    /* "OTHER" */ val OTHER: typings.squareDashConnect.squareDashConnectMod.TenderNs.TypeEnum.OTHER with String = js.native
    /* "SQUARE_GIFT_CARD" */ val SQUARE_GIFT_CARD: typings.squareDashConnect.squareDashConnectMod.TenderNs.TypeEnum.SQUARE_GIFT_CARD with String = js.native
    /* "THIRD_PARTY_CARD" */ val THIRD_PARTY_CARD: typings.squareDashConnect.squareDashConnectMod.TenderNs.TypeEnum.THIRD_PARTY_CARD with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypeEnum with String] = js.native
  }
  
}

