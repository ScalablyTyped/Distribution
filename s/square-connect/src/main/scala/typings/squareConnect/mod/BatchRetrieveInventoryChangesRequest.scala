package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BatchRetrieveInventoryChangesRequest")
@js.native
class BatchRetrieveInventoryChangesRequest () extends js.Object {
  /**
    * Filters results by `CatalogObject` ID. Only applied when set. Default: unset.
    */
  var catalog_object_ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * A pagination cursor returned by a previous call to this endpoint.
    * Provide this to retrieve the next set of results for the original query.
    * See the [Pagination](https://developer.squareup.com/docs/working-with-apis/pagination) guide for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * Filters results by `Location` ID. Only applied when set. Default: unset.
    */
  var location_ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Filters `ADJUSTMENT` query results by `InventoryState`. Only applied when set. Default: unset.
    * See [InventoryState](#type-inventorystate) for possible values
    */
  var states: js.UndefOr[js.Array[InventoryStateType]] = js.native
  /**
    * Filters results by `InventoryChangeType`. Default: [`PHYSICAL_COUNT`, `ADJUSTMENT`].
    * `TRANSFER` is not supported as a filter. See [InventoryChangeType](#type-inventorychangetype) for possible values.
    */
  var types: js.UndefOr[js.Array[InventoryType]] = js.native
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

