package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait CANCEL
      extends squareDashConnectLib.squareDashConnectMod.V1UpdateOrderRequestNs.ActionEnum
    
    @js.native
    sealed trait COMPLETE
      extends squareDashConnectLib.squareDashConnectMod.V1UpdateOrderRequestNs.ActionEnum
    
    @js.native
    sealed trait REFUND
      extends squareDashConnectLib.squareDashConnectMod.V1UpdateOrderRequestNs.ActionEnum
    
    /* "CANCEL" */ val CANCEL: CANCEL with java.lang.String = js.native
    /* "COMPLETE" */ val COMPLETE: COMPLETE with java.lang.String = js.native
    /* "REFUND" */ val REFUND: REFUND with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1UpdateOrderRequestNs.ActionEnum with java.lang.String
      ] = js.native
  }
  
}

