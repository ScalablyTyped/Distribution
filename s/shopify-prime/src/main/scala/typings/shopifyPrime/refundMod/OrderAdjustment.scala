package typings.shopifyPrime.refundMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderAdjustment extends ShopifyObject {
  var amount: String = js.native
  var kind: String = js.native
  var order_id: js.Any = js.native
  var reason: String = js.native
  var refund_id: Double = js.native
  var tax_amount: String = js.native
}

object OrderAdjustment {
  @scala.inline
  def apply(
    amount: String,
    kind: String,
    order_id: js.Any,
    reason: String,
    refund_id: Double,
    tax_amount: String
  ): OrderAdjustment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], order_id = order_id.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], refund_id = refund_id.asInstanceOf[js.Any], tax_amount = tax_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderAdjustment]
  }
  @scala.inline
  implicit class OrderAdjustmentOps[Self <: OrderAdjustment] (val x: Self) extends AnyVal {
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
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder_id(value: js.Any): Self = this.set("order_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefund_id(value: Double): Self = this.set("refund_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTax_amount(value: String): Self = this.set("tax_amount", value.asInstanceOf[js.Any])
  }
  
}

