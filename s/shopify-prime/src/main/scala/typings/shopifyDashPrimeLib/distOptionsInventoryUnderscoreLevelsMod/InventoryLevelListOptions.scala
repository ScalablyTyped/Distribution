package typings
package shopifyDashPrimeLib.distOptionsInventoryUnderscoreLevelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryLevelListOptions
  extends shopifyDashPrimeLib.distOptionsBaseMod.BasicListOptions {
  /**
    * A comma-separated list of inventory item IDs.
    */
  var inventory_item_ids: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A comma-separated list of location IDs.
    */
  var location_ids: js.UndefOr[java.lang.String] = js.undefined
}

object InventoryLevelListOptions {
  @scala.inline
  def apply(
    inventory_item_ids: java.lang.String = null,
    limit: scala.Int | scala.Double = null,
    location_ids: java.lang.String = null,
    page: scala.Int | scala.Double = null
  ): InventoryLevelListOptions = {
    val __obj = js.Dynamic.literal()
    if (inventory_item_ids != null) __obj.updateDynamic("inventory_item_ids")(inventory_item_ids)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (location_ids != null) __obj.updateDynamic("location_ids")(location_ids)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryLevelListOptions]
  }
}

