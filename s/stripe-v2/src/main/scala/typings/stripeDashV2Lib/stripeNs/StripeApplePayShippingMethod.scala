package typings
package stripeDashV2Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeApplePayShippingMethod extends js.Object {
  var amount: scala.Double
  var detail: java.lang.String
  var identifier: java.lang.String
  var label: java.lang.String
}

object StripeApplePayShippingMethod {
  @scala.inline
  def apply(
    amount: scala.Double,
    detail: java.lang.String,
    identifier: java.lang.String,
    label: java.lang.String
  ): StripeApplePayShippingMethod = {
    val __obj = js.Dynamic.literal(amount = amount, detail = detail, identifier = identifier, label = label)
  
    __obj.asInstanceOf[StripeApplePayShippingMethod]
  }
}

