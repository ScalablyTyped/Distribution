package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.checkoutMod.CheckoutPricingStateTax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrency extends js.Object {
  var currency: AnonCode
  var next: AnonAdjustments
  var now: AnonAdjustments
  var taxes: js.Array[CheckoutPricingStateTax]
}

object AnonCurrency {
  @scala.inline
  def apply(
    currency: AnonCode,
    next: AnonAdjustments,
    now: AnonAdjustments,
    taxes: js.Array[CheckoutPricingStateTax]
  ): AnonCurrency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], taxes = taxes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCurrency]
  }
}

