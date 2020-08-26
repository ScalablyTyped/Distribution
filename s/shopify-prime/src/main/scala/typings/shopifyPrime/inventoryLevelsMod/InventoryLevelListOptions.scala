package typings.shopifyPrime.inventoryLevelsMod

import typings.shopifyPrime.optionsBaseMod.BasicListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryLevelListOptions extends BasicListOptions {
  /**
    * A comma-separated list of inventory item IDs.
    */
  var inventory_item_ids: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of location IDs.
    */
  var location_ids: js.UndefOr[String] = js.native
}

object InventoryLevelListOptions {
  @scala.inline
  def apply(): InventoryLevelListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryLevelListOptions]
  }
  @scala.inline
  implicit class InventoryLevelListOptionsOps[Self <: InventoryLevelListOptions] (val x: Self) extends AnyVal {
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
    def setInventory_item_ids(value: String): Self = this.set("inventory_item_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInventory_item_ids: Self = this.set("inventory_item_ids", js.undefined)
    @scala.inline
    def setLocation_ids(value: String): Self = this.set("location_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation_ids: Self = this.set("location_ids", js.undefined)
  }
  
}

