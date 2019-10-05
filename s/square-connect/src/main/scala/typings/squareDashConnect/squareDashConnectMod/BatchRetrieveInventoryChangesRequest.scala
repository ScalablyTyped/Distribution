package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequest.StatesEnum
import typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequest.TypesEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BatchRetrieveInventoryChangesRequest")
@js.native
class BatchRetrieveInventoryChangesRequest () extends js.Object {
  /**
    * Filters results by [CatalogObject](#type-catalogobject) ID. Only applied when set. Default: unset.
    */
  var catalog_object_ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of
    * results for the original query. See [Pagination](/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * Filters results by [Location](#type-location) ID. Only applied when set. Default: unset.
    */
  var location_ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Filters `ADJUSTMENT` query results by [InventoryState](#type-inventorystate). Only applied when set. Default: unset.
    */
  var states: js.UndefOr[js.Array[StatesEnum]] = js.native
  /**
    * Filters results by [InventoryChangeType](#type-inventorychangetype). Default: [`PHYSICAL_COUNT`, `ADJUSTMENT`].
    * `TRANSFER` is not supported as a filter.
    */
  var types: js.UndefOr[js.Array[TypesEnum]] = js.native
  /**
    * Provided as an RFC 3339 timestamp. Returns results whose `created_at` or `calculated_at` value is after the given time.
    * Default: UNIX epoch (`1970-01-01T00:00:00Z`).
    */
  var updated_after: js.UndefOr[String] = js.native
  /**
    * Provided as an RFC 3339 timestamp. Returns results whose `created_at` or `calculated_at` value is strictly before
    * the given time. Default: UNIX epoch (`1970-01-01T00:00:00Z`).
    */
  var updated_before: js.UndefOr[String] = js.native
}

@JSImport("square-connect", "BatchRetrieveInventoryChangesRequest")
@js.native
object BatchRetrieveInventoryChangesRequest extends js.Object {
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
    
    /* "CUSTOM" */ val CUSTOM: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequest.StatesEnum.CUSTOM with String = js.native
    /* "IN_STOCK" */ val IN_STOCK: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequest.StatesEnum.IN_STOCK with String = js.native
    /* "IN_TRANSIT_TO" */ val IN_TRANSIT_TO: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequest.StatesEnum.IN_TRANSIT_TO with String = js.native
    /* "NONE" */ val NONE: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequest.StatesEnum.NONE with String = js.native
    /* "ORDERED_FROM_VENDOR" */ val ORDERED_FROM_VENDOR: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequest.StatesEnum.ORDERED_FROM_VENDOR with String = js.native
    /* "RECEIVED_FROM_VENDOR" */ val RECEIVED_FROM_VENDOR: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequest.StatesEnum.RECEIVED_FROM_VENDOR with String = js.native
    /* "RESERVED_FOR_SALE" */ val RESERVED_FOR_SALE: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequest.StatesEnum.RESERVED_FOR_SALE with String = js.native
    /* "RETURNED_BY_CUSTOMER" */ val RETURNED_BY_CUSTOMER: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequest.StatesEnum.RETURNED_BY_CUSTOMER with String = js.native
    /* "SOLD" */ val SOLD: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequest.StatesEnum.SOLD with String = js.native
    /* "SOLD_ONLINE" */ val SOLD_ONLINE: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequest.StatesEnum.SOLD_ONLINE with String = js.native
    /* "UNLINKED_RETURN" */ val UNLINKED_RETURN: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequest.StatesEnum.UNLINKED_RETURN with String = js.native
    /* "WASTE" */ val WASTE: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequest.StatesEnum.WASTE with String = js.native
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
    
    /* "ADJUSTMENT" */ val ADJUSTMENT: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequest.TypesEnum.ADJUSTMENT with String = js.native
    /* "PHYSICAL_COUNT" */ val PHYSICAL_COUNT: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequest.TypesEnum.PHYSICAL_COUNT with String = js.native
    /* "TRANSFER" */ val TRANSFER: typings.squareDashConnect.squareDashConnectMod.BatchRetrieveInventoryChangesRequest.TypesEnum.TRANSFER with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypesEnum with String] = js.native
  }
  
}

