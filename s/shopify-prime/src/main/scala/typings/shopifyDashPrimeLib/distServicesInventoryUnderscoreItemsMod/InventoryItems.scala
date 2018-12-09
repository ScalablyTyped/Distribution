package typings
package shopifyDashPrimeLib.distServicesInventoryUnderscoreItemsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/inventory_items", "InventoryItems")
@js.native
class InventoryItems protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
       * Gets a inventory item with the given id.
       * @param id Id of the inventory item being retrieved.
       * @param options Options for filtering the result.
       */
  def get(id: scala.Double): js.Promise[stdLib.Location] = js.native
  /**
       * Gets a inventory item with the given id.
       * @param id Id of the inventory item being retrieved.
       * @param options Options for filtering the result.
       */
  def get(id: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): js.Promise[stdLib.Location] = js.native
  /**
       * Gets a list of up to 250 of the shop's inventory items.
       * @param options Options for filtering the result.
       */
  def list(options: shopifyDashPrimeLib.distOptionsInventoryUnderscoreItemsMod.InventoryItemListOptions): js.Promise[js.Array[shopifyDashPrimeLib.distModelsInventoryUnderscoreItemMod.InventoryItem]] = js.native
  /**
       * Updates an inventory item with the given id.
       * @param id The inventory items's id.
       * @param inventoryItem The updated inventory item.
       */
  def update(
    id: scala.Double,
    inventoryItem: shopifyDashPrimeLib.distModelsInventoryUnderscoreItemMod.InventoryItem
  ): js.Promise[shopifyDashPrimeLib.distModelsInventoryUnderscoreItemMod.InventoryItem] = js.native
}

