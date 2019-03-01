package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bankcode extends js.Object {
  var bank_code: java.lang.String | scala.Null
  var country: java.lang.String | scala.Null
  var fingerprint: java.lang.String
  var last4: java.lang.String
  var mandate_reference: java.lang.String
}

object Anon_Bankcode {
  @scala.inline
  def apply(
    fingerprint: java.lang.String,
    last4: java.lang.String,
    mandate_reference: java.lang.String,
    bank_code: java.lang.String = null,
    country: java.lang.String = null
  ): Anon_Bankcode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fingerprint")(fingerprint)
    __obj.updateDynamic("last4")(last4)
    __obj.updateDynamic("mandate_reference")(mandate_reference)
    if (bank_code != null) __obj.updateDynamic("bank_code")(bank_code)
    if (country != null) __obj.updateDynamic("country")(country)
    __obj.asInstanceOf[Anon_Bankcode]
  }
}

