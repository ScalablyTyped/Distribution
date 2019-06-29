package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Charge extends js.Object {
  var charge: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var payment_method_details: js.UndefOr[stripeDashV3Lib.stripeNs.paymentMethodNs.PaymentMethodDetails | scala.Null] = js.undefined
}

object Anon_Charge {
  @scala.inline
  def apply(
    charge: java.lang.String = null,
    payment_method_details: stripeDashV3Lib.stripeNs.paymentMethodNs.PaymentMethodDetails = null
  ): Anon_Charge = {
    val __obj = js.Dynamic.literal()
    if (charge != null) __obj.updateDynamic("charge")(charge)
    if (payment_method_details != null) __obj.updateDynamic("payment_method_details")(payment_method_details)
    __obj.asInstanceOf[Anon_Charge]
  }
}

