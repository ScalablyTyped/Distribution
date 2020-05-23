package typings.recurlyRecurlyJs.checkoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckoutPricingStateTax extends js.Object {
  var rate: String
  var region: String
  var tax_type: String
}

object CheckoutPricingStateTax {
  @scala.inline
  def apply(rate: String, region: String, tax_type: String): CheckoutPricingStateTax = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], tax_type = tax_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckoutPricingStateTax]
  }
}

