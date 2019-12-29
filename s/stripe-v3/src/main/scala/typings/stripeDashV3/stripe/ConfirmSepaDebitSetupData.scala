package typings.stripeDashV3.stripe

import typings.stripeDashV3.Anon_BillingdetailsSepadebit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmSepaDebitSetupData extends js.Object {
  /**
    * Pass an object to confirm using data collected by an iban Element or
    * by passing data directly and to supply additional required billing
    * details:
    */
  var payment_method: js.UndefOr[String | Anon_BillingdetailsSepadebit] = js.undefined
}

object ConfirmSepaDebitSetupData {
  @scala.inline
  def apply(payment_method: String | Anon_BillingdetailsSepadebit = null): ConfirmSepaDebitSetupData = {
    val __obj = js.Dynamic.literal()
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmSepaDebitSetupData]
  }
}

