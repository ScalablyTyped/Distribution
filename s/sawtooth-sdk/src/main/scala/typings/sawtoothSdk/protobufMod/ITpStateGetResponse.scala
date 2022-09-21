package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpStateGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITpStateGetResponse extends StObject {
  
  /** TpStateGetResponse entries */
  var entries: js.UndefOr[js.Array[ITpStateEntry] | Null] = js.undefined
  
  /** TpStateGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object ITpStateGetResponse {
  
  inline def apply(): ITpStateGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpStateGetResponse]
  }
  
  extension [Self <: ITpStateGetResponse](x: Self) {
    
    inline def setEntries(value: js.Array[ITpStateEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesNull: Self = StObject.set(x, "entries", null)
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: ITpStateEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
