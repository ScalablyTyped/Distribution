package typings.shopifyPrime.inventoryLevelsMod

import typings.shopifyPrime.optionsBaseMod.BasicListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryLevelListOptions extends BasicListOptions {
  /**
    * A comma-separated list of inventory item IDs.
    */
  var inventory_item_ids: js.UndefOr[String] = js.undefined
  /**
    * A comma-separated list of location IDs.
    */
  var location_ids: js.UndefOr[String] = js.undefined
}

object InventoryLevelListOptions {
  @scala.inline
  def apply(
    inventory_item_ids: String = null,
    limit: js.UndefOr[Double] = js.undefined,
    location_ids: String = null,
    page: js.UndefOr[Double] = js.undefined
  ): InventoryLevelListOptions = {
    val __obj = js.Dynamic.literal()
    if (inventory_item_ids != null) __obj.updateDynamic("inventory_item_ids")(inventory_item_ids.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (location_ids != null) __obj.updateDynamic("location_ids")(location_ids.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryLevelListOptions]
  }
}

