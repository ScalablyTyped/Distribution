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
    sealed trait INSTOCK
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait INTRANSITTO
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait NONE
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait ORDEREDFROMVENDOR
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait RECEIVEDFROMVENDOR
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait RESERVEDFORSALE
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait RETURNEDBYCUSTOMER
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait SOLD
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait SOLDONLINE
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait UNLINKEDRETURN
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
    @js.native
    sealed trait WASTE
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    
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
        squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object TypesEnum extends js.Object {
    @js.native
    sealed trait ADJUSTMENT
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.TypesEnum
    
    @js.native
    sealed trait PHYSICALCOUNT
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.TypesEnum
    
    @js.native
    sealed trait TRANSFER
      extends squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.TypesEnum
    
    /* "ADJUSTMENT" */ val ADJUSTMENT: ADJUSTMENT with java.lang.String = js.native
    /* "PHYSICAL_COUNT" */ val PHYSICALCOUNT: PHYSICALCOUNT with java.lang.String = js.native
    /* "TRANSFER" */ val TRANSFER: TRANSFER with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.TypesEnum with java.lang.String
      ] = js.native
  }
  
}

