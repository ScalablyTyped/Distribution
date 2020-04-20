package typings.stripeV3

import typings.stripeV3.stripe.paymentRequest.ShippingAddress
import typings.stripeV3.stripe.paymentRequest.UpdateDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShippingAddress extends js.Object {
  var shippingAddress: ShippingAddress
  def updateWith(options: UpdateDetails): Unit
}

object AnonShippingAddress {
  @scala.inline
  def apply(shippingAddress: ShippingAddress, updateWith: UpdateDetails => Unit): AnonShippingAddress = {
    val __obj = js.Dynamic.literal(shippingAddress = shippingAddress.asInstanceOf[js.Any], updateWith = js.Any.fromFunction1(updateWith))
    __obj.asInstanceOf[AnonShippingAddress]
  }
}

