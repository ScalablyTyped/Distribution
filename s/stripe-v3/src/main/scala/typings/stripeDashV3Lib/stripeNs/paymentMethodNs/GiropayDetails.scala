package typings
package stripeDashV3Lib.stripeNs.paymentMethodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GiropayDetails extends js.Object {
  var bank_code: java.lang.String
  var bank_name: java.lang.String
  var bic: java.lang.String
  var verified_name: java.lang.String
}

object GiropayDetails {
  @scala.inline
  def apply(
    bank_code: java.lang.String,
    bank_name: java.lang.String,
    bic: java.lang.String,
    verified_name: java.lang.String
  ): GiropayDetails = {
    val __obj = js.Dynamic.literal(bank_code = bank_code, bank_name = bank_name, bic = bic, verified_name = verified_name)
  
    __obj.asInstanceOf[GiropayDetails]
  }
}

