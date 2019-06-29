package typings
package stripeDashV3Lib.stripeNs.paymentMethodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SofortDetails extends js.Object {
  var bank_code: java.lang.String
  var bank_name: java.lang.String
  var bic: java.lang.String
  var country: java.lang.String
  var iban_last4: java.lang.String
  var verified_name: java.lang.String
}

object SofortDetails {
  @scala.inline
  def apply(
    bank_code: java.lang.String,
    bank_name: java.lang.String,
    bic: java.lang.String,
    country: java.lang.String,
    iban_last4: java.lang.String,
    verified_name: java.lang.String
  ): SofortDetails = {
    val __obj = js.Dynamic.literal(bank_code = bank_code, bank_name = bank_name, bic = bic, country = country, iban_last4 = iban_last4, verified_name = verified_name)
  
    __obj.asInstanceOf[SofortDetails]
  }
}

