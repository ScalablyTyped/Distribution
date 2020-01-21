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
  def apply(ids: String, limit: Int | Double = null, page: Int | Double = null): InventoryItemListOptions = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryItemListOptions]
  }
}

