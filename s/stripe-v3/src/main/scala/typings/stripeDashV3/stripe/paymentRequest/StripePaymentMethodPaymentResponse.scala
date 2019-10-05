package typings.stripeDashV3.stripe.paymentRequest

import typings.stripeDashV3.stripe.paymentMethod.PaymentMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripePaymentMethodPaymentResponse extends StripePaymentResponse {
  var paymentMethod: PaymentMethod
}

object StripePaymentMethodPaymentResponse {
  @scala.inline
  def apply(
    complete: String => Unit,
    methodName: String,
    paymentMethod: PaymentMethod,
    payerEmail: String = null,
    payerName: String = null,
    payerPhone: String = null,
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

