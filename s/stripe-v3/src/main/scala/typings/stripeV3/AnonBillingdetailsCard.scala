package typings.stripeV3

import typings.stripeV3.stripe.BillingDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBillingdetailsCard extends js.Object {
  /**
    * The billing details associated with the card. [Recommended]
    */
  var billing_details: js.UndefOr[BillingDetails] = js.undefined
  var card: js.UndefOr[AnonToken] = js.undefined
}

object AnonBillingdetailsCard {
  @scala.inline
  def apply(billing_details: BillingDetails = null, card: AnonToken = null): AnonBillingdetailsCard = {
    val __obj = js.Dynamic.literal()
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBillingdetailsCard]
  }
}

