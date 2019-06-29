package typings
package stripeDashV3Lib.stripeNs.paymentMethodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BanContactDetails extends js.Object {
  var bank_code: java.lang.String
  var bank_name: java.lang.String
  var bic: java.lang.String
  var iban_last4: java.lang.String
  var preferred_language: stripeDashV3Lib.stripeDashV3LibStrings.en | stripeDashV3Lib.stripeDashV3LibStrings.de | stripeDashV3Lib.stripeDashV3LibStrings.fr | stripeDashV3Lib.stripeDashV3LibStrings.nl
  var verified_name: java.lang.String
}

object BanContactDetails {
  @scala.inline
  def apply(
    bank_code: java.lang.String,
    bank_name: java.lang.String,
    bic: java.lang.String,
    iban_last4: java.lang.String,
    preferred_language: stripeDashV3Lib.stripeDashV3LibStrings.en | stripeDashV3Lib.stripeDashV3LibStrings.de | stripeDashV3Lib.stripeDashV3LibStrings.fr | stripeDashV3Lib.stripeDashV3LibStrings.nl,
    verified_name: java.lang.String
  ): BanContactDetails = {
    val __obj = js.Dynamic.literal(bank_code = bank_code, bank_name = bank_name, bic = bic, iban_last4 = iban_last4, preferred_language = preferred_language.asInstanceOf[js.Any], verified_name = verified_name)
  
    __obj.asInstanceOf[BanContactDetails]
  }
}

