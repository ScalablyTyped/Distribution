package typings.stripeDashV3

import typings.stripeDashV3.stripe.paymentMethod.PaymentMethodDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Charge extends js.Object {
  var charge: js.UndefOr[String | Null] = js.undefined
  var payment_method_details: js.UndefOr[PaymentMethodDetails | Null] = js.undefined
}

object Anon_Charge {
  @scala.inline
  def apply(charge: String = null, payment_method_details: PaymentMethodDetails = null): Anon_Charge = {
    val __obj = js.Dynamic.literal()
    if (charge != null) __obj.updateDynamic("charge")(charge.asInstanceOf[js.Any])
    if (payment_method_details != null) __obj.updateDynamic("payment_method_details")(payment_method_details.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Charge]
  }
}

