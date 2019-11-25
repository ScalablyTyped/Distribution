package typings.stripeDashV3.stripe

import typings.stripeDashV3.stripe.paymentMethod.PaymentMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodResponse extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var paymentMethod: js.UndefOr[PaymentMethod] = js.undefined
}

object PaymentMethodResponse {
  @scala.inline
  def apply(error: Error = null, paymentMethod: PaymentMethod = null): PaymentMethodResponse = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (paymentMethod != null) __obj.updateDynamic("paymentMethod")(paymentMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodResponse]
  }
}

