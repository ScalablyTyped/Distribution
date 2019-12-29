package typings.stripeDashV3

import typings.stripeDashV3.stripe.BillingDetails
import typings.stripeDashV3.stripe.elements.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BillingdetailsCardAnonToken extends js.Object {
  /**
    * The billing_details associated with the card.
    */
  var billing_details: js.UndefOr[BillingDetails] = js.undefined
  /*
    * Uses the provided card or cardNumber Element to create a
    * PaymentMethod to use for confirmation.
    */
  var card: Element | Anon_Token
}

object Anon_BillingdetailsCardAnonToken {
  @scala.inline
  def apply(card: Element | Anon_Token, billing_details: BillingDetails = null): Anon_BillingdetailsCardAnonToken = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BillingdetailsCardAnonToken]
  }
}

