package typings.recurlyRecurlyJs.checkoutMod

import typings.recurlyRecurlyJs.AnonCurrency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckoutPricingState extends js.Object {
  var price: AnonCurrency
}

object CheckoutPricingState {
  @scala.inline
  def apply(price: AnonCurrency): CheckoutPricingState = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckoutPricingState]
  }
}

