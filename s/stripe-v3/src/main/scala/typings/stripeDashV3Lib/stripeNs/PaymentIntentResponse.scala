package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentIntentResponse extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var paymentIntent: js.UndefOr[stripeDashV3Lib.stripeNs.paymentIntentsNs.PaymentIntent] = js.undefined
}

object PaymentIntentResponse {
  @scala.inline
  def apply(error: Error = null, paymentIntent: stripeDashV3Lib.stripeNs.paymentIntentsNs.PaymentIntent = null): PaymentIntentResponse = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (paymentIntent != null) __obj.updateDynamic("paymentIntent")(paymentIntent)
    __obj.asInstanceOf[PaymentIntentResponse]
  }
}

