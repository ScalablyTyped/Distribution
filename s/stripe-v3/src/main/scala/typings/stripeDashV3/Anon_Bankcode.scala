package typings.stripeDashV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bankcode extends js.Object {
  var bank_code: String | Null
  var country: String | Null
  var fingerprint: String
  var last4: String
  var mandate_reference: String
}

object Anon_Bankcode {
  @scala.inline
  def apply(
    fingerprint: String,
    last4: String,
    mandate_reference: String,
    bank_code: String = null,
    country: String = null
  ): Anon_Bankcode = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint, last4 = last4, mandate_reference = mandate_reference)
    if (bank_code != null) __obj.updateDynamic("bank_code")(bank_code)
    if (country != null) __obj.updateDynamic("country")(country)
    __obj.asInstanceOf[Anon_Bankcode]
  }
}

