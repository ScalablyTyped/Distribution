package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "InventoryChange")
@js.native
class InventoryChange () extends js.Object {
  /**
    * Contains details about the inventory adjustment when `type` is `ADJUSTMENT` and unset for all other types.
    */
  var adjustment: js.UndefOr[InventoryAdjustment] = js.native
  /**
    * Contains details about the physical count when `type` is `PHYSICAL_COUNT` and unset for all other types.
    */
  var physical_count: js.UndefOr[InventoryPhysicalCount] = js.native
  /**
    * Contains details about the inventory transfer when `type` is `TRANSFER` and unset for all other types.
    */
  var transfer: js.UndefOr[InventoryTransfer] = js.native
  /**
    * Indicates how the inventory change was applied.
    * See [InventoryChangeType](#type-inventorychangetype) for possible values.
    */
  var `type`: js.UndefOr[InventoryType] = js.native
}

