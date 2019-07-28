package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.InventoryTransferNs.StateEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "InventoryTransfer")
@js.native
object InventoryTransferNs extends js.Object {
  @js.native
  sealed trait StateEnum extends js.Object
  
  @js.native
  object StateEnum extends js.Object {
    @js.native
    sealed trait CUSTOM extends StateEnum
    
    @js.native
    sealed trait IN_STOCK extends StateEnum
    
    @js.native
    sealed trait IN_TRANSIT_TO extends StateEnum
    
    @js.native
    sealed trait NONE extends StateEnum
    
    @js.native
    sealed trait ORDERED_FROM_VENDOR extends StateEnum
    
    @js.native
    sealed trait RECEIVED_FROM_VENDOR extends StateEnum
    
    @js.native
    sealed trait RESERVED_FOR_SALE extends StateEnum
    
    @js.native
    sealed trait RETURNED_BY_CUSTOMER extends StateEnum
    
    @js.native
    sealed trait SOLD extends StateEnum
    
    @js.native
    sealed trait SOLD_ONLINE extends StateEnum
    
    @js.native
    sealed trait UNLINKED_RETURN extends StateEnum
    
    @js.native
    sealed trait WASTE extends StateEnum
    
    /* "CUSTOM" */ val CUSTOM: typings.squareDashConnect.squareDashConnectMod.InventoryTransferNs.StateEnum.CUSTOM with String = js.native
    /* "IN_STOCK" */ val IN_STOCK: typings.squareDashConnect.squareDashConnectMod.InventoryTransferNs.StateEnum.IN_STOCK with String = js.native
    /* "IN_TRANSIT_TO" */ val IN_TRANSIT_TO: typings.squareDashConnect.squareDashConnectMod.InventoryTransferNs.StateEnum.IN_TRANSIT_TO with String = js.native
    /* "NONE" */ val NONE: typings.squareDashConnect.squareDashConnectMod.InventoryTransferNs.StateEnum.NONE with String = js.native
    /* "ORDERED_FROM_VENDOR" */ val ORDERED_FROM_VENDOR: typings.squareDashConnect.squareDashConnectMod.InventoryTransferNs.StateEnum.ORDERED_FROM_VENDOR with String = js.native
    /* "RECEIVED_FROM_VENDOR" */ val RECEIVED_FROM_VENDOR: typings.squareDashConnect.squareDashConnectMod.InventoryTransferNs.StateEnum.RECEIVED_FROM_VENDOR with String = js.native
    /* "RESERVED_FOR_SALE" */ val RESERVED_FOR_SALE: typings.squareDashConnect.squareDashConnectMod.InventoryTransferNs.StateEnum.RESERVED_FOR_SALE with String = js.native
    /* "RETURNED_BY_CUSTOMER" */ val RETURNED_BY_CUSTOMER: typings.squareDashConnect.squareDashConnectMod.InventoryTransferNs.StateEnum.RETURNED_BY_CUSTOMER with String = js.native
    /* "SOLD" */ val SOLD: typings.squareDashConnect.squareDashConnectMod.InventoryTransferNs.StateEnum.SOLD with String = js.native
    /* "SOLD_ONLINE" */ val SOLD_ONLINE: typings.squareDashConnect.squareDashConnectMod.InventoryTransferNs.StateEnum.SOLD_ONLINE with String = js.native
    /* "UNLINKED_RETURN" */ val UNLINKED_RETURN: typings.squareDashConnect.squareDashConnectMod.InventoryTransferNs.StateEnum.UNLINKED_RETURN with String = js.native
    /* "WASTE" */ val WASTE: typings.squareDashConnect.squareDashConnectMod.InventoryTransferNs.StateEnum.WASTE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StateEnum with String] = js.native
  }
  
}

