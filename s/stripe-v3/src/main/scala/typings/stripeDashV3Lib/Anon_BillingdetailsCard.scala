package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BillingdetailsCard extends js.Object {
  /**
    * The billing details associated with the card. [Recommended]
    */
  var billing_details: js.UndefOr[stripeDashV3Lib.stripeNs.BillingDetails] = js.undefined
  var card: js.UndefOr[Anon_Token] = js.undefined
}

object Anon_BillingdetailsCard {
  @scala.inline
  def apply(billing_details: stripeDashV3Lib.stripeNs.BillingDetails = null, card: Anon_Token = null): Anon_BillingdetailsCard = {
    val __obj = js.Dynamic.literal()
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details)
    if (card != null) __obj.updateDynamic("card")(card)
    __obj.asInstanceOf[Anon_BillingdetailsCard]
  }
}

