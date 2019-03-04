package typings
package shopifyDashPrimeLib.distOptionsInventoryUnderscoreItemsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItemListOptions
  extends shopifyDashPrimeLib.distOptionsBaseMod.BasicListOptions {
  /**
    * Show only certain inventory items, specified by a comma-seperated list of IDs..
    */
  var ids: java.lang.String
}

object InventoryItemListOptions {
  @scala.inline
  def apply(
    ids: java.lang.String,
    limit: scala.Int | scala.Double = null,
    page: scala.Int | scala.Double = null
  ): InventoryItemListOptions = {
    val __obj = js.Dynamic.literal(ids = ids)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryItemListOptions]
  }
}

