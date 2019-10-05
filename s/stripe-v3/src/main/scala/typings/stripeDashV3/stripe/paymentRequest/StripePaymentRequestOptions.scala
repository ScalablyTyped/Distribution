package typings.stripeDashV3.stripe.paymentRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripePaymentRequestOptions extends StripePaymentRequestUpdateOptions {
  var country: String
  var requestPayerEmail: js.UndefOr[Boolean] = js.undefined
  var requestPayerName: js.UndefOr[Boolean] = js.undefined
  var requestPayerPhone: js.UndefOr[Boolean] = js.undefined
  var requestShipping: js.UndefOr[Boolean] = js.undefined
}

object StripePaymentRequestOptions {
  @scala.inline
  def apply(
    country: String,
    currency: String,
    total: DisplayItem,
    displayItems: js.Array[DisplayItem] = null,
    requestPayerEmail: js.UndefOr[Boolean] = js.undefined,
    requestPayerName: js.UndefOr[Boolean] = js.undefined,
    requestPayerPhone: js.UndefOr[Boolean] = js.undefined,
    requestShipping: js.UndefOr[Boolean] = js.undefined,
    shippingOptions: js.Array[ShippingOption] = null
  ): StripePaymentRequestOptions = {
    val __obj = js.Dynamic.literal(country = country, currency = currency, total = total)
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems)
    if (!js.isUndefined(requestPayerEmail)) __obj.updateDynamic("requestPayerEmail")(requestPayerEmail)
    if (!js.isUndefined(requestPayerName)) __obj.updateDynamic("requestPayerName")(requestPayerName)
    if (!js.isUndefined(requestPayerPhone)) __obj.updateDynamic("requestPayerPhone")(requestPayerPhone)
    if (!js.isUndefined(requestShipping)) __obj.updateDynamic("requestShipping")(requestShipping)
    if (shippingOptions != null) __obj.updateDynamic("shippingOptions")(shippingOptions)
    __obj.asInstanceOf[StripePaymentRequestOptions]
  }
}

