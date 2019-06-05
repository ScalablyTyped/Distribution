package typings
package stripeDashV3Lib.stripeNs.paymentIntentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentIntentResponse extends js.Object {
  var error: js.UndefOr[stripeDashV3Lib.stripeNs.Error] = js.undefined
  var paymentIntent: js.UndefOr[StripePaymentIntent] = js.undefined
}

object PaymentIntentResponse {
  @scala.inline
  def apply(error: stripeDashV3Lib.stripeNs.Error = null, paymentIntent: StripePaymentIntent = null): PaymentIntentResponse = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (paymentIntent != null) __obj.updateDynamic("paymentIntent")(paymentIntent)
    __obj.asInstanceOf[PaymentIntentResponse]
  }
}

