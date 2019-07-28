package typings.stripeDashV3.stripeNs.paymentRequestNs

import typings.stripeDashV3.stripeNs.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeTokenPaymentResponse extends StripePaymentResponse {
  var token: Token
}

object StripeTokenPaymentResponse {
  @scala.inline
  def apply(
    complete: String => Unit,
    methodName: String,
    token: Token,
    payerEmail: String = null,
    payerName: String = null,
    payerPhone: String = null,
    shippingAddress: ShippingAddress = null,
    shippingOption: ShippingOption = null
  ): StripeTokenPaymentResponse = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), methodName = methodName, token = token)
    if (payerEmail != null) __obj.updateDynamic("payerEmail")(payerEmail)
    if (payerName != null) __obj.updateDynamic("payerName")(payerName)
    if (payerPhone != null) __obj.updateDynamic("payerPhone")(payerPhone)
    if (shippingAddress != null) __obj.updateDynamic("shippingAddress")(shippingAddress)
    if (shippingOption != null) __obj.updateDynamic("shippingOption")(shippingOption)
    __obj.asInstanceOf[StripeTokenPaymentResponse]
  }
}

