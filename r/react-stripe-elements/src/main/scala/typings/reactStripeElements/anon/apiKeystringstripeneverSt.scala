package typings.reactStripeElements.anon

import typings.reactStripeElements.mod.ReactStripeElements.StripeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  apiKey  :string,   stripe ? :never} & react-stripe-elements.react-stripe-elements.ReactStripeElements.StripeProviderOptions */
trait apiKeystringstripeneverSt extends StripeProviderProps {
  var apiKey: String
  var stripeAccount: js.UndefOr[String] = js.undefined
}

object apiKeystringstripeneverSt {
  @scala.inline
  def apply(apiKey: String, stripeAccount: String = null): apiKeystringstripeneverSt = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    if (stripeAccount != null) __obj.updateDynamic("stripeAccount")(stripeAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[apiKeystringstripeneverSt]
  }
}

