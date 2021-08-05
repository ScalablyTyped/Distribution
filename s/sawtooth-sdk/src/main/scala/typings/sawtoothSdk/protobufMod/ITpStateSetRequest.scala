package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITpStateSetRequest extends StObject {
  
  /** TpStateSetRequest contextId */
  var contextId: js.UndefOr[String | Null] = js.undefined
  
  /** TpStateSetRequest entries */
  var entries: js.UndefOr[js.Array[ITpStateEntry] | Null] = js.undefined
}
object ITpStateSetRequest {
  
  inline def apply(): ITpStateSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpStateSetRequest]
  }
  
  extension [Self <: ITpStateSetRequest](x: Self) {
    
    inline def setContextId(value: String): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    inline def setContextIdNull: Self = StObject.set(x, "contextId", null)
    
    inline def setContextIdUndefined: Self = StObject.set(x, "contextId", js.undefined)
    
    inline def setEntries(value: js.Array[ITpStateEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesNull: Self = StObject.set(x, "entries", null)
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: ITpStateEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
