package typings.stripeDashV3.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BankAccountTokenOptions extends js.Object {
  var account_holder_name: String
  var account_holder_type: String
  var account_number: String
  var country: String
  var currency: String
  var routing_number: String
}

object BankAccountTokenOptions {
  @scala.inline
  def apply(
    account_holder_name: String,
    account_holder_type: String,
    account_number: String,
    country: String,
    currency: String,
    routing_number: String
  ): BankAccountTokenOptions = {
    val __obj = js.Dynamic.literal(account_holder_name = account_holder_name, account_holder_type = account_holder_type, account_number = account_number, country = country, currency = currency, routing_number = routing_number)
  
    __obj.asInstanceOf[BankAccountTokenOptions]
  }
}

