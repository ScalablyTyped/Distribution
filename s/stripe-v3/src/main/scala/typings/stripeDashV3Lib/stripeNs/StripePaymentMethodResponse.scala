package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripePaymentMethodResponse extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var paymentMethod: js.UndefOr[StripePaymentMethod] = js.undefined
}

object StripePaymentMethodResponse {
  @scala.inline
  def apply(error: Error = null, paymentMethod: StripePaymentMethod = null): StripePaymentMethodResponse = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (paymentMethod != null) __obj.updateDynamic("paymentMethod")(paymentMethod)
    __obj.asInstanceOf[StripePaymentMethodResponse]
  }
}

