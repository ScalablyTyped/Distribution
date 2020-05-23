package typings.recurlyRecurlyJs.checkoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckoutPricingState extends js.Object {
  var price: CheckoutPrice
}

object CheckoutPricingState {
  @scala.inline
  def apply(price: CheckoutPrice): CheckoutPricingState = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckoutPricingState]
  }
}

