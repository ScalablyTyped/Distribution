package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait CUSTOM
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait IN_STOCK
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait IN_TRANSIT_TO
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait NONE
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait ORDERED_FROM_VENDOR
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait RECEIVED_FROM_VENDOR
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait RESERVED_FOR_SALE
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait RETURNED_BY_CUSTOMER
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait SOLD
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait SOLD_ONLINE
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait UNLINKED_RETURN
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait WASTE
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    /* "CUSTOM" */ val CUSTOM: CUSTOM with java.lang.String = js.native
    /* "IN_STOCK" */ val IN_STOCK: IN_STOCK with java.lang.String = js.native
    /* "IN_TRANSIT_TO" */ val IN_TRANSIT_TO: IN_TRANSIT_TO with java.lang.String = js.native
    /* "NONE" */ val NONE: NONE with java.lang.String = js.native
    /* "ORDERED_FROM_VENDOR" */ val ORDERED_FROM_VENDOR: ORDERED_FROM_VENDOR with java.lang.String = js.native
    /* "RECEIVED_FROM_VENDOR" */ val RECEIVED_FROM_VENDOR: RECEIVED_FROM_VENDOR with java.lang.String = js.native
    /* "RESERVED_FOR_SALE" */ val RESERVED_FOR_SALE: RESERVED_FOR_SALE with java.lang.String = js.native
    /* "RETURNED_BY_CUSTOMER" */ val RETURNED_BY_CUSTOMER: RETURNED_BY_CUSTOMER with java.lang.String = js.native
    /* "SOLD" */ val SOLD: SOLD with java.lang.String = js.native
    /* "SOLD_ONLINE" */ val SOLD_ONLINE: SOLD_ONLINE with java.lang.String = js.native
    /* "UNLINKED_RETURN" */ val UNLINKED_RETURN: UNLINKED_RETURN with java.lang.String = js.native
    /* "WASTE" */ val WASTE: WASTE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object TypesEnum extends js.Object {
    @js.native
    sealed trait ADJUSTMENT
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.TypesEnum
    
    @js.native
    sealed trait PHYSICAL_COUNT
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.TypesEnum
    
    @js.native
    sealed trait TRANSFER
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.TypesEnum
    
    /* "ADJUSTMENT" */ val ADJUSTMENT: ADJUSTMENT with java.lang.String = js.native
    /* "PHYSICAL_COUNT" */ val PHYSICAL_COUNT: PHYSICAL_COUNT with java.lang.String = js.native
    /* "TRANSFER" */ val TRANSFER: TRANSFER with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.TypesEnum with java.lang.String
      ] = js.native
  }
  
}

