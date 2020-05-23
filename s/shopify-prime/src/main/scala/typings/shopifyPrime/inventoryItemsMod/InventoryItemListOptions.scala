package typings.shopifyPrime.inventoryItemsMod

import typings.shopifyPrime.optionsBaseMod.BasicListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItemListOptions extends BasicListOptions {
  /**
    * Show only certain inventory items, specified by a comma-seperated list of IDs..
    */
  var ids: String
}

object InventoryItemListOptions {
  @scala.inline
  def apply(ids: String, limit: js.UndefOr[Double] = js.undefined, page: js.UndefOr[Double] = js.undefined): InventoryItemListOptions = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryItemListOptions]
  }
}

