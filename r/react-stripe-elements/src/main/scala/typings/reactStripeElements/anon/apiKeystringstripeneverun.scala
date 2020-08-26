package typings.reactStripeElements.anon

import typings.reactStripeElements.mod.ReactStripeElements.StripeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  apiKey :string,   stripe :never | undefined} & react-stripe-elements.react-stripe-elements.ReactStripeElements.StripeProviderOptions */
@js.native
trait apiKeystringstripeneverun extends StripeProviderProps {
  var apiKey: String = js.native
  var stripe: js.UndefOr[scala.Nothing] = js.native
  var stripeAccount: js.UndefOr[String] = js.native
}

object apiKeystringstripeneverun {
  @scala.inline
  def apply(apiKey: String): apiKeystringstripeneverun = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[apiKeystringstripeneverun]
  }
  @scala.inline
  implicit class apiKeystringstripeneverunOps[Self <: apiKeystringstripeneverun] (val x: Self) extends AnyVal {
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setStripeAccount(value: String): Self = this.set("stripeAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripeAccount: Self = this.set("stripeAccount", js.undefined)
  }
  
}

