package typings.stripeV2.stripe

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
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StripeApplePayShippingMethod]
  }
}

