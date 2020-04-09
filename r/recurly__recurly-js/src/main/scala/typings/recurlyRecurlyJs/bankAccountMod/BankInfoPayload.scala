package typings.recurlyRecurlyJs.bankAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BankInfoPayload extends js.Object {
  var bank_name: String
}

object BankInfoPayload {
  @scala.inline
  def apply(bank_name: String): BankInfoPayload = {
    val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BankInfoPayload]
  }
}

