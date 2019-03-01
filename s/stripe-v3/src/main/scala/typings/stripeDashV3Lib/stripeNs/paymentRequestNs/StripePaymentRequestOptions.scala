package typings
package stripeDashV3Lib.stripeNs.paymentRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripePaymentRequestOptions extends StripePaymentRequestUpdateOptions {
  var country: java.lang.String
  var requestPayerEmail: js.UndefOr[scala.Boolean] = js.undefined
  var requestPayerName: js.UndefOr[scala.Boolean] = js.undefined
  var requestPayerPhone: js.UndefOr[scala.Boolean] = js.undefined
  var requestShipping: js.UndefOr[scala.Boolean] = js.undefined
}

object StripePaymentRequestOptions {
  @scala.inline
  def apply(
    country: java.lang.String,
    currency: java.lang.String,
    total: DisplayItem,
    displayItems: js.Array[DisplayItem] = null,
    requestPayerEmail: js.UndefOr[scala.Boolean] = js.undefined,
    requestPayerName: js.UndefOr[scala.Boolean] = js.undefined,
    requestPayerPhone: js.UndefOr[scala.Boolean] = js.undefined,
    requestShipping: js.UndefOr[scala.Boolean] = js.undefined,
    shippingOptions: js.Array[ShippingOption] = null
  ): StripePaymentRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("currency")(currency)
    __obj.updateDynamic("total")(total)
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems)
    if (!js.isUndefined(requestPayerEmail)) __obj.updateDynamic("requestPayerEmail")(requestPayerEmail)
    if (!js.isUndefined(requestPayerName)) __obj.updateDynamic("requestPayerName")(requestPayerName)
    if (!js.isUndefined(requestPayerPhone)) __obj.updateDynamic("requestPayerPhone")(requestPayerPhone)
    if (!js.isUndefined(requestShipping)) __obj.updateDynamic("requestShipping")(requestShipping)
    if (shippingOptions != null) __obj.updateDynamic("shippingOptions")(shippingOptions)
    __obj.asInstanceOf[StripePaymentRequestOptions]
  }
}

