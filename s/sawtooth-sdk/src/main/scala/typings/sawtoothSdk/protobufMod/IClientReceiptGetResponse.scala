package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientReceiptGetResponse extends js.Object {
  
  /** ClientReceiptGetResponse receipts */
  var receipts: js.UndefOr[js.Array[ITransactionReceipt] | Null] = js.native
  
  /** ClientReceiptGetResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object IClientReceiptGetResponse {
  
  @scala.inline
  def apply(): IClientReceiptGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientReceiptGetResponse]
  }
  
  @scala.inline
  implicit class IClientReceiptGetResponseOps[Self <: IClientReceiptGetResponse] (val x: Self) extends AnyVal {
    
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
    def setReceiptsVarargs(value: ITransactionReceipt*): Self = this.set("receipts", js.Array(value :_*))
    
    @scala.inline
    def setReceipts(value: js.Array[ITransactionReceipt]): Self = this.set("receipts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceipts: Self = this.set("receipts", js.undefined)
    
    @scala.inline
    def setReceiptsNull: Self = this.set("receipts", null)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
}
