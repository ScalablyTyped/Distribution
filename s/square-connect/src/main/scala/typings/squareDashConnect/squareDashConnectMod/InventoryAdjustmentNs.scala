package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.FromStateEnum
import typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.ToStateEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "InventoryAdjustment")
@js.native
object InventoryAdjustmentNs extends js.Object {
  @js.native
  sealed trait FromStateEnum extends js.Object
  
  @js.native
  sealed trait ToStateEnum extends js.Object
  
  @js.native
  object FromStateEnum extends js.Object {
    @js.native
    sealed trait CUSTOM extends FromStateEnum
    
    @js.native
    sealed trait IN_STOCK extends FromStateEnum
    
    @js.native
    sealed trait IN_TRANSIT_TO extends FromStateEnum
    
    @js.native
    sealed trait NONE extends FromStateEnum
    
    @js.native
    sealed trait ORDERED_FROM_VENDOR extends FromStateEnum
    
    @js.native
    sealed trait RECEIVED_FROM_VENDOR extends FromStateEnum
    
    @js.native
    sealed trait RESERVED_FOR_SALE extends FromStateEnum
    
    @js.native
    sealed trait RETURNED_BY_CUSTOMER extends FromStateEnum
    
    @js.native
    sealed trait SOLD extends FromStateEnum
    
    @js.native
    sealed trait SOLD_ONLINE extends FromStateEnum
    
    @js.native
    sealed trait UNLINKED_RETURN extends FromStateEnum
    
    @js.native
    sealed trait WASTE extends FromStateEnum
    
    /* "CUSTOM" */ val CUSTOM: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.FromStateEnum.CUSTOM with String = js.native
    /* "IN_STOCK" */ val IN_STOCK: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.FromStateEnum.IN_STOCK with String = js.native
    /* "IN_TRANSIT_TO" */ val IN_TRANSIT_TO: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.FromStateEnum.IN_TRANSIT_TO with String = js.native
    /* "NONE" */ val NONE: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.FromStateEnum.NONE with String = js.native
    /* "ORDERED_FROM_VENDOR" */ val ORDERED_FROM_VENDOR: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.FromStateEnum.ORDERED_FROM_VENDOR with String = js.native
    /* "RECEIVED_FROM_VENDOR" */ val RECEIVED_FROM_VENDOR: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.FromStateEnum.RECEIVED_FROM_VENDOR with String = js.native
    /* "RESERVED_FOR_SALE" */ val RESERVED_FOR_SALE: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.FromStateEnum.RESERVED_FOR_SALE with String = js.native
    /* "RETURNED_BY_CUSTOMER" */ val RETURNED_BY_CUSTOMER: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.FromStateEnum.RETURNED_BY_CUSTOMER with String = js.native
    /* "SOLD" */ val SOLD: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.FromStateEnum.SOLD with String = js.native
    /* "SOLD_ONLINE" */ val SOLD_ONLINE: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.FromStateEnum.SOLD_ONLINE with String = js.native
    /* "UNLINKED_RETURN" */ val UNLINKED_RETURN: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.FromStateEnum.UNLINKED_RETURN with String = js.native
    /* "WASTE" */ val WASTE: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.FromStateEnum.WASTE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FromStateEnum with String] = js.native
  }
  
  @js.native
  object ToStateEnum extends js.Object {
    @js.native
    sealed trait CUSTOM extends ToStateEnum
    
    @js.native
    sealed trait IN_STOCK extends ToStateEnum
    
    @js.native
    sealed trait IN_TRANSIT_TO extends ToStateEnum
    
    @js.native
    sealed trait NONE extends ToStateEnum
    
    @js.native
    sealed trait ORDERED_FROM_VENDOR extends ToStateEnum
    
    @js.native
    sealed trait RECEIVED_FROM_VENDOR extends ToStateEnum
    
    @js.native
    sealed trait RESERVED_FOR_SALE extends ToStateEnum
    
    @js.native
    sealed trait RETURNED_BY_CUSTOMER extends ToStateEnum
    
    @js.native
    sealed trait SOLD extends ToStateEnum
    
    @js.native
    sealed trait SOLD_ONLINE extends ToStateEnum
    
    @js.native
    sealed trait UNLINKED_RETURN extends ToStateEnum
    
    @js.native
    sealed trait WASTE extends ToStateEnum
    
    /* "CUSTOM" */ val CUSTOM: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.ToStateEnum.CUSTOM with String = js.native
    /* "IN_STOCK" */ val IN_STOCK: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.ToStateEnum.IN_STOCK with String = js.native
    /* "IN_TRANSIT_TO" */ val IN_TRANSIT_TO: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.ToStateEnum.IN_TRANSIT_TO with String = js.native
    /* "NONE" */ val NONE: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.ToStateEnum.NONE with String = js.native
    /* "ORDERED_FROM_VENDOR" */ val ORDERED_FROM_VENDOR: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.ToStateEnum.ORDERED_FROM_VENDOR with String = js.native
    /* "RECEIVED_FROM_VENDOR" */ val RECEIVED_FROM_VENDOR: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.ToStateEnum.RECEIVED_FROM_VENDOR with String = js.native
    /* "RESERVED_FOR_SALE" */ val RESERVED_FOR_SALE: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.ToStateEnum.RESERVED_FOR_SALE with String = js.native
    /* "RETURNED_BY_CUSTOMER" */ val RETURNED_BY_CUSTOMER: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.ToStateEnum.RETURNED_BY_CUSTOMER with String = js.native
    /* "SOLD" */ val SOLD: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.ToStateEnum.SOLD with String = js.native
    /* "SOLD_ONLINE" */ val SOLD_ONLINE: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.ToStateEnum.SOLD_ONLINE with String = js.native
    /* "UNLINKED_RETURN" */ val UNLINKED_RETURN: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.ToStateEnum.UNLINKED_RETURN with String = js.native
    /* "WASTE" */ val WASTE: typings.squareDashConnect.squareDashConnectMod.InventoryAdjustmentNs.ToStateEnum.WASTE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ToStateEnum with String] = js.native
  }
  
}

