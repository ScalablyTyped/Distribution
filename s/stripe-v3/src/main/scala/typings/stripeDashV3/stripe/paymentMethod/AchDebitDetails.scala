package typings.stripeDashV3.stripe.paymentMethod

import typings.stripeDashV3.stripeDashV3Strings.company
import typings.stripeDashV3.stripeDashV3Strings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchDebitDetails extends js.Object {
  var account_holder_type: individual | company
  var bank_name: String
  var country: String
  var fingerprint: String
  var last4: String
  var routing_number: String
}

object AchDebitDetails {
  @scala.inline
  def apply(
    account_holder_type: individual | company,
    bank_name: String,
    country: String,
    fingerprint: String,
    last4: String,
    routing_number: String
  ): AchDebitDetails = {
    val __obj = js.Dynamic.literal(account_holder_type = account_holder_type.asInstanceOf[js.Any], bank_name = bank_name, country = country, fingerprint = fingerprint, last4 = last4, routing_number = routing_number)
  
    __obj.asInstanceOf[AchDebitDetails]
  }
}

