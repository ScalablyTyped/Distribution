package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.Setting.IEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISetting extends StObject {
  
  /** Setting entries */
  var entries: js.UndefOr[js.Array[IEntry] | Null] = js.undefined
}
object ISetting {
  
  inline def apply(): ISetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISetting] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: js.Array[IEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesNull: Self = StObject.set(x, "entries", null)
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: IEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
