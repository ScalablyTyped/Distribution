package typings.stripeDashV3

import typings.stripeDashV3.stripe.paymentRequest.ShippingOption
import typings.stripeDashV3.stripe.paymentRequest.UpdateDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OptionsShippingOption extends js.Object {
  var shippingOption: ShippingOption
  def updateWith(options: UpdateDetails): Unit
}

object Anon_OptionsShippingOption {
  @scala.inline
  def apply(shippingOption: ShippingOption, updateWith: UpdateDetails => Unit): Anon_OptionsShippingOption = {
    val __obj = js.Dynamic.literal(shippingOption = shippingOption.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
  
    __obj.asInstanceOf[Anon_OptionsShippingOption]
  }
}

