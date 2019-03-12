package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OptionsShippingOption extends js.Object {
  var shippingOption: stripeDashV3Lib.stripeNs.paymentRequestNs.ShippingOption
  def updateWith(options: stripeDashV3Lib.stripeNs.paymentRequestNs.UpdateDetails): scala.Unit
}

object Anon_OptionsShippingOption {
  @scala.inline
  def apply(
    shippingOption: stripeDashV3Lib.stripeNs.paymentRequestNs.ShippingOption,
    updateWith: stripeDashV3Lib.stripeNs.paymentRequestNs.UpdateDetails => scala.Unit
  ): Anon_OptionsShippingOption = {
    val __obj = js.Dynamic.literal(shippingOption = shippingOption, updateWith = js.Any.fromFunction1(updateWith))
  
    __obj.asInstanceOf[Anon_OptionsShippingOption]
  }
}

