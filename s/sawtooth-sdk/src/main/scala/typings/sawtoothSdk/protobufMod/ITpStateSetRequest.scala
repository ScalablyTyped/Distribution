package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITpStateSetRequest extends StObject {
  
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
  implicit class ITpStateSetRequestMutableBuilder[Self <: ITpStateSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextId(value: String): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextIdNull: Self = StObject.set(x, "contextId", null)
    
    @scala.inline
    def setContextIdUndefined: Self = StObject.set(x, "contextId", js.undefined)
    
    @scala.inline
    def setEntries(value: js.Array[ITpStateEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesNull: Self = StObject.set(x, "entries", null)
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: ITpStateEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
