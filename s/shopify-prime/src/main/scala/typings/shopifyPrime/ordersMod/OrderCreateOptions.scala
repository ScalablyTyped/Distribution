package typings.shopifyPrime.ordersMod

import typings.shopifyPrime.inventoryBehaviorMod.InventoryBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderCreateOptions extends js.Object {
  var inventory_behavior: js.UndefOr[InventoryBehavior] = js.native
  var send_fulfillment_receipt: js.UndefOr[Boolean] = js.native
  var send_receipt: js.UndefOr[Boolean] = js.native
}

object OrderCreateOptions {
  @scala.inline
  def apply(): OrderCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderCreateOptions]
  }
  @scala.inline
  implicit class OrderCreateOptionsOps[Self <: OrderCreateOptions] (val x: Self) extends AnyVal {
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
    def setInventory_behavior(value: InventoryBehavior): Self = this.set("inventory_behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInventory_behavior: Self = this.set("inventory_behavior", js.undefined)
    @scala.inline
    def setSend_fulfillment_receipt(value: Boolean): Self = this.set("send_fulfillment_receipt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSend_fulfillment_receipt: Self = this.set("send_fulfillment_receipt", js.undefined)
    @scala.inline
    def setSend_receipt(value: Boolean): Self = this.set("send_receipt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSend_receipt: Self = this.set("send_receipt", js.undefined)
  }
  
}

