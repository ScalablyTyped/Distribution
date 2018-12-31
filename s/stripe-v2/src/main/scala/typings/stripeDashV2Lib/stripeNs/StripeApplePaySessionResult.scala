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

