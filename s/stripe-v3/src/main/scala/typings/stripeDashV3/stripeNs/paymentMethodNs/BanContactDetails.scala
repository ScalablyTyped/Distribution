package typings.stripeDashV3.stripeNs.paymentMethodNs

import typings.stripeDashV3.stripeDashV3Strings.de
import typings.stripeDashV3.stripeDashV3Strings.en
import typings.stripeDashV3.stripeDashV3Strings.fr
import typings.stripeDashV3.stripeDashV3Strings.nl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BanContactDetails extends js.Object {
  var bank_code: String
  var bank_name: String
  var bic: String
  var iban_last4: String
  var preferred_language: en | de | fr | nl
  var verified_name: String
}

object BanContactDetails {
  @scala.inline
  def apply(
    bank_code: String,
    bank_name: String,
    bic: String,
    iban_last4: String,
    preferred_language: en | de | fr | nl,
    verified_name: String
  ): BanContactDetails = {
    val __obj = js.Dynamic.literal(bank_code = bank_code, bank_name = bank_name, bic = bic, iban_last4 = iban_last4, preferred_language = preferred_language.asInstanceOf[js.Any], verified_name = verified_name)
  
    __obj.asInstanceOf[BanContactDetails]
  }
}

