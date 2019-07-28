package typings.stripeDashV3

import typings.stripeDashV3.stripeNs.paymentRequestNs.ShippingAddress
import typings.stripeDashV3.stripeNs.paymentRequestNs.UpdateDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var shippingAddress: ShippingAddress
  def updateWith(options: UpdateDetails): Unit
}

object Anon_Options {
  @scala.inline
  def apply(shippingAddress: ShippingAddress, updateWith: UpdateDetails => Unit): Anon_Options = {
    val __obj = js.Dynamic.literal(shippingAddress = shippingAddress, updateWith = js.Any.fromFunction1(updateWith))
  
    __obj.asInstanceOf[Anon_Options]
  }
}

