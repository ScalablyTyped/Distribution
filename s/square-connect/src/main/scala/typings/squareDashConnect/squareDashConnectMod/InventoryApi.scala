package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "InventoryApi")
@js.native
class InventoryApi () extends js.Object {
  /**
    * Applies adjustments and counts to the provided item quantities.
    * On success: returns the current calculated counts for all objects referenced in the request.
    * On failure: returns a list of related errors.
    */
  def batchChangeInventory(args: js.Any*): js.Promise[BatchChangeInventoryResponse] = js.native
  /**
    * Returns historical physical counts and adjustments based on the provided filter criteria.
    * Results are paginated and sorted in ascending order according their `occurred_at` timestamp (oldest first).
    * BatchRetrieveInventoryChanges is a catch-all query endpoint for queries that cannot be handled by other, simpler endpoints.
    */
  def batchRetrieveInventoryChanges(args: js.Any*): js.Promise[BatchRetrieveInventoryChangesResponse] = js.native
  /**
    * Returns current counts for the provided [CatalogObject](#type-catalogobject)s at the requested [Location](#type-location)s.
    * Results are paginated and sorted in descending order according to their `calculated_at` timestamp (newest first).
    * When `updated_after` is specified, only counts that have changed since that time (based on the server timestamp for
    * the most recent change) are returned. This allows clients to perform a "sync" operation, for example in response to
    * receiving a Webhook notification.
    */
  def batchRetrieveInventoryCounts(args: js.Any*): js.Promise[BatchRetrieveInventoryCountsResponse] = js.native
  /**
    * Returns the [InventoryAdjustment](#type-inventoryadjustment) object with the provided `adjustment_id`.
    */
  def retrieveInventoryAdjustment(args: js.Any*): js.Promise[RetrieveInventoryAdjustmentResponse] = js.native
  /**
    * Returns a set of physical counts and inventory adjustments for the provided [CatalogObject](#type-catalogobject) at the
    * requested [Location](#type-location)s. Results are paginated and sorted in descending order according to their
    * `occurred_at` timestamp (newest first). There are no limits on how far back the caller can page.
    * This endpoint is useful when displaying recent changes for a specific item. For more sophisticated queries,
    * use a batch endpoint.
    */
  def retrieveInventoryChanges(args: js.Any*): js.Promise[RetrieveInventoryChangesResponse] = js.native
  /**
    * Retrieves the current calculated stock count for a given [CatalogObject](#type-catalogobject) at a given set
    * of [Location](#type-location)s. Responses are paginated and unsorted. For more sophisticated queries, use a batch endpoint.
    */
  def retrieveInventoryCount(args: js.Any*): js.Promise[RetrieveInventoryCountResponse] = js.native
  /**
    * Returns the [InventoryPhysicalCount](#type-inventoryphysicalcount) object with the provided `physical_count_id`.
    */
  def retrieveInventoryPhysicalCount(args: js.Any*): js.Promise[RetrieveInventoryPhysicalCountResponse] = js.native
}

