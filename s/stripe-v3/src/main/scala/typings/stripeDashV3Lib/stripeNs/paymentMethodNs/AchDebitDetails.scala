package typings
package stripeDashV3Lib.stripeNs.paymentMethodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchDebitDetails extends js.Object {
  var account_holder_type: stripeDashV3Lib.stripeDashV3LibStrings.individual | stripeDashV3Lib.stripeDashV3LibStrings.company
  var bank_name: java.lang.String
  var country: java.lang.String
  var fingerprint: java.lang.String
  var last4: java.lang.String
  var routing_number: java.lang.String
}

object AchDebitDetails {
  @scala.inline
  def apply(
    account_holder_type: stripeDashV3Lib.stripeDashV3LibStrings.individual | stripeDashV3Lib.stripeDashV3LibStrings.company,
    bank_name: java.lang.String,
    country: java.lang.String,
    fingerprint: java.lang.String,
    last4: java.lang.String,
    routing_number: java.lang.String
  ): AchDebitDetails = {
    val __obj = js.Dynamic.literal(account_holder_type = account_holder_type.asInstanceOf[js.Any], bank_name = bank_name, country = country, fingerprint = fingerprint, last4 = last4, routing_number = routing_number)
  
    __obj.asInstanceOf[AchDebitDetails]
  }
}

