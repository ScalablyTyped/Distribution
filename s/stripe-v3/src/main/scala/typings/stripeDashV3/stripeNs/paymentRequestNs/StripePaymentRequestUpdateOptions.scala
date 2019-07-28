package typings.stripeDashV3.stripeNs.paymentRequestNs

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
    val __obj = js.Dynamic.literal(currency = currency, total = total)
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems)
    if (shippingOptions != null) __obj.updateDynamic("shippingOptions")(shippingOptions)
    __obj.asInstanceOf[StripePaymentRequestUpdateOptions]
  }
}

