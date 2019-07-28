package typings.stripeDashV3.stripeNs.paymentMethodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SepaDebitDetails extends js.Object {
  var bank_code: String
  var branch_code: String
  var country: String
  var fingerprint: String
  var last4: String
}

object SepaDebitDetails {
  @scala.inline
  def apply(bank_code: String, branch_code: String, country: String, fingerprint: String, last4: String): SepaDebitDetails = {
    val __obj = js.Dynamic.literal(bank_code = bank_code, branch_code = branch_code, country = country, fingerprint = fingerprint, last4 = last4)
  
    __obj.asInstanceOf[SepaDebitDetails]
  }
}

