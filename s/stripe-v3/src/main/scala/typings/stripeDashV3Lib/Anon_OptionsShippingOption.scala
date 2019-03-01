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
    updateWith: js.Function1[stripeDashV3Lib.stripeNs.paymentRequestNs.UpdateDetails, scala.Unit]
  ): Anon_OptionsShippingOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("shippingOption")(shippingOption)
    __obj.updateDynamic("updateWith")(updateWith)
    __obj.asInstanceOf[Anon_OptionsShippingOption]
  }
}

