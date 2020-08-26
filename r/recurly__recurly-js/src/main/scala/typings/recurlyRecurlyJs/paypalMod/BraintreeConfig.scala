package typings.recurlyRecurlyJs.paypalMod

import typings.recurlyRecurlyJs.anon.ClientAuthorization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BraintreeConfig extends PayPalConfig {
  var braintree: ClientAuthorization = js.native
}

object BraintreeConfig {
  @scala.inline
  def apply(braintree: ClientAuthorization): BraintreeConfig = {
    val __obj = js.Dynamic.literal(braintree = braintree.asInstanceOf[js.Any])
    __obj.asInstanceOf[BraintreeConfig]
  }
  @scala.inline
  implicit class BraintreeConfigOps[Self <: BraintreeConfig] (val x: Self) extends AnyVal {
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
    def setBraintree(value: ClientAuthorization): Self = this.set("braintree", value.asInstanceOf[js.Any])
  }
  
}

