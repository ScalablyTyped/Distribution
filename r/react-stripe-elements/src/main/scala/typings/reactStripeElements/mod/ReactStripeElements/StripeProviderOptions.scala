package typings.reactStripeElements.mod.ReactStripeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeProviderOptions extends js.Object {
  var stripeAccount: js.UndefOr[String] = js.native
}

object StripeProviderOptions {
  @scala.inline
  def apply(): StripeProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripeProviderOptions]
  }
  @scala.inline
  implicit class StripeProviderOptionsOps[Self <: StripeProviderOptions] (val x: Self) extends AnyVal {
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
    def setStripeAccount(value: String): Self = this.set("stripeAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripeAccount: Self = this.set("stripeAccount", js.undefined)
  }
  
}

