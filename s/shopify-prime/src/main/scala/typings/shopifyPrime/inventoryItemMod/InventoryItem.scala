package typings.shopifyPrime.inventoryItemMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryItem extends ShopifyObject {
  var created_at: js.UndefOr[String] = js.native
  var sku: js.UndefOr[String] = js.native
  var tracked: js.UndefOr[Boolean] = js.native
  var updated_at: js.UndefOr[Double] = js.native
}

object InventoryItem {
  @scala.inline
  def apply(): InventoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryItem]
  }
  @scala.inline
  implicit class InventoryItemOps[Self <: InventoryItem] (val x: Self) extends AnyVal {
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
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setSku(value: String): Self = this.set("sku", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSku: Self = this.set("sku", js.undefined)
    @scala.inline
    def setTracked(value: Boolean): Self = this.set("tracked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracked: Self = this.set("tracked", js.undefined)
    @scala.inline
    def setUpdated_at(value: Double): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
  }
  
}

