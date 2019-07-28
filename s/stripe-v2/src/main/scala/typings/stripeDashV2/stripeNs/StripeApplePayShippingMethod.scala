package typings.stripeDashV2.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeApplePayShippingMethod extends js.Object {
  var amount: Double
  var detail: String
  var identifier: String
  var label: String
}

object StripeApplePayShippingMethod {
  @scala.inline
  def apply(amount: Double, detail: String, identifier: String, label: String): StripeApplePayShippingMethod = {
    val __obj = js.Dynamic.literal(amount = amount, detail = detail, identifier = identifier, label = label)
  
    __obj.asInstanceOf[StripeApplePayShippingMethod]
  }
}

