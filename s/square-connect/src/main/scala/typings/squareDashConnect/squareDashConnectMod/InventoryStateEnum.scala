package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InventoryStateEnum extends js.Object

@JSImport("square-connect", "InventoryStateEnum")
@js.native
object InventoryStateEnum extends js.Object {
  @js.native
  sealed trait CUSTOM extends InventoryStateEnum
  
  @js.native
  sealed trait IN_STOCK extends InventoryStateEnum
  
  @js.native
  sealed trait IN_TRANSIT_TO extends InventoryStateEnum
  
  @js.native
  sealed trait NONE extends InventoryStateEnum
  
  @js.native
  sealed trait ORDERED_FROM_VENDOR extends InventoryStateEnum
  
  @js.native
  sealed trait RECEIVED_FROM_VENDOR extends InventoryStateEnum
  
  @js.native
  sealed trait RESERVED_FOR_SALE extends InventoryStateEnum
  
  @js.native
  sealed trait RETURNED_BY_CUSTOMER extends InventoryStateEnum
  
  @js.native
  sealed trait SOLD extends InventoryStateEnum
  
  @js.native
  sealed trait SOLD_ONLINE extends InventoryStateEnum
  
  @js.native
  sealed trait UNLINKED_RETURN extends InventoryStateEnum
  
  @js.native
  sealed trait WASTE extends InventoryStateEnum
  
  /* "CUSTOM" */ val CUSTOM: typings.squareDashConnect.squareDashConnectMod.InventoryStateEnum.CUSTOM with String = js.native
  /* "IN_STOCK" */ val IN_STOCK: typings.squareDashConnect.squareDashConnectMod.InventoryStateEnum.IN_STOCK with String = js.native
  /* "IN_TRANSIT_TO" */ val IN_TRANSIT_TO: typings.squareDashConnect.squareDashConnectMod.InventoryStateEnum.IN_TRANSIT_TO with String = js.native
  /* "NONE" */ val NONE: typings.squareDashConnect.squareDashConnectMod.InventoryStateEnum.NONE with String = js.native
  /* "ORDERED_FROM_VENDOR" */ val ORDERED_FROM_VENDOR: typings.squareDashConnect.squareDashConnectMod.InventoryStateEnum.ORDERED_FROM_VENDOR with String = js.native
  /* "RECEIVED_FROM_VENDOR" */ val RECEIVED_FROM_VENDOR: typings.squareDashConnect.squareDashConnectMod.InventoryStateEnum.RECEIVED_FROM_VENDOR with String = js.native
  /* "RESERVED_FOR_SALE" */ val RESERVED_FOR_SALE: typings.squareDashConnect.squareDashConnectMod.InventoryStateEnum.RESERVED_FOR_SALE with String = js.native
  /* "RETURNED_BY_CUSTOMER" */ val RETURNED_BY_CUSTOMER: typings.squareDashConnect.squareDashConnectMod.InventoryStateEnum.RETURNED_BY_CUSTOMER with String = js.native
  /* "SOLD" */ val SOLD: typings.squareDashConnect.squareDashConnectMod.InventoryStateEnum.SOLD with String = js.native
  /* "SOLD_ONLINE" */ val SOLD_ONLINE: typings.squareDashConnect.squareDashConnectMod.InventoryStateEnum.SOLD_ONLINE with String = js.native
  /* "UNLINKED_RETURN" */ val UNLINKED_RETURN: typings.squareDashConnect.squareDashConnectMod.InventoryStateEnum.UNLINKED_RETURN with String = js.native
  /* "WASTE" */ val WASTE: typings.squareDashConnect.squareDashConnectMod.InventoryStateEnum.WASTE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InventoryStateEnum with String] = js.native
}

