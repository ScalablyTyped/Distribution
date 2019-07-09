package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleCardSetupOptions extends js.Object {
  /**
    * Use this parameter to supply additional data relevant to
    * the payment method, such as billing details.
    */
  var payment_method_data: js.UndefOr[stripeDashV3Lib.Anon_Billingdetails] = js.undefined
}

object HandleCardSetupOptions {
  @scala.inline
  def apply(payment_method_data: stripeDashV3Lib.Anon_Billingdetails = null): HandleCardSetupOptions = {
    val __obj = js.Dynamic.literal()
    if (payment_method_data != null) __obj.updateDynamic("payment_method_data")(payment_method_data)
    __obj.asInstanceOf[HandleCardSetupOptions]
  }
}

