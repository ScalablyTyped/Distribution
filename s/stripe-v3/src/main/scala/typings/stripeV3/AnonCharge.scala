package typings.stripeV3

import typings.stripeV3.stripe.paymentMethod.PaymentMethodDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCharge extends js.Object {
  var charge: js.UndefOr[String | Null] = js.undefined
  var payment_method_details: js.UndefOr[PaymentMethodDetails | Null] = js.undefined
}

object AnonCharge {
  @scala.inline
  def apply(charge: String = null, payment_method_details: PaymentMethodDetails = null): AnonCharge = {
    val __obj = js.Dynamic.literal()
    if (charge != null) __obj.updateDynamic("charge")(charge.asInstanceOf[js.Any])
    if (payment_method_details != null) __obj.updateDynamic("payment_method_details")(payment_method_details.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCharge]
  }
}

