package typings.stripeDashV3.stripeNs.paymentMethodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SofortDetails extends js.Object {
  var bank_code: String
  var bank_name: String
  var bic: String
  var country: String
  var iban_last4: String
  var verified_name: String
}

object SofortDetails {
  @scala.inline
  def apply(
    bank_code: String,
    bank_name: String,
    bic: String,
    country: String,
    iban_last4: String,
    verified_name: String
  ): SofortDetails = {
    val __obj = js.Dynamic.literal(bank_code = bank_code, bank_name = bank_name, bic = bic, country = country, iban_last4 = iban_last4, verified_name = verified_name)
  
    __obj.asInstanceOf[SofortDetails]
  }
}

