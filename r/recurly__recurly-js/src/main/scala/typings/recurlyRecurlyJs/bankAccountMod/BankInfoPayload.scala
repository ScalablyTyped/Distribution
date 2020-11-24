package typings.recurlyRecurlyJs.bankAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BankInfoPayload extends js.Object {
  
  /**
    * Bank institution name (ex: Bank of Recurly)
    */
  var bank_name: String = js.native
}
object BankInfoPayload {
  
  @scala.inline
  def apply(bank_name: String): BankInfoPayload = {
    val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankInfoPayload]
  }
  
  @scala.inline
  implicit class BankInfoPayloadOps[Self <: BankInfoPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBank_name(value: String): Self = this.set("bank_name", value.asInstanceOf[js.Any])
  }
}
