package typings
package stripeDashV3Lib.stripeNs.paymentRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripePaymentResponse extends js.Object {
  var methodName: java.lang.String
  var payerEmail: js.UndefOr[java.lang.String] = js.undefined
  var payerName: js.UndefOr[java.lang.String] = js.undefined
  var payerPhone: js.UndefOr[java.lang.String] = js.undefined
  var shippingAddress: js.UndefOr[ShippingAddress] = js.undefined
  var shippingOption: js.UndefOr[ShippingOption] = js.undefined
  def complete(status: java.lang.String): scala.Unit
}

object StripePaymentResponse {
  @scala.inline
  def apply(
    complete: java.lang.String => scala.Unit,
    methodName: java.lang.String,
    payerEmail: java.lang.String = null,
    payerName: java.lang.String = null,
    payerPhone: java.lang.String = null,
    shippingAddress: ShippingAddress = null,
    shippingOption: ShippingOption = null
  ): StripePaymentResponse = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), methodName = methodName)
    if (payerEmail != null) __obj.updateDynamic("payerEmail")(payerEmail)
    if (payerName != null) __obj.updateDynamic("payerName")(payerName)
    if (payerPhone != null) __obj.updateDynamic("payerPhone")(payerPhone)
    if (shippingAddress != null) __obj.updateDynamic("shippingAddress")(shippingAddress)
    if (shippingOption != null) __obj.updateDynamic("shippingOption")(shippingOption)
    __obj.asInstanceOf[StripePaymentResponse]
  }
}

