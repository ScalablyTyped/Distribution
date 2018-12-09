package typings
package shopifyDashPrimeLib.distServicesInventoryUnderscoreLevelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/inventory_levels", "InventoryLevels")
@js.native
class InventoryLevels protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
       * Adjusts the inventory level of an inventory item at a single location.
       * @param options Options for adjusting an inventory level.
       */
  def adjust(inventoryItemId: scala.Double, locationId: scala.Double, availableAdjustment: scala.Double): js.Promise[scala.Unit] = js.native
  /**
       * Connects an inventory item to a location by creating an inventory level at that location.
       * @param inventoryItemId Id of the inventory item.
       * @param locationId Id of the location being retrieved.
       * @param options Options for connecting an inventory level.
       */
  def connect(inventoryItemId: scala.Double, locationId: scala.Double): js.Promise[scala.Unit] = js.native
  /**
       * Connects an inventory item to a location by creating an inventory level at that location.
       * @param inventoryItemId Id of the inventory item.
       * @param locationId Id of the location being retrieved.
       * @param options Options for connecting an inventory level.
       */
  def connect(
    inventoryItemId: scala.Double,
    locationId: scala.Double,
    options: shopifyDashPrimeLib.Anon_Relocateifnecessary
  ): js.Promise[scala.Unit] = js.native
  /**
       * Deletes an inventory level of an inventory item at a location.
       * @param inventoryItemId Id of the inventory item.
       * @param locationId Id of the location being retrieved.
       */
  def delete(inventoryItemId: scala.Double, locationId: scala.Double): js.Promise[scala.Unit] = js.native
  /**
       * Gets a list of up to 250 of the shop's inventory levels.
       * @param options Options for filtering the result.
       */
  def list(): js.Promise[
    js.Array[shopifyDashPrimeLib.distModelsInventoryUnderscoreLevelMod.InventoryLevel]
  ] = js.native
  /**
       * Gets a list of up to 250 of the shop's inventory levels.
       * @param options Options for filtering the result.
       */
  def list(options: shopifyDashPrimeLib.distOptionsInventoryUnderscoreLevelsMod.InventoryLevelListOptions): js.Promise[
    js.Array[shopifyDashPrimeLib.distModelsInventoryUnderscoreLevelMod.InventoryLevel]
  ] = js.native
  /**
       * Sets the inventory level for an inventory item at a location.
       * @param inventoryLevel Inventory level being set.
       * @param options Options for adjusting an inventory level.
       */
  def set(inventoryLevel: shopifyDashPrimeLib.distModelsInventoryUnderscoreLevelMod.InventoryLevel): js.Promise[scala.Unit] = js.native
  /**
       * Sets the inventory level for an inventory item at a location.
       * @param inventoryLevel Inventory level being set.
       * @param options Options for adjusting an inventory level.
       */
  def set(
    inventoryLevel: shopifyDashPrimeLib.distModelsInventoryUnderscoreLevelMod.InventoryLevel,
    options: shopifyDashPrimeLib.Anon_Disconnectifnecessary
  ): js.Promise[scala.Unit] = js.native
}

