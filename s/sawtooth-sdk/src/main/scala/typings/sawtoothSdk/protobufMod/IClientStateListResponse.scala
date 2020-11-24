package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientStateListResponse.IEntry
import typings.sawtoothSdk.protobufMod.ClientStateListResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientStateListResponse extends js.Object {
  
  /** ClientStateListResponse entries */
  var entries: js.UndefOr[js.Array[IEntry] | Null] = js.native
  
  /** ClientStateListResponse paging */
  var paging: js.UndefOr[IClientPagingResponse | Null] = js.native
  
  /** ClientStateListResponse stateRoot */
  var stateRoot: js.UndefOr[String | Null] = js.native
  
  /** ClientStateListResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object IClientStateListResponse {
  
  @scala.inline
  def apply(): IClientStateListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientStateListResponse]
  }
  
  @scala.inline
  implicit class IClientStateListResponseOps[Self <: IClientStateListResponse] (val x: Self) extends AnyVal {
    
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
    def setEntriesVarargs(value: IEntry*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[IEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    
    @scala.inline
    def setEntriesNull: Self = this.set("entries", null)
    
    @scala.inline
    def setPaging(value: IClientPagingResponse): Self = this.set("paging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaging: Self = this.set("paging", js.undefined)
    
    @scala.inline
    def setPagingNull: Self = this.set("paging", null)
    
    @scala.inline
    def setStateRoot(value: String): Self = this.set("stateRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateRoot: Self = this.set("stateRoot", js.undefined)
    
    @scala.inline
    def setStateRootNull: Self = this.set("stateRoot", null)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
}
