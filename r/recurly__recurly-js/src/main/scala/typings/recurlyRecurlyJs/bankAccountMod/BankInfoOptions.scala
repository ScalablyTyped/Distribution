package typings.recurlyRecurlyJs.bankAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BankInfoOptions extends js.Object {
  var routingNumber: String
}

object BankInfoOptions {
  @scala.inline
  def apply(routingNumber: String): BankInfoOptions = {
    val __obj = js.Dynamic.literal(routingNumber = routingNumber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BankInfoOptions]
  }
}

