package typings.recurlyRecurlyJs.paypalMod

import typings.recurlyRecurlyJs.anon.ClientAuthorization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BraintreeConfig extends PayPalConfig {
  var braintree: ClientAuthorization
}

object BraintreeConfig {
  @scala.inline
  def apply(braintree: ClientAuthorization): BraintreeConfig = {
    val __obj = js.Dynamic.literal(braintree = braintree.asInstanceOf[js.Any])
    __obj.asInstanceOf[BraintreeConfig]
  }
}

