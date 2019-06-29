package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amexexpresscheckout extends js.Object {
  var amex_express_checkout: js.UndefOr[js.Any] = js.undefined
  var apple_pay: js.UndefOr[js.Any] = js.undefined
  var dynamic_last4: js.UndefOr[js.Any] = js.undefined
  var google_pay: js.UndefOr[js.Any] = js.undefined
  var masterpass: js.UndefOr[js.Any] = js.undefined
  var samsung_pay: js.UndefOr[js.Any] = js.undefined
  var `type`: stripeDashV3Lib.stripeDashV3LibStrings.amex_express_checkout | stripeDashV3Lib.stripeDashV3LibStrings.apple_pay | stripeDashV3Lib.stripeDashV3LibStrings.google_pay | stripeDashV3Lib.stripeDashV3LibStrings.masterpass | stripeDashV3Lib.stripeDashV3LibStrings.samsung_pay | stripeDashV3Lib.stripeDashV3LibStrings.visa_checkout
  var visa_checkout: js.UndefOr[js.Any] = js.undefined
}

object Anon_Amexexpresscheckout {
  @scala.inline
  def apply(
    `type`: stripeDashV3Lib.stripeDashV3LibStrings.amex_express_checkout | stripeDashV3Lib.stripeDashV3LibStrings.apple_pay | stripeDashV3Lib.stripeDashV3LibStrings.google_pay | stripeDashV3Lib.stripeDashV3LibStrings.masterpass | stripeDashV3Lib.stripeDashV3LibStrings.samsung_pay | stripeDashV3Lib.stripeDashV3LibStrings.visa_checkout,
    amex_express_checkout: js.Any = null,
    apple_pay: js.Any = null,
    dynamic_last4: js.Any = null,
    google_pay: js.Any = null,
    masterpass: js.Any = null,
    samsung_pay: js.Any = null,
    visa_checkout: js.Any = null
  ): Anon_Amexexpresscheckout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (amex_express_checkout != null) __obj.updateDynamic("amex_express_checkout")(amex_express_checkout)
    if (apple_pay != null) __obj.updateDynamic("apple_pay")(apple_pay)
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4)
    if (google_pay != null) __obj.updateDynamic("google_pay")(google_pay)
    if (masterpass != null) __obj.updateDynamic("masterpass")(masterpass)
    if (samsung_pay != null) __obj.updateDynamic("samsung_pay")(samsung_pay)
    if (visa_checkout != null) __obj.updateDynamic("visa_checkout")(visa_checkout)
    __obj.asInstanceOf[Anon_Amexexpresscheckout]
  }
}

