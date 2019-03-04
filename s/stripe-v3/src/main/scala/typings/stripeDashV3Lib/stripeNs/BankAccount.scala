package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BankAccount extends js.Object {
  var account_holder_name: java.lang.String
  var account_holder_type: java.lang.String
  var bank_name: java.lang.String
  var country: java.lang.String
  var currency: java.lang.String
  var fingerprint: java.lang.String
  var id: java.lang.String
  var last4: java.lang.String
  var `object`: java.lang.String
  var routing_number: java.lang.String
  var status: statusType
}

object BankAccount {
  @scala.inline
  def apply(
    account_holder_name: java.lang.String,
    account_holder_type: java.lang.String,
    bank_name: java.lang.String,
    country: java.lang.String,
    currency: java.lang.String,
    fingerprint: java.lang.String,
    id: java.lang.String,
    last4: java.lang.String,
    `object`: java.lang.String,
    routing_number: java.lang.String,
    status: statusType
  ): BankAccount = {
    val __obj = js.Dynamic.literal(account_holder_name = account_holder_name, account_holder_type = account_holder_type, bank_name = bank_name, country = country, currency = currency, fingerprint = fingerprint, id = id, last4 = last4, routing_number = routing_number, status = status)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[BankAccount]
  }
}

