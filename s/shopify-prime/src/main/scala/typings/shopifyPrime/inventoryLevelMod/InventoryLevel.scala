package typings.shopifyPrime.inventoryLevelMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryLevel extends ShopifyObject {
  var available: js.UndefOr[Double] = js.native
  var inventory_item_id: js.UndefOr[Double] = js.native
  var location_id: js.UndefOr[Double] = js.native
}

object InventoryLevel {
  @scala.inline
  def apply(): InventoryLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryLevel]
  }
  @scala.inline
  implicit class InventoryLevelOps[Self <: InventoryLevel] (val x: Self) extends AnyVal {
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
    def setAvailable(value: Double): Self = this.set("available", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailable: Self = this.set("available", js.undefined)
    @scala.inline
    def setInventory_item_id(value: Double): Self = this.set("inventory_item_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInventory_item_id: Self = this.set("inventory_item_id", js.undefined)
    @scala.inline
    def setLocation_id(value: Double): Self = this.set("location_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation_id: Self = this.set("location_id", js.undefined)
  }
  
}

