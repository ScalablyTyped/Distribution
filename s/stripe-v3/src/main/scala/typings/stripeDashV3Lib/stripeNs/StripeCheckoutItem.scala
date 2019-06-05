package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeCheckoutItem extends js.Object {
  var plan: js.UndefOr[java.lang.String] = js.undefined
  var quantity: scala.Double
  var sku: js.UndefOr[java.lang.String] = js.undefined
}

object StripeCheckoutItem {
  @scala.inline
  def apply(quantity: scala.Double, plan: java.lang.String = null, sku: java.lang.String = null): StripeCheckoutItem = {
    val __obj = js.Dynamic.literal(quantity = quantity)
    if (plan != null) __obj.updateDynamic("plan")(plan)
    if (sku != null) __obj.updateDynamic("sku")(sku)
    __obj.asInstanceOf[StripeCheckoutItem]
  }
}

