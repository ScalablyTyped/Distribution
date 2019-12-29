package typings.shopifyDashPrime

import typings.shopifyDashPrime.distInfrastructureMod.BaseService
import typings.shopifyDashPrime.distModelsInventoryUnderscoreLevelMod.InventoryLevel
import typings.shopifyDashPrime.distOptionsInventoryUnderscoreLevelsMod.InventoryLevelListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/inventory_levels", JSImport.Namespace)
@js.native
object distServicesInventoryUnderscoreLevelsMod extends js.Object {
  @js.native
  class InventoryLevels protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Adjusts the inventory level of an inventory item at a single location.
      * @param options Options for adjusting an inventory level.
      */
    def adjust(inventoryItemId: Double, locationId: Double, availableAdjustment: Double): js.Promise[Unit] = js.native
    /**
      * Connects an inventory item to a location by creating an inventory level at that location.
      * @param inventoryItemId Id of the inventory item.
      * @param locationId Id of the location being retrieved.
      * @param options Options for connecting an inventory level.
      */
    def connect(inventoryItemId: Double, locationId: Double): js.Promise[Unit] = js.native
    def connect(inventoryItemId: Double, locationId: Double, options: Anon_Relocateifnecessary): js.Promise[Unit] = js.native
    /**
      * Deletes an inventory level of an inventory item at a location.
      * @param inventoryItemId Id of the inventory item.
      * @param locationId Id of the location being retrieved.
      */
    def delete(inventoryItemId: Double, locationId: Double): js.Promise[Unit] = js.native
    /**
      * Gets a list of up to 250 of the shop's inventory levels.
      * @param options Options for filtering the result.
      */
    def list(): js.Promise[js.Array[InventoryLevel]] = js.native
    def list(options: InventoryLevelListOptions): js.Promise[js.Array[InventoryLevel]] = js.native
    /**
      * Sets the inventory level for an inventory item at a location.
      * @param inventoryLevel Inventory level being set.
      * @param options Options for adjusting an inventory level.
      */
    def set(inventoryLevel: InventoryLevel): js.Promise[Unit] = js.native
    def set(inventoryLevel: InventoryLevel, options: Anon_Disconnectifnecessary): js.Promise[Unit] = js.native
  }
  
  @js.native
  class default protected () extends InventoryLevels {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

