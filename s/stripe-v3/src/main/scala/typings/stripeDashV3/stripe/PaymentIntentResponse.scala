package typings.stripeDashV3.stripe

import typings.stripeDashV3.stripe.paymentIntents.PaymentIntent
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
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (paymentIntent != null) __obj.updateDynamic("paymentIntent")(paymentIntent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentIntentResponse]
  }
}

