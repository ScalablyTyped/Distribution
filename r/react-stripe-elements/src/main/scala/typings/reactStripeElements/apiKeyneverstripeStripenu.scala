package typings.reactStripeElements

import typings.reactStripeElements.mod.ReactStripeElements.StripeProviderProps
import typings.stripeV3.stripe.Stripe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  apiKey ? :never,   stripe  :stripe-v3.stripe.Stripe | null} & react-stripe-elements.react-stripe-elements.ReactStripeElements.StripeProviderOptions */
trait apiKeyneverstripeStripenu extends StripeProviderProps {
  var stripe: Stripe | Null
  var stripeAccount: js.UndefOr[String] = js.undefined
}

object apiKeyneverstripeStripenu {
  @scala.inline
  def apply(stripe: Stripe = null, stripeAccount: String = null): apiKeyneverstripeStripenu = {
    val __obj = js.Dynamic.literal()
    if (stripe != null) __obj.updateDynamic("stripe")(stripe.asInstanceOf[js.Any])
    if (stripeAccount != null) __obj.updateDynamic("stripeAccount")(stripeAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[apiKeyneverstripeStripenu]
  }
}

