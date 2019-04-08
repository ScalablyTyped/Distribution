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
    sealed trait INSTOCK
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait INTRANSITTO
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait NONE
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait ORDEREDFROMVENDOR
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait RECEIVEDFROMVENDOR
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait RESERVEDFORSALE
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait RETURNEDBYCUSTOMER
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait SOLD
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait SOLDONLINE
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait UNLINKEDRETURN
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    @js.native
    sealed trait WASTE
      extends squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum
    
    /* "CUSTOM" */ val CUSTOM: CUSTOM with java.lang.String = js.native
    /* "IN_STOCK" */ val INSTOCK: INSTOCK with java.lang.String = js.native
    /* "IN_TRANSIT_TO" */ val INTRANSITTO: INTRANSITTO with java.lang.String = js.native
    /* "NONE" */ val NONE: NONE with java.lang.String = js.native
    /* "ORDERED_FROM_VENDOR" */ val ORDEREDFROMVENDOR: ORDEREDFROMVENDOR with java.lang.String = js.native
    /* "RECEIVED_FROM_VENDOR" */ val RECEIVEDFROMVENDOR: RECEIVEDFROMVENDOR with java.lang.String = js.native
    /* "RESERVED_FOR_SALE" */ val RESERVEDFORSALE: RESERVEDFORSALE with java.lang.String = js.native
    /* "RETURNED_BY_CUSTOMER" */ val RETURNEDBYCUSTOMER: RETURNEDBYCUSTOMER with java.lang.String = js.native
    /* "SOLD" */ val SOLD: SOLD with java.lang.String = js.native
    /* "SOLD_ONLINE" */ val SOLDONLINE: SOLDONLINE with java.lang.String = js.native
    /* "UNLINKED_RETURN" */ val UNLINKEDRETURN: UNLINKEDRETURN with java.lang.String = js.native
    /* "WASTE" */ val WASTE: WASTE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.InventoryCountNs.StateEnum with java.lang.String
      ] = js.native
  }
  
}

