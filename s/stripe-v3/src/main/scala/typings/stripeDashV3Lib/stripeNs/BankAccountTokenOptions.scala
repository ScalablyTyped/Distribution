package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BankAccountTokenOptions extends js.Object {
  var account_holder_name: java.lang.String
  var account_holder_type: java.lang.String
  var account_number: java.lang.String
  var country: java.lang.String
  var currency: java.lang.String
  var routing_number: java.lang.String
}

object BankAccountTokenOptions {
  @scala.inline
  def apply(
    account_holder_name: java.lang.String,
    account_holder_type: java.lang.String,
    account_number: java.lang.String,
    country: java.lang.String,
    currency: java.lang.String,
    routing_number: java.lang.String
  ): BankAccountTokenOptions = {
    val __obj = js.Dynamic.literal(account_holder_name = account_holder_name, account_holder_type = account_holder_type, account_number = account_number, country = country, currency = currency, routing_number = routing_number)
  
    __obj.asInstanceOf[BankAccountTokenOptions]
  }
}

