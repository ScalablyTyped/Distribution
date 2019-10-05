package typings.stripeDashV3

import typings.stripeDashV3.stripe.BillingDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Billingdetails extends js.Object {
  /**
    * The billing details associated with the card. [Recommended]
    */
  var billing_details: js.UndefOr[BillingDetails] = js.undefined
}

object Anon_Billingdetails {
  @scala.inline
  def apply(billing_details: BillingDetails = null): Anon_Billingdetails = {
    val __obj = js.Dynamic.literal()
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details)
    __obj.asInstanceOf[Anon_Billingdetails]
  }
}

