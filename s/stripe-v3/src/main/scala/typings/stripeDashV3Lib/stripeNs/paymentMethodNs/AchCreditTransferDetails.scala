package typings
package stripeDashV3Lib.stripeNs.paymentMethodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchCreditTransferDetails extends js.Object {
  var account_number: java.lang.String
  var bank_name: java.lang.String
  var routing_number: java.lang.String
  var swift_coode: java.lang.String
}

object AchCreditTransferDetails {
  @scala.inline
  def apply(
    account_number: java.lang.String,
    bank_name: java.lang.String,
    routing_number: java.lang.String,
    swift_coode: java.lang.String
  ): AchCreditTransferDetails = {
    val __obj = js.Dynamic.literal(account_number = account_number, bank_name = bank_name, routing_number = routing_number, swift_coode = swift_coode)
  
    __obj.asInstanceOf[AchCreditTransferDetails]
  }
}

