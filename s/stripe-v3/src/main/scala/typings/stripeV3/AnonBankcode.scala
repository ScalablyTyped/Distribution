package typings.stripeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBankcode extends js.Object {
  var bank_code: String | Null
  var country: String | Null
  var fingerprint: String
  var last4: String
  var mandate_reference: String
}

object AnonBankcode {
  @scala.inline
  def apply(
    fingerprint: String,
    last4: String,
    mandate_reference: String,
    bank_code: String = null,
    country: String = null
  ): AnonBankcode = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], mandate_reference = mandate_reference.asInstanceOf[js.Any])
    if (bank_code != null) __obj.updateDynamic("bank_code")(bank_code.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBankcode]
  }
}

