package typings.recurlyRecurlyJs.paypalMod

import typings.recurlyRecurlyJs.anon.ClientAuthorization
import typings.recurlyRecurlyJs.anon.DisplayName
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
  def DirectConfig(display: DisplayName = null): PayPalConfig = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalConfig]
  }
}

