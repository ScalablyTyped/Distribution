package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientBatchListResponse extends js.Object {
  
  /** ClientBatchListResponse batches */
  var batches: js.UndefOr[js.Array[IBatch] | Null] = js.native
  
  /** ClientBatchListResponse headId */
  var headId: js.UndefOr[String | Null] = js.native
  
  /** ClientBatchListResponse paging */
  var paging: js.UndefOr[IClientPagingResponse | Null] = js.native
  
  /** ClientBatchListResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object IClientBatchListResponse {
  
  @scala.inline
  def apply(): IClientBatchListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchListResponse]
  }
  
  @scala.inline
  implicit class IClientBatchListResponseOps[Self <: IClientBatchListResponse] (val x: Self) extends AnyVal {
    
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
    def setBatchesVarargs(value: IBatch*): Self = this.set("batches", js.Array(value :_*))
    
    @scala.inline
    def setBatches(value: js.Array[IBatch]): Self = this.set("batches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatches: Self = this.set("batches", js.undefined)
    
    @scala.inline
    def setBatchesNull: Self = this.set("batches", null)
    
    @scala.inline
    def setHeadId(value: String): Self = this.set("headId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadId: Self = this.set("headId", js.undefined)
    
    @scala.inline
    def setHeadIdNull: Self = this.set("headId", null)
    
    @scala.inline
    def setPaging(value: IClientPagingResponse): Self = this.set("paging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaging: Self = this.set("paging", js.undefined)
    
    @scala.inline
    def setPagingNull: Self = this.set("paging", null)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
}
