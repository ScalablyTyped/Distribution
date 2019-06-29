package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Billingdetails extends js.Object {
  /**
    * The billing details associated with the card. [Recommended]
    */
  var billing_details: js.UndefOr[stripeDashV3Lib.stripeNs.BillingDetails] = js.undefined
}

object Anon_Billingdetails {
  @scala.inline
  def apply(billing_details: stripeDashV3Lib.stripeNs.BillingDetails = null): Anon_Billingdetails = {
    val __obj = js.Dynamic.literal()
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details)
    __obj.asInstanceOf[Anon_Billingdetails]
  }
}

