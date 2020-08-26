package typings.reactStripeElements.anon

import typings.reactStripeElements.mod.ReactStripeElements.StripeProviderProps
import typings.stripeV3.stripe.Stripe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  apiKey :never | undefined,   stripe :stripe-v3.stripe.Stripe | null} & react-stripe-elements.react-stripe-elements.ReactStripeElements.StripeProviderOptions */
@js.native
trait apiKeyneverundefinedstrip extends StripeProviderProps {
  var apiKey: js.UndefOr[scala.Nothing] = js.native
  var stripe: Stripe | Null = js.native
  var stripeAccount: js.UndefOr[String] = js.native
}

object apiKeyneverundefinedstrip {
  @scala.inline
  def apply(): apiKeyneverundefinedstrip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[apiKeyneverundefinedstrip]
  }
  @scala.inline
  implicit class apiKeyneverundefinedstripOps[Self <: apiKeyneverundefinedstrip] (val x: Self) extends AnyVal {
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
    def setStripe(value: Stripe): Self = this.set("stripe", value.asInstanceOf[js.Any])
    @scala.inline
    def setStripeNull: Self = this.set("stripe", null)
    @scala.inline
    def setStripeAccount(value: String): Self = this.set("stripeAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripeAccount: Self = this.set("stripeAccount", js.undefined)
  }
  
}

