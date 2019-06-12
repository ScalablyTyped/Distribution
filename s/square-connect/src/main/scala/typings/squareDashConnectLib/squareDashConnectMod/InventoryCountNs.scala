package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "InventoryCount")
@js.native
object InventoryCountNs extends js.Object {
  @js.native
  sealed trait StateEnum extends js.Object
  
  @js.native
  object StateEnum extends js.Object {
    @js.native
    sealed trait CUSTOM
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait IN_STOCK
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait IN_TRANSIT_TO
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait NONE
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait ORDERED_FROM_VENDOR
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait RECEIVED_FROM_VENDOR
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait RESERVED_FOR_SALE
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait RETURNED_BY_CUSTOMER
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait SOLD
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait SOLD_ONLINE
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait UNLINKED_RETURN
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait WASTE
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
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
        squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum with java.lang.String
      ] = js.native
  }
  
}

