package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientBlockListRequest extends js.Object {
  
  /** ClientBlockListRequest blockIds */
  var blockIds: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** ClientBlockListRequest headId */
  var headId: js.UndefOr[String | Null] = js.native
  
  /** ClientBlockListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.native
  
  /** ClientBlockListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.native
}
object IClientBlockListRequest {
  
  @scala.inline
  def apply(): IClientBlockListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBlockListRequest]
  }
  
  @scala.inline
  implicit class IClientBlockListRequestOps[Self <: IClientBlockListRequest] (val x: Self) extends AnyVal {
    
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
    def setBlockIdsVarargs(value: String*): Self = this.set("blockIds", js.Array(value :_*))
    
    @scala.inline
    def setBlockIds(value: js.Array[String]): Self = this.set("blockIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockIds: Self = this.set("blockIds", js.undefined)
    
    @scala.inline
    def setBlockIdsNull: Self = this.set("blockIds", null)
    
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
