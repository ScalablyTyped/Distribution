package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "BatchRetrieveInventoryCountsRequest")
@js.native
class BatchRetrieveInventoryCountsRequest () extends StObject {
  
  /**
    * The filter to return results by `CatalogObject` ID. The filter is applicable only when set. The default is null.
    */
  var catalog_object_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A pagination cursor returned by a previous call to this endpoint.
    * Provide this to retrieve the next set of results for the original query.
    * See the [Pagination](https://developer.squareup.com/docs/working-with-apis/pagination) guide for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The filter to return results by `Location` ID. This filter is applicable only when set. The default is null.
    */
  var location_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The filter to return results by `InventoryState`. The filter is only applicable when set.
    * Ignored are untracked states of `NONE`, `SOLD`, and `UNLINKED_RETURN`. The default is null.
    * See [InventoryState](#type-inventorystate) for possible values.
    */
  var states: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The filter to return results with their `calculated_at` value  after the given time as specified in an RFC 3339 timestamp.
    * The default value is the UNIX epoch of (`1970-01-01T00:00:00Z`).
    */
  var updated_after: js.UndefOr[String] = js.native
}
