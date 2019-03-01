package typings
package stripeDashV2Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/reference/applepayjs/1916082-applepay_js_data_types
trait StripeApplePayLineItem extends js.Object {
  var amount: scala.Double
  var label: java.lang.String
  var `type`: stripeDashV2Lib.stripeDashV2LibStrings.pending | stripeDashV2Lib.stripeDashV2LibStrings.`final`
}

object StripeApplePayLineItem {
  @scala.inline
  def apply(
    amount: scala.Double,
    label: java.lang.String,
    `type`: stripeDashV2Lib.stripeDashV2LibStrings.pending | stripeDashV2Lib.stripeDashV2LibStrings.`final`
  ): StripeApplePayLineItem = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[StripeApplePayLineItem]
  }
}

