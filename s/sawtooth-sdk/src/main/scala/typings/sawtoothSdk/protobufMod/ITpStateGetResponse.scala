package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpStateGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITpStateGetResponse extends StObject {
  
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
  implicit class ITpStateGetResponseMutableBuilder[Self <: ITpStateGetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[ITpStateEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesNull: Self = StObject.set(x, "entries", null)
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: ITpStateEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
