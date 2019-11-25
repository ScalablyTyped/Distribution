package typings.stripeDashV3.stripe.paymentRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripePaymentRequestUpdateOptions extends js.Object {
  var currency: String
  var displayItems: js.UndefOr[js.Array[DisplayItem]] = js.undefined
  var shippingOptions: js.UndefOr[js.Array[ShippingOption]] = js.undefined
  var total: DisplayItem
}

object StripePaymentRequestUpdateOptions {
  @scala.inline
  def apply(
    currency: String,
    total: DisplayItem,
    displayItems: js.Array[DisplayItem] = null,
    shippingOptions: js.Array[ShippingOption] = null
  ): StripePaymentRequestUpdateOptions = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems.asInstanceOf[js.Any])
    if (shippingOptions != null) __obj.updateDynamic("shippingOptions")(shippingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripePaymentRequestUpdateOptions]
  }
}

