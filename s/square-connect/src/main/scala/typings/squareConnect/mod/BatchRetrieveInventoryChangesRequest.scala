package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "BatchRetrieveInventoryChangesRequest")
@js.native
class BatchRetrieveInventoryChangesRequest () extends StObject {
  
  /**
    * The filter to return results by `CatalogObject` ID. The filter is only applicable when set. The default value is null.
    */
  var catalog_object_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A pagination cursor returned by a previous call to this endpoint.
    * Provide this to retrieve the next set of results for the original query.
    * See the [Pagination](https://developer.squareup.com/docs/working-with-apis/pagination) guide for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The filter to return results by `Location` ID. The filter is only applicable when set. The default value is null.
    */
  var location_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The filter to return `ADJUSTMENT` query results by `InventoryState`. This filter is only applied when set.
    * The default value is null. See [InventoryState](#type-inventorystate) for possible values.
    */
  var states: js.UndefOr[js.Array[InventoryStateType]] = js.native
  
  /**
    * The filter to return results by `InventoryChangeType` values other than `TRANSFER`.
    * The default value is `[PHYSICAL_COUNT, ADJUSTMENT]`. See [InventoryChangeType](#type-inventorychangetype) for possible values.
    */
  var types: js.UndefOr[js.Array[InventoryType]] = js.native
  
  /**
    * The filter to return results with their `calculated_at` value after the given time as specified in an RFC 3339 timestamp.
    * The default value is the UNIX epoch of (`1970-01-01T00:00:00Z`).
    */
  var updated_after: js.UndefOr[String] = js.native
  
  /**
    * The filter to return results with their `created_at` or `calculated_at` value strictly before the given time as specified in an RFC 3339 timestamp.
    * The default value is the UNIX epoch of (`1970-01-01T00:00:00Z`).
    */
  var updated_before: js.UndefOr[String] = js.native
}
