package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderFulfillment")
@js.native
object OrderFulfillmentNs extends js.Object {
  @js.native
  sealed trait StateEnum extends js.Object
  
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  object StateEnum extends js.Object {
    @js.native
    sealed trait CANCELED
      extends squareDashConnectLib.squareDashConnectMod.OrderFulfillmentNs.StateEnum
    
    @js.native
    sealed trait COMPLETED
      extends squareDashConnectLib.squareDashConnectMod.OrderFulfillmentNs.StateEnum
    
    @js.native
    sealed trait FAILED
      extends squareDashConnectLib.squareDashConnectMod.OrderFulfillmentNs.StateEnum
    
    @js.native
    sealed trait PREPARED
      extends squareDashConnectLib.squareDashConnectMod.OrderFulfillmentNs.StateEnum
    
    @js.native
    sealed trait PROPOSED
      extends squareDashConnectLib.squareDashConnectMod.OrderFulfillmentNs.StateEnum
    
    @js.native
    sealed trait RESERVED
      extends squareDashConnectLib.squareDashConnectMod.OrderFulfillmentNs.StateEnum
    
    /* "CANCELED" */ val CANCELED: CANCELED with java.lang.String = js.native
    /* "COMPLETED" */ val COMPLETED: COMPLETED with java.lang.String = js.native
    /* "FAILED" */ val FAILED: FAILED with java.lang.String = js.native
    /* "PREPARED" */ val PREPARED: PREPARED with java.lang.String = js.native
    /* "PROPOSED" */ val PROPOSED: PROPOSED with java.lang.String = js.native
    /* "RESERVED" */ val RESERVED: RESERVED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.OrderFulfillmentNs.StateEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait PICKUP
      extends squareDashConnectLib.squareDashConnectMod.OrderFulfillmentNs.TypeEnum
    
    /* "PICKUP" */ val PICKUP: PICKUP with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.OrderFulfillmentNs.TypeEnum with java.lang.String
      ] = js.native
  }
  
}

