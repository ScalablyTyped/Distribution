package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITpStateSetRequest extends js.Object {
  
  /** TpStateSetRequest contextId */
  var contextId: js.UndefOr[String | Null] = js.native
  
  /** TpStateSetRequest entries */
  var entries: js.UndefOr[js.Array[ITpStateEntry] | Null] = js.native
}
object ITpStateSetRequest {
  
  @scala.inline
  def apply(): ITpStateSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpStateSetRequest]
  }
  
  @scala.inline
  implicit class ITpStateSetRequestOps[Self <: ITpStateSetRequest] (val x: Self) extends AnyVal {
    
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
    def setContextId(value: String): Self = this.set("contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextId: Self = this.set("contextId", js.undefined)
    
    @scala.inline
    def setContextIdNull: Self = this.set("contextId", null)
    
    @scala.inline
    def setEntriesVarargs(value: ITpStateEntry*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[ITpStateEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    
    @scala.inline
    def setEntriesNull: Self = this.set("entries", null)
  }
}
