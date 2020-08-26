package typings.shopifyPrime.inventoryItemsMod

import typings.shopifyPrime.optionsBaseMod.BasicListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryItemListOptions extends BasicListOptions {
  /**
    * Show only certain inventory items, specified by a comma-seperated list of IDs..
    */
  var ids: String = js.native
}

object InventoryItemListOptions {
  @scala.inline
  def apply(ids: String): InventoryItemListOptions = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryItemListOptions]
  }
  @scala.inline
  implicit class InventoryItemListOptionsOps[Self <: InventoryItemListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIds(value: String): Self = this.set("ids", value.asInstanceOf[js.Any])
  }
  
}

