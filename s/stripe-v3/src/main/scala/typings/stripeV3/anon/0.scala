package typings.stripeV3.anon

import typings.stripeV3.stripe.BillingDetails
import typings.stripeV3.stripe.elements.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0` extends js.Object {
  /**
    * The billing_details associated with the card.
    */
  var billing_details: js.UndefOr[BillingDetails] = js.native
  /*
    * Uses the provided card or cardNumber Element to create a
    * PaymentMethod to use for confirmation.
    */
  var card: Element | Token = js.native
}

object `0` {
  @scala.inline
  def apply(card: Element | Token): `0` = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCard(value: Element | Token): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def setBilling_details(value: BillingDetails): Self = this.set("billing_details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilling_details: Self = this.set("billing_details", js.undefined)
  }
  
}

