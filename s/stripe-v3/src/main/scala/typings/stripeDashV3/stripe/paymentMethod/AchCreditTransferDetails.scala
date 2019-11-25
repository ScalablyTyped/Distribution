package typings.stripeDashV3.stripe.paymentMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchCreditTransferDetails extends js.Object {
  var account_number: String
  var bank_name: String
  var routing_number: String
  var swift_coode: String
}

object AchCreditTransferDetails {
  @scala.inline
  def apply(account_number: String, bank_name: String, routing_number: String, swift_coode: String): AchCreditTransferDetails = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], swift_coode = swift_coode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AchCreditTransferDetails]
  }
}

