package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientReceiptGetRequest extends js.Object {
  
  /** ClientReceiptGetRequest transactionIds */
  var transactionIds: js.UndefOr[js.Array[String] | Null] = js.native
}
object IClientReceiptGetRequest {
  
  @scala.inline
  def apply(): IClientReceiptGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientReceiptGetRequest]
  }
  
  @scala.inline
  implicit class IClientReceiptGetRequestOps[Self <: IClientReceiptGetRequest] (val x: Self) extends AnyVal {
    
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
    def setTransactionIdsVarargs(value: String*): Self = this.set("transactionIds", js.Array(value :_*))
    
    @scala.inline
    def setTransactionIds(value: js.Array[String]): Self = this.set("transactionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionIds: Self = this.set("transactionIds", js.undefined)
    
    @scala.inline
    def setTransactionIdsNull: Self = this.set("transactionIds", null)
  }
}
