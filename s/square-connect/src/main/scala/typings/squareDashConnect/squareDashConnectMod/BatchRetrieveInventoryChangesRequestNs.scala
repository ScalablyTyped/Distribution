package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
import typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.TypesEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BatchRetrieveInventoryChangesRequest")
@js.native
object BatchRetrieveInventoryChangesRequestNs extends js.Object {
  @js.native
  sealed trait StatesEnum extends js.Object
  
  @js.native
  sealed trait TypesEnum extends js.Object
  
  @js.native
  object StatesEnum extends js.Object {
    @js.native
    sealed trait CUSTOM extends StatesEnum
    
    @js.native
    sealed trait IN_STOCK extends StatesEnum
    
    @js.native
    sealed trait IN_TRANSIT_TO extends StatesEnum
    
    @js.native
    sealed trait NONE extends StatesEnum
    
    @js.native
    sealed trait ORDERED_FROM_VENDOR extends StatesEnum
    
    @js.native
    sealed trait RECEIVED_FROM_VENDOR extends StatesEnum
    
    @js.native
    sealed trait RESERVED_FOR_SALE extends StatesEnum
    
    @js.native
    sealed trait RETURNED_BY_CUSTOMER extends StatesEnum
    
    @js.native
    sealed trait SOLD extends StatesEnum
    
    @js.native
    sealed trait SOLD_ONLINE extends StatesEnum
    
    @js.native
    sealed trait UNLINKED_RETURN extends StatesEnum
    
    @js.native
    sealed trait WASTE extends StatesEnum
    
    /* "CUSTOM" */ val CUSTOM: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum.CUSTOM with String = js.native
    /* "IN_STOCK" */ val IN_STOCK: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum.IN_STOCK with String = js.native
    /* "IN_TRANSIT_TO" */ val IN_TRANSIT_TO: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum.IN_TRANSIT_TO with String = js.native
    /* "NONE" */ val NONE: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum.NONE with String = js.native
    /* "ORDERED_FROM_VENDOR" */ val ORDERED_FROM_VENDOR: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum.ORDERED_FROM_VENDOR with String = js.native
    /* "RECEIVED_FROM_VENDOR" */ val RECEIVED_FROM_VENDOR: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum.RECEIVED_FROM_VENDOR with String = js.native
    /* "RESERVED_FOR_SALE" */ val RESERVED_FOR_SALE: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum.RESERVED_FOR_SALE with String = js.native
    /* "RETURNED_BY_CUSTOMER" */ val RETURNED_BY_CUSTOMER: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum.RETURNED_BY_CUSTOMER with String = js.native
    /* "SOLD" */ val SOLD: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum.SOLD with String = js.native
    /* "SOLD_ONLINE" */ val SOLD_ONLINE: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum.SOLD_ONLINE with String = js.native
    /* "UNLINKED_RETURN" */ val UNLINKED_RETURN: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum.UNLINKED_RETURN with String = js.native
    /* "WASTE" */ val WASTE: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum.WASTE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StatesEnum with String] = js.native
  }
  
  @js.native
  object TypesEnum extends js.Object {
    @js.native
    sealed trait ADJUSTMENT extends TypesEnum
    
    @js.native
    sealed trait PHYSICAL_COUNT extends TypesEnum
    
    @js.native
    sealed trait TRANSFER extends TypesEnum
    
    /* "ADJUSTMENT" */ val ADJUSTMENT: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.TypesEnum.ADJUSTMENT with String = js.native
    /* "PHYSICAL_COUNT" */ val PHYSICAL_COUNT: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.TypesEnum.PHYSICAL_COUNT with String = js.native
    /* "TRANSFER" */ val TRANSFER: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.TypesEnum.TRANSFER with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypesEnum with String] = js.native
  }
  
}

