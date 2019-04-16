package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BatchRetrieveInventoryChangesRequest")
@js.native
class BatchRetrieveInventoryChangesRequest () extends js.Object {
  /**
    * Filters results by [CatalogObject](#type-catalogobject) ID. Only applied when set. Default: unset.
    */
  var catalog_object_ids: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of
    * results for the original query. See [Pagination](/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[java.lang.String] = js.native
  /**
    * Filters results by [Location](#type-location) ID. Only applied when set. Default: unset.
    */
  var location_ids: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * Filters `ADJUSTMENT` query results by [InventoryState](#type-inventorystate). Only applied when set. Default:
    * unset.
    */
  var states: js.UndefOr[
    js.Array[
      squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.StatesEnum
    ]
  ] = js.native
  /**
    * Filters results by [InventoryChangeType](#type-inventorychangetype). Default: [`PHYSICAL_COUNT`, `ADJUSTMENT`].
    * `TRANSFER` is not supported as a filter.
    */
  var types: js.UndefOr[
    js.Array[
      squareDashConnectLib.squareDashConnectMod.BatchRetrieveInventoryChangesRequestNs.TypesEnum
    ]
  ] = js.native
  /**
    * Provided as an RFC 3339 timestamp. Returns results whose `created_at` or `calculated_at` value is after the given
    * time. Default: UNIX epoch (`1970-01-01T00:00:00Z`).
    */
  var updated_after: js.UndefOr[java.lang.String] = js.native
  /**
    * Provided as an RFC 3339 timestamp. Returns results whose `created_at` or `calculated_at` value is strictly before
    * the given time. Default: UNIX epoch (`1970-01-01T00:00:00Z`).
    */
  var updated_before: js.UndefOr[java.lang.String] = js.native
}

