package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBatchStatus.IInvalidTransaction
import typings.sawtoothSdk.protobufMod.ClientBatchStatus.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientBatchStatus extends js.Object {
  
  /** ClientBatchStatus batchId */
  var batchId: js.UndefOr[String | Null] = js.native
  
  /** ClientBatchStatus invalidTransactions */
  var invalidTransactions: js.UndefOr[js.Array[IInvalidTransaction] | Null] = js.native
  
  /** ClientBatchStatus status */
  var status: js.UndefOr[Status | Null] = js.native
}
object IClientBatchStatus {
  
  @scala.inline
  def apply(): IClientBatchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchStatus]
  }
  
  @scala.inline
  implicit class IClientBatchStatusOps[Self <: IClientBatchStatus] (val x: Self) extends AnyVal {
    
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
    def setBatchId(value: String): Self = this.set("batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    
    @scala.inline
    def setBatchIdNull: Self = this.set("batchId", null)
    
    @scala.inline
    def setInvalidTransactionsVarargs(value: IInvalidTransaction*): Self = this.set("invalidTransactions", js.Array(value :_*))
    
    @scala.inline
    def setInvalidTransactions(value: js.Array[IInvalidTransaction]): Self = this.set("invalidTransactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidTransactions: Self = this.set("invalidTransactions", js.undefined)
    
    @scala.inline
    def setInvalidTransactionsNull: Self = this.set("invalidTransactions", null)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
}
