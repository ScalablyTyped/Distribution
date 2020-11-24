package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpStateGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITpStateGetResponse extends js.Object {
  
  /** TpStateGetResponse entries */
  var entries: js.UndefOr[js.Array[ITpStateEntry] | Null] = js.native
  
  /** TpStateGetResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object ITpStateGetResponse {
  
  @scala.inline
  def apply(): ITpStateGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpStateGetResponse]
  }
  
  @scala.inline
  implicit class ITpStateGetResponseOps[Self <: ITpStateGetResponse] (val x: Self) extends AnyVal {
    
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
    def setEntriesVarargs(value: ITpStateEntry*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[ITpStateEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    
    @scala.inline
    def setEntriesNull: Self = this.set("entries", null)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
}
