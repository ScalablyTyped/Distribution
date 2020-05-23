package typings.reactStripeElements.mod.ReactStripeElements

import typings.stripeV3.stripe.Stripe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactStripeElements.anon.apiKeystringstripeneverSt
  - typings.reactStripeElements.anon.apiKeyneverstripeStripenu
*/
trait StripeProviderProps extends js.Object

object StripeProviderProps {
  @scala.inline
  def apiKeystringstripeneverSt(apiKey: String, stripeAccount: String = null): StripeProviderProps = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    if (stripeAccount != null) __obj.updateDynamic("stripeAccount")(stripeAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeProviderProps]
  }
  @scala.inline
  def apiKeyneverstripeStripenu(stripe: Stripe = null, stripeAccount: String = null): StripeProviderProps = {
    val __obj = js.Dynamic.literal(stripe = stripe.asInstanceOf[js.Any])
    if (stripeAccount != null) __obj.updateDynamic("stripeAccount")(stripeAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeProviderProps]
  }
}

