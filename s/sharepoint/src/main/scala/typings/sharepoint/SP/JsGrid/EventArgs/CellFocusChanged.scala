package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellFocusChanged extends IEventArgs {
  
  var newFieldKey: String = js.native
  
  var newRecordKey: Double = js.native
  
  var oldFieldKey: String = js.native
  
  var oldRecordKey: Double = js.native
}
object CellFocusChanged {
  
  @scala.inline
  def apply(newFieldKey: String, newRecordKey: Double, oldFieldKey: String, oldRecordKey: Double): CellFocusChanged = {
    val __obj = js.Dynamic.literal(newFieldKey = newFieldKey.asInstanceOf[js.Any], newRecordKey = newRecordKey.asInstanceOf[js.Any], oldFieldKey = oldFieldKey.asInstanceOf[js.Any], oldRecordKey = oldRecordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellFocusChanged]
  }
  
  @scala.inline
  implicit class CellFocusChangedMutableBuilder[Self <: CellFocusChanged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewFieldKey(value: String): Self = StObject.set(x, "newFieldKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewRecordKey(value: Double): Self = StObject.set(x, "newRecordKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldFieldKey(value: String): Self = StObject.set(x, "oldFieldKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldRecordKey(value: Double): Self = StObject.set(x, "oldRecordKey", value.asInstanceOf[js.Any])
  }
}
