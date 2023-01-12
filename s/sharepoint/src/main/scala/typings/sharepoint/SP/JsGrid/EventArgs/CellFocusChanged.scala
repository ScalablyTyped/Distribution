package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellFocusChanged
  extends StObject
     with IEventArgs {
  
  var newFieldKey: String
  
  var newRecordKey: Double
  
  var oldFieldKey: String
  
  var oldRecordKey: Double
}
object CellFocusChanged {
  
  inline def apply(newFieldKey: String, newRecordKey: Double, oldFieldKey: String, oldRecordKey: Double): CellFocusChanged = {
    val __obj = js.Dynamic.literal(newFieldKey = newFieldKey.asInstanceOf[js.Any], newRecordKey = newRecordKey.asInstanceOf[js.Any], oldFieldKey = oldFieldKey.asInstanceOf[js.Any], oldRecordKey = oldRecordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellFocusChanged]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellFocusChanged] (val x: Self) extends AnyVal {
    
    inline def setNewFieldKey(value: String): Self = StObject.set(x, "newFieldKey", value.asInstanceOf[js.Any])
    
    inline def setNewRecordKey(value: Double): Self = StObject.set(x, "newRecordKey", value.asInstanceOf[js.Any])
    
    inline def setOldFieldKey(value: String): Self = StObject.set(x, "oldFieldKey", value.asInstanceOf[js.Any])
    
    inline def setOldRecordKey(value: Double): Self = StObject.set(x, "oldRecordKey", value.asInstanceOf[js.Any])
  }
}
