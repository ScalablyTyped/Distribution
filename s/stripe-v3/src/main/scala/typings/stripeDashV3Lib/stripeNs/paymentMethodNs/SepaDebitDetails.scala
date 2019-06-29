package typings
package stripeDashV3Lib.stripeNs.paymentMethodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SepaDebitDetails extends js.Object {
  var bank_code: java.lang.String
  var branch_code: java.lang.String
  var country: java.lang.String
  var fingerprint: java.lang.String
  var last4: java.lang.String
}

object SepaDebitDetails {
  @scala.inline
  def apply(
    bank_code: java.lang.String,
    branch_code: java.lang.String,
    country: java.lang.String,
    fingerprint: java.lang.String,
    last4: java.lang.String
  ): SepaDebitDetails = {
    val __obj = js.Dynamic.literal(bank_code = bank_code, branch_code = branch_code, country = country, fingerprint = fingerprint, last4 = last4)
  
    __obj.asInstanceOf[SepaDebitDetails]
  }
}

