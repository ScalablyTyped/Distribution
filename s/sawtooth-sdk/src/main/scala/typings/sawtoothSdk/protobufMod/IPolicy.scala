package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.Policy.IEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPolicy extends StObject {
  
  /** Policy entries */
  var entries: js.UndefOr[js.Array[IEntry] | Null] = js.undefined
  
  /** Policy name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IPolicy {
  
  inline def apply(): IPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolicy]
  }
  
  extension [Self <: IPolicy](x: Self) {
    
    inline def setEntries(value: js.Array[IEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesNull: Self = StObject.set(x, "entries", null)
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: IEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
