package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodResponse extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var paymentMethod: js.UndefOr[stripeDashV3Lib.stripeNs.paymentMethodNs.PaymentMethod] = js.undefined
}

object PaymentMethodResponse {
  @scala.inline
  def apply(error: Error = null, paymentMethod: stripeDashV3Lib.stripeNs.paymentMethodNs.PaymentMethod = null): PaymentMethodResponse = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (paymentMethod != null) __obj.updateDynamic("paymentMethod")(paymentMethod)
    __obj.asInstanceOf[PaymentMethodResponse]
  }
}

