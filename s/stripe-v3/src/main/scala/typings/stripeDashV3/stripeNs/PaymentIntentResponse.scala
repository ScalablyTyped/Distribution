package typings.stripeDashV3.stripeNs

import typings.stripeDashV3.stripeNs.paymentIntentsNs.PaymentIntent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentIntentResponse extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var paymentIntent: js.UndefOr[PaymentIntent] = js.undefined
}

object PaymentIntentResponse {
  @scala.inline
  def apply(error: Error = null, paymentIntent: PaymentIntent = null): PaymentIntentResponse = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (paymentIntent != null) __obj.updateDynamic("paymentIntent")(paymentIntent)
    __obj.asInstanceOf[PaymentIntentResponse]
  }
}

