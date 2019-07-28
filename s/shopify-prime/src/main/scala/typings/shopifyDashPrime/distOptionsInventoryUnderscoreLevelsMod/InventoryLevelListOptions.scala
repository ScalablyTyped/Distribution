package typings.shopifyDashPrime.distOptionsInventoryUnderscoreLevelsMod

import typings.shopifyDashPrime.distOptionsBaseMod.BasicListOptions
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
    limit: Int | Double = null,
    location_ids: String = null,
    page: Int | Double = null
  ): InventoryLevelListOptions = {
    val __obj = js.Dynamic.literal()
    if (inventory_item_ids != null) __obj.updateDynamic("inventory_item_ids")(inventory_item_ids)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (location_ids != null) __obj.updateDynamic("location_ids")(location_ids)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryLevelListOptions]
  }
}

