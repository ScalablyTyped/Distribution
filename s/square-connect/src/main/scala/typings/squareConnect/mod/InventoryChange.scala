package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "InventoryChange")
@js.native
open class InventoryChange () extends StObject {
  
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
    * @note An `InventoryTransfer` object is read-only and can only be present in a `RetrieveInventoryChangesResponse`
    * and `BatchRetrieveInventoryChangesResponse` object.
    */
  var transfer: js.UndefOr[InventoryTransfer] = js.native
  
  /**
    * Indicates how the inventory change was applied. See `InventoryChangeType` for all possible values.
    * See [InventoryChangeType](#type-inventorychangetype) for possible values.
    */
  var `type`: js.UndefOr[InventoryType] = js.native
}
