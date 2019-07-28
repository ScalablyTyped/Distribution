package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1UpdateOrderRequestNs.ActionEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1UpdateOrderRequest")
@js.native
object V1UpdateOrderRequestNs extends js.Object {
  @js.native
  sealed trait ActionEnum extends js.Object
  
  @js.native
  object ActionEnum extends js.Object {
    @js.native
    sealed trait CANCEL extends ActionEnum
    
    @js.native
    sealed trait COMPLETE extends ActionEnum
    
    @js.native
    sealed trait REFUND extends ActionEnum
    
    /* "CANCEL" */ val CANCEL: typings.squareDashConnect.squareDashConnectMod.V1UpdateOrderRequestNs.ActionEnum.CANCEL with String = js.native
    /* "COMPLETE" */ val COMPLETE: typings.squareDashConnect.squareDashConnectMod.V1UpdateOrderRequestNs.ActionEnum.COMPLETE with String = js.native
    /* "REFUND" */ val REFUND: typings.squareDashConnect.squareDashConnectMod.V1UpdateOrderRequestNs.ActionEnum.REFUND with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ActionEnum with String] = js.native
  }
  
}

