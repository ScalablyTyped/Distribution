package typings.shopifyPrime.ordersMod

import typings.shopifyPrime.orderCancelReasonMod.OrderCancelReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderCancelOptions extends js.Object {
  /**
    * Amount to refund. If set, Shopify will attempt to void/refund the payment depending on the status.
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * Whether Shopify should send an email to the customer notifying them of the cancellation.
    */
  var email: js.UndefOr[Boolean] = js.native
  /**
    * The reason for the order cancellation.
    */
  var reason: js.UndefOr[OrderCancelReason] = js.native
  /**
    * Required for some more complex refund situations.
    */
  var refund: js.UndefOr[js.Any] = js.native
  /**
    * Restock the items for this order back to your store.
    */
  var restock: js.UndefOr[Boolean] = js.native
}

object OrderCancelOptions {
  @scala.inline
  def apply(): OrderCancelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderCancelOptions]
  }
  @scala.inline
  implicit class OrderCancelOptionsOps[Self <: OrderCancelOptions] (val x: Self) extends AnyVal {
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setEmail(value: Boolean): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setReason(value: OrderCancelReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setRefund(value: js.Any): Self = this.set("refund", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefund: Self = this.set("refund", js.undefined)
    @scala.inline
    def setRestock(value: Boolean): Self = this.set("restock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestock: Self = this.set("restock", js.undefined)
  }
  
}

