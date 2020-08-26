package typings.recurlyRecurlyJs.paypalMod

import typings.recurlyRecurlyJs.anon.ClientAuthorization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.recurlyRecurlyJs.paypalMod.BraintreeConfig
  - typings.recurlyRecurlyJs.paypalMod.DirectConfig
*/
trait PayPalConfig extends js.Object

object PayPalConfig {
  @scala.inline
  def BraintreeConfig(braintree: ClientAuthorization): PayPalConfig = {
    val __obj = js.Dynamic.literal(braintree = braintree.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalConfig]
  }
  @scala.inline
  def DirectConfig(): PayPalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayPalConfig]
  }
}

