package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var shippingAddress: stripeDashV3Lib.stripeNs.paymentRequestNs.ShippingAddress
  def updateWith(options: stripeDashV3Lib.stripeNs.paymentRequestNs.UpdateDetails): scala.Unit
}

object Anon_Options {
  @scala.inline
  def apply(
    shippingAddress: stripeDashV3Lib.stripeNs.paymentRequestNs.ShippingAddress,
    updateWith: stripeDashV3Lib.stripeNs.paymentRequestNs.UpdateDetails => scala.Unit
  ): Anon_Options = {
    val __obj = js.Dynamic.literal(shippingAddress = shippingAddress, updateWith = js.Any.fromFunction1(updateWith))
  
    __obj.asInstanceOf[Anon_Options]
  }
}

