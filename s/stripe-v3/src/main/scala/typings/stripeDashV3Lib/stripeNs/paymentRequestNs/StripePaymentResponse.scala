package typings
package stripeDashV3Lib.stripeNs.paymentRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripePaymentResponse extends js.Object {
  var methodName: java.lang.String
  var payerEmail: js.UndefOr[java.lang.String] = js.undefined
  var payerName: js.UndefOr[java.lang.String] = js.undefined
  var payerPhone: js.UndefOr[java.lang.String] = js.undefined
  var shippingAddress: js.UndefOr[ShippingAddress] = js.undefined
  var shippingOption: js.UndefOr[ShippingOption] = js.undefined
  def complete(status: java.lang.String): scala.Unit
}

