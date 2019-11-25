package typings.stripeDashV2.stripe

import typings.stripeDashV2.stripeDashV2Strings.`final`
import typings.stripeDashV2.stripeDashV2Strings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/reference/applepayjs/1916082-applepay_js_data_types
trait StripeApplePayLineItem extends js.Object {
  var amount: Double
  var label: String
  var `type`: pending | `final`
}

object StripeApplePayLineItem {
  @scala.inline
  def apply(amount: Double, label: String, `type`: pending | `final`): StripeApplePayLineItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeApplePayLineItem]
  }
}

