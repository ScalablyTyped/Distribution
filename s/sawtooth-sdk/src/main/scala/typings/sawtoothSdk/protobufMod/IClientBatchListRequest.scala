package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientBatchListRequest extends js.Object {
  
  /** ClientBatchListRequest batchIds */
  var batchIds: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** ClientBatchListRequest headId */
  var headId: js.UndefOr[String | Null] = js.native
  
  /** ClientBatchListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.native
  
  /** ClientBatchListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.native
}
object IClientBatchListRequest {
  
  @scala.inline
  def apply(): IClientBatchListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchListRequest]
  }
  
  @scala.inline
  implicit class IClientBatchListRequestOps[Self <: IClientBatchListRequest] (val x: Self) extends AnyVal {
    
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
    def setBatchIdsVarargs(value: String*): Self = this.set("batchIds", js.Array(value :_*))
    
    @scala.inline
    def setBatchIds(value: js.Array[String]): Self = this.set("batchIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchIds: Self = this.set("batchIds", js.undefined)
    
    @scala.inline
    def setBatchIdsNull: Self = this.set("batchIds", null)
    
    @scala.inline
    def setHeadId(value: String): Self = this.set("headId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadId: Self = this.set("headId", js.undefined)
    
    @scala.inline
    def setHeadIdNull: Self = this.set("headId", null)
    
    @scala.inline
    def setPaging(value: IClientPagingControls): Self = this.set("paging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaging: Self = this.set("paging", js.undefined)
    
    @scala.inline
    def setPagingNull: Self = this.set("paging", null)
    
    @scala.inline
    def setSortingVarargs(value: IClientSortControls*): Self = this.set("sorting", js.Array(value :_*))
    
    @scala.inline
    def setSorting(value: js.Array[IClientSortControls]): Self = this.set("sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorting: Self = this.set("sorting", js.undefined)
    
    @scala.inline
    def setSortingNull: Self = this.set("sorting", null)
  }
}
