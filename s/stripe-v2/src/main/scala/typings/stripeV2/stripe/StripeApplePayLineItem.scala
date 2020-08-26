package typings.stripeV2.stripe

import typings.stripeV2.stripeV2Strings.`final`
import typings.stripeV2.stripeV2Strings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/reference/applepayjs/1916082-applepay_js_data_types
@js.native
trait StripeApplePayLineItem extends js.Object {
  var amount: Double = js.native
  var label: String = js.native
  var `type`: pending | `final` = js.native
}

object StripeApplePayLineItem {
  @scala.inline
  def apply(amount: Double, label: String, `type`: pending | `final`): StripeApplePayLineItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeApplePayLineItem]
  }
  @scala.inline
  implicit class StripeApplePayLineItemOps[Self <: StripeApplePayLineItem] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: pending | `final`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

