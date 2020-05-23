package typings.recurlyRecurlyJs.checkoutMod

import typings.recurlyRecurlyJs.anon.Adjustments
import typings.recurlyRecurlyJs.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckoutPrice extends js.Object {
  var currency: Code
  var next: Adjustments
  var now: Adjustments
  var taxes: js.Array[CheckoutPricingStateTax]
}

object CheckoutPrice {
  @scala.inline
  def apply(currency: Code, next: Adjustments, now: Adjustments, taxes: js.Array[CheckoutPricingStateTax]): CheckoutPrice = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], taxes = taxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckoutPrice]
  }
}

