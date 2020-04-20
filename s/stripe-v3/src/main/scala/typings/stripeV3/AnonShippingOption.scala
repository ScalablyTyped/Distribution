package typings.stripeV3

import typings.stripeV3.stripe.paymentRequest.ShippingOption
import typings.stripeV3.stripe.paymentRequest.UpdateDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShippingOption extends js.Object {
  var shippingOption: ShippingOption
  def updateWith(options: UpdateDetails): Unit
}

object AnonShippingOption {
  @scala.inline
  def apply(shippingOption: ShippingOption, updateWith: UpdateDetails => Unit): AnonShippingOption = {
    val __obj = js.Dynamic.literal(shippingOption = shippingOption.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
    __obj.asInstanceOf[AnonShippingOption]
  }
}

