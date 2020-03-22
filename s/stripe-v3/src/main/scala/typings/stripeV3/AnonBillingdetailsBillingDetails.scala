package typings.stripeV3

import typings.stripeV3.stripe.BillingDetails
import typings.stripeV3.stripe.elements.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBillingdetailsBillingDetails extends js.Object {
  /**
    * The billing_details associated with the card.
    */
  var billing_details: js.UndefOr[BillingDetails] = js.undefined
  /*
    * Uses the provided card or cardNumber Element to create a
    * PaymentMethod to use for confirmation.
    */
  var card: Element | AnonToken
}

object AnonBillingdetailsBillingDetails {
  @scala.inline
  def apply(card: Element | AnonToken, billing_details: BillingDetails = null): AnonBillingdetailsBillingDetails = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBillingdetailsBillingDetails]
  }
}

