package typings.stripeDashV3.stripe.paymentMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GiropayDetails extends js.Object {
  var bank_code: String
  var bank_name: String
  var bic: String
  var verified_name: String
}

object GiropayDetails {
  @scala.inline
  def apply(bank_code: String, bank_name: String, bic: String, verified_name: String): GiropayDetails = {
    val __obj = js.Dynamic.literal(bank_code = bank_code.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], bic = bic.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GiropayDetails]
  }
}

