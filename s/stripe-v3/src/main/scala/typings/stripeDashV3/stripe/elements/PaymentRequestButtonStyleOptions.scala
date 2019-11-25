package typings.stripeDashV3.stripe.elements

import typings.stripeDashV3.stripeDashV3Strings.`light-outline`
import typings.stripeDashV3.stripeDashV3Strings.buy
import typings.stripeDashV3.stripeDashV3Strings.dark
import typings.stripeDashV3.stripeDashV3Strings.default
import typings.stripeDashV3.stripeDashV3Strings.donate
import typings.stripeDashV3.stripeDashV3Strings.light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentRequestButtonStyleOptions extends js.Object {
  var height: String
  var theme: dark | light | `light-outline`
  var `type`: js.UndefOr[default | donate | buy] = js.undefined
}

object PaymentRequestButtonStyleOptions {
  @scala.inline
  def apply(height: String, theme: dark | light | `light-outline`, `type`: default | donate | buy = null): PaymentRequestButtonStyleOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRequestButtonStyleOptions]
  }
}

