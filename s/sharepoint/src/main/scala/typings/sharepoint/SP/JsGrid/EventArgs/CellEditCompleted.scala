package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellEditCompleted
  extends StObject
     with IEventArgs {
  
  var bCancelled: Boolean
  
  var changeKey: IChangeKey
  
  var fieldKey: String
  
  var recordKey: Double
}
object CellEditCompleted {
  
  @scala.inline
  def apply(bCancelled: Boolean, changeKey: IChangeKey, fieldKey: String, recordKey: Double): CellEditCompleted = {
    val __obj = js.Dynamic.literal(bCancelled = bCancelled.asInstanceOf[js.Any], changeKey = changeKey.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellEditCompleted]
  }
  
  @scala.inline
  implicit class CellEditCompletedMutableBuilder[Self <: CellEditCompleted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBCancelled(value: Boolean): Self = StObject.set(x, "bCancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeKey(value: IChangeKey): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldKey(value: String): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
