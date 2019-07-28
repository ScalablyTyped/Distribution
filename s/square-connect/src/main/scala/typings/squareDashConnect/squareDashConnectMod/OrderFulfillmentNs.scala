package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.OrderFulfillmentNs.StateEnum
import typings.squareDashConnect.squareDashConnectMod.OrderFulfillmentNs.TypeEnum
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
    sealed trait CANCELED extends StateEnum
    
    @js.native
    sealed trait COMPLETED extends StateEnum
    
    @js.native
    sealed trait FAILED extends StateEnum
    
    @js.native
    sealed trait PREPARED extends StateEnum
    
    @js.native
    sealed trait PROPOSED extends StateEnum
    
    @js.native
    sealed trait RESERVED extends StateEnum
    
    /* "CANCELED" */ val CANCELED: typings.squareDashConnect.squareDashConnectMod.OrderFulfillmentNs.StateEnum.CANCELED with String = js.native
    /* "COMPLETED" */ val COMPLETED: typings.squareDashConnect.squareDashConnectMod.OrderFulfillmentNs.StateEnum.COMPLETED with String = js.native
    /* "FAILED" */ val FAILED: typings.squareDashConnect.squareDashConnectMod.OrderFulfillmentNs.StateEnum.FAILED with String = js.native
    /* "PREPARED" */ val PREPARED: typings.squareDashConnect.squareDashConnectMod.OrderFulfillmentNs.StateEnum.PREPARED with String = js.native
    /* "PROPOSED" */ val PROPOSED: typings.squareDashConnect.squareDashConnectMod.OrderFulfillmentNs.StateEnum.PROPOSED with String = js.native
    /* "RESERVED" */ val RESERVED: typings.squareDashConnect.squareDashConnectMod.OrderFulfillmentNs.StateEnum.RESERVED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StateEnum with String] = js.native
  }
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait PICKUP extends TypeEnum
    
    /* "PICKUP" */ val PICKUP: typings.squareDashConnect.squareDashConnectMod.OrderFulfillmentNs.TypeEnum.PICKUP with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypeEnum with String] = js.native
  }
  
}

