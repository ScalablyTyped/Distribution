package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowFocusChanged
  extends StObject
     with IEventArgs {
  
  var newRecordKey: Double
  
  var oldRecordKey: Double
}
object RowFocusChanged {
  
  @scala.inline
  def apply(newRecordKey: Double, oldRecordKey: Double): RowFocusChanged = {
    val __obj = js.Dynamic.literal(newRecordKey = newRecordKey.asInstanceOf[js.Any], oldRecordKey = oldRecordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowFocusChanged]
  }
  
  @scala.inline
  implicit class RowFocusChangedMutableBuilder[Self <: RowFocusChanged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewRecordKey(value: Double): Self = StObject.set(x, "newRecordKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldRecordKey(value: Double): Self = StObject.set(x, "oldRecordKey", value.asInstanceOf[js.Any])
  }
}
