package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.Setting.IEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISetting extends StObject {
  
  /** Setting entries */
  var entries: js.UndefOr[js.Array[IEntry] | Null] = js.native
}
object ISetting {
  
  @scala.inline
  def apply(): ISetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISetting]
  }
  
  @scala.inline
  implicit class ISettingMutableBuilder[Self <: ISetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[IEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesNull: Self = StObject.set(x, "entries", null)
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: IEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
