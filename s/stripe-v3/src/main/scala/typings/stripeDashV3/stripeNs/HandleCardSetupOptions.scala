package typings.stripeDashV3.stripeNs

import typings.stripeDashV3.Anon_Billingdetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleCardSetupOptions extends js.Object {
  /**
    * Use this parameter to supply additional data relevant to
    * the payment method, such as billing details.
    */
  var payment_method_data: js.UndefOr[Anon_Billingdetails] = js.undefined
}

object HandleCardSetupOptions {
  @scala.inline
  def apply(payment_method_data: Anon_Billingdetails = null): HandleCardSetupOptions = {
    val __obj = js.Dynamic.literal()
    if (payment_method_data != null) __obj.updateDynamic("payment_method_data")(payment_method_data)
    __obj.asInstanceOf[HandleCardSetupOptions]
  }
}

