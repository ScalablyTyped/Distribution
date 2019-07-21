package typings
package stripeDashV3Lib.stripeNs.paymentRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripePaymentMethodPaymentResponse extends StripePaymentResponse {
  var paymentMethod: stripeDashV3Lib.stripeNs.paymentMethodNs.PaymentMethod
}

object StripePaymentMethodPaymentResponse {
  @scala.inline
  def apply(
    complete: java.lang.String => scala.Unit,
    methodName: java.lang.String,
    paymentMethod: stripeDashV3Lib.stripeNs.paymentMethodNs.PaymentMethod,
    payerEmail: java.lang.String = null,
    payerName: java.lang.String = null,
    payerPhone: java.lang.String = null,
    shippingAddress: ShippingAddress = null,
    shippingOption: ShippingOption = null
  ): StripePaymentMethodPaymentResponse = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), methodName = methodName, paymentMethod = paymentMethod)
    if (payerEmail != null) __obj.updateDynamic("payerEmail")(payerEmail)
    if (payerName != null) __obj.updateDynamic("payerName")(payerName)
    if (payerPhone != null) __obj.updateDynamic("payerPhone")(payerPhone)
    if (shippingAddress != null) __obj.updateDynamic("shippingAddress")(shippingAddress)
    if (shippingOption != null) __obj.updateDynamic("shippingOption")(shippingOption)
    __obj.asInstanceOf[StripePaymentMethodPaymentResponse]
  }
}

