package typings.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeApplePaySessionResult extends js.Object {
  var shippingContact: js.UndefOr[StripeApplePayPaymentContact] = js.undefined
  var shippingMethod: js.UndefOr[StripeApplePayShippingMethod] = js.undefined
  var token: StripeCardTokenResponse
}

object StripeApplePaySessionResult {
  @scala.inline
  def apply(
    token: StripeCardTokenResponse,
    shippingContact: StripeApplePayPaymentContact = null,
    shippingMethod: StripeApplePayShippingMethod = null
  ): StripeApplePaySessionResult = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    if (shippingContact != null) __obj.updateDynamic("shippingContact")(shippingContact.asInstanceOf[js.Any])
    if (shippingMethod != null) __obj.updateDynamic("shippingMethod")(shippingMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeApplePaySessionResult]
  }
}

