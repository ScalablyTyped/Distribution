package typings.stripeDashV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BankAccount extends js.Object {
  var account_holder_name: String
  var account_holder_type: String
  var bank_name: String
  var country: String
  var currency: String
  var fingerprint: String
  var id: String
  var last4: String
  var `object`: String
  var routing_number: String
  var status: statusType
}

object BankAccount {
  @scala.inline
  def apply(
    account_holder_name: String,
    account_holder_type: String,
    bank_name: String,
    country: String,
    currency: String,
    fingerprint: String,
    id: String,
    last4: String,
    `object`: String,
    routing_number: String,
    status: statusType
  ): BankAccount = {
    val __obj = js.Dynamic.literal(account_holder_name = account_holder_name, account_holder_type = account_holder_type, bank_name = bank_name, country = country, currency = currency, fingerprint = fingerprint, id = id, last4 = last4, routing_number = routing_number, status = status)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[BankAccount]
  }
}

