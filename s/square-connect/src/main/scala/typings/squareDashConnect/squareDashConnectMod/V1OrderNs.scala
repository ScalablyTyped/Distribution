package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1OrderNs.StateEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Order")
@js.native
object V1OrderNs extends js.Object {
  @js.native
  sealed trait StateEnum extends js.Object
  
  @js.native
  object StateEnum extends js.Object {
    @js.native
    sealed trait CANCELED extends StateEnum
    
    @js.native
    sealed trait COMPLETED extends StateEnum
    
    @js.native
    sealed trait OPEN extends StateEnum
    
    @js.native
    sealed trait PENDING extends StateEnum
    
    @js.native
    sealed trait REFUNDED extends StateEnum
    
    @js.native
    sealed trait REJECTED extends StateEnum
    
    /* "CANCELED" */ val CANCELED: typings.squareDashConnect.squareDashConnectMod.V1OrderNs.StateEnum.CANCELED with String = js.native
    /* "COMPLETED" */ val COMPLETED: typings.squareDashConnect.squareDashConnectMod.V1OrderNs.StateEnum.COMPLETED with String = js.native
    /* "OPEN" */ val OPEN: typings.squareDashConnect.squareDashConnectMod.V1OrderNs.StateEnum.OPEN with String = js.native
    /* "PENDING" */ val PENDING: typings.squareDashConnect.squareDashConnectMod.V1OrderNs.StateEnum.PENDING with String = js.native
    /* "REFUNDED" */ val REFUNDED: typings.squareDashConnect.squareDashConnectMod.V1OrderNs.StateEnum.REFUNDED with String = js.native
    /* "REJECTED" */ val REJECTED: typings.squareDashConnect.squareDashConnectMod.V1OrderNs.StateEnum.REJECTED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StateEnum with String] = js.native
  }
  
}

