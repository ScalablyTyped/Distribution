package typings
package stripeDashV2Lib.stripeNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("token")(token)
    if (shippingContact != null) __obj.updateDynamic("shippingContact")(shippingContact)
    if (shippingMethod != null) __obj.updateDynamic("shippingMethod")(shippingMethod)
    __obj.asInstanceOf[StripeApplePaySessionResult]
  }
}

