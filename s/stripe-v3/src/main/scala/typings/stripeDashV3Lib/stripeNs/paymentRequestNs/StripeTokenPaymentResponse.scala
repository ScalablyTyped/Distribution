package typings
package stripeDashV3Lib.stripeNs.paymentRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeTokenPaymentResponse extends StripePaymentResponse {
  var token: stripeDashV3Lib.stripeNs.Token
}

object StripeTokenPaymentResponse {
  @scala.inline
  def apply(
    complete: js.Function1[java.lang.String, scala.Unit],
    methodName: java.lang.String,
    token: stripeDashV3Lib.stripeNs.Token,
    payerEmail: java.lang.String = null,
    payerName: java.lang.String = null,
    payerPhone: java.lang.String = null,
    shippingAddress: ShippingAddress = null,
    shippingOption: ShippingOption = null
  ): StripeTokenPaymentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete)
    __obj.updateDynamic("methodName")(methodName)
    __obj.updateDynamic("token")(token)
    if (payerEmail != null) __obj.updateDynamic("payerEmail")(payerEmail)
    if (payerName != null) __obj.updateDynamic("payerName")(payerName)
    if (payerPhone != null) __obj.updateDynamic("payerPhone")(payerPhone)
    if (shippingAddress != null) __obj.updateDynamic("shippingAddress")(shippingAddress)
    if (shippingOption != null) __obj.updateDynamic("shippingOption")(shippingOption)
    __obj.asInstanceOf[StripeTokenPaymentResponse]
  }
}

