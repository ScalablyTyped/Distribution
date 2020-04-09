package typings.recurlyRecurlyJs.paypalMod

import typings.recurlyRecurlyJs.AnonClientAuthorization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BraintreeConfig extends PayPalConfig {
  var braintree: AnonClientAuthorization
}

object BraintreeConfig {
  @scala.inline
  def apply(braintree: AnonClientAuthorization): BraintreeConfig = {
    val __obj = js.Dynamic.literal(braintree = braintree.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BraintreeConfig]
  }
}

