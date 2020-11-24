package typings.recurlyRecurlyJs.bankAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BankInfoOptions extends js.Object {
  
  /**
    * The routing number for a bank (ex: ‘123456780’)
    */
  var routingNumber: String = js.native
}
object BankInfoOptions {
  
  @scala.inline
  def apply(routingNumber: String): BankInfoOptions = {
    val __obj = js.Dynamic.literal(routingNumber = routingNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankInfoOptions]
  }
  
  @scala.inline
  implicit class BankInfoOptionsOps[Self <: BankInfoOptions] (val x: Self) extends AnyVal {
    
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
    def setRoutingNumber(value: String): Self = this.set("routingNumber", value.asInstanceOf[js.Any])
  }
}
