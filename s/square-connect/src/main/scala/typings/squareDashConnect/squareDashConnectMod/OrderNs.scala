package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.OrderNs.StateEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Order")
@js.native
object OrderNs extends js.Object {
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
    
    /* "CANCELED" */ val CANCELED: typings.squareDashConnect.squareDashConnectMod.OrderNs.StateEnum.CANCELED with String = js.native
    /* "COMPLETED" */ val COMPLETED: typings.squareDashConnect.squareDashConnectMod.OrderNs.StateEnum.COMPLETED with String = js.native
    /* "OPEN" */ val OPEN: typings.squareDashConnect.squareDashConnectMod.OrderNs.StateEnum.OPEN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StateEnum with String] = js.native
  }
  
}

