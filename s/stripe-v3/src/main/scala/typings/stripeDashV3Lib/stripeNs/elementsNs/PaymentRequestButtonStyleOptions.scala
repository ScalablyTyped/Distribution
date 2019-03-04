package typings
package stripeDashV3Lib.stripeNs.elementsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentRequestButtonStyleOptions extends js.Object {
  var height: java.lang.String
  var theme: stripeDashV3Lib.stripeDashV3LibStrings.dark | stripeDashV3Lib.stripeDashV3LibStrings.light | stripeDashV3Lib.stripeDashV3LibStrings.`light-outline`
  var `type`: js.UndefOr[
    stripeDashV3Lib.stripeDashV3LibStrings.default | stripeDashV3Lib.stripeDashV3LibStrings.donate | stripeDashV3Lib.stripeDashV3LibStrings.buy
  ] = js.undefined
}

object PaymentRequestButtonStyleOptions {
  @scala.inline
  def apply(
    height: java.lang.String,
    theme: stripeDashV3Lib.stripeDashV3LibStrings.dark | stripeDashV3Lib.stripeDashV3LibStrings.light | stripeDashV3Lib.stripeDashV3LibStrings.`light-outline`,
    `type`: stripeDashV3Lib.stripeDashV3LibStrings.default | stripeDashV3Lib.stripeDashV3LibStrings.donate | stripeDashV3Lib.stripeDashV3LibStrings.buy = null
  ): PaymentRequestButtonStyleOptions = {
    val __obj = js.Dynamic.literal(height = height, theme = theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRequestButtonStyleOptions]
  }
}

