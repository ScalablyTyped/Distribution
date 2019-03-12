package typings
package stripeDashV3Lib.stripeNs.paymentRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeSourcePaymentResponse extends StripePaymentResponse {
  var source: stripeDashV3Lib.stripeNs.Source
}

object StripeSourcePaymentResponse {
  @scala.inline
  def apply(
    complete: java.lang.String => scala.Unit,
    methodName: java.lang.String,
    source: stripeDashV3Lib.stripeNs.Source,
    payerEmail: java.lang.String = null,
    payerName: java.lang.String = null,
    payerPhone: java.lang.String = null,
    shippingAddress: ShippingAddress = null,
    shippingOption: ShippingOption = null
  ): StripeSourcePaymentResponse = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), methodName = methodName, source = source)
    if (payerEmail != null) __obj.updateDynamic("payerEmail")(payerEmail)
    if (payerName != null) __obj.updateDynamic("payerName")(payerName)
    if (payerPhone != null) __obj.updateDynamic("payerPhone")(payerPhone)
    if (shippingAddress != null) __obj.updateDynamic("shippingAddress")(shippingAddress)
    if (shippingOption != null) __obj.updateDynamic("shippingOption")(shippingOption)
    __obj.asInstanceOf[StripeSourcePaymentResponse]
  }
}

