package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnCellErrorStateChanged extends IEventArgs {
  
  var bAddingError: Boolean = js.native
  
  var bCellCurrentlyHasError: Boolean = js.native
  
  var bCellHadError: Boolean = js.native
  
  var errorId: Double = js.native
  
  var fieldKey: String = js.native
  
  var recordKey: Double = js.native
}
object OnCellErrorStateChanged {
  
  @scala.inline
  def apply(
    bAddingError: Boolean,
    bCellCurrentlyHasError: Boolean,
    bCellHadError: Boolean,
    errorId: Double,
    fieldKey: String,
    recordKey: Double
  ): OnCellErrorStateChanged = {
    val __obj = js.Dynamic.literal(bAddingError = bAddingError.asInstanceOf[js.Any], bCellCurrentlyHasError = bCellCurrentlyHasError.asInstanceOf[js.Any], bCellHadError = bCellHadError.asInstanceOf[js.Any], errorId = errorId.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCellErrorStateChanged]
  }
  
  @scala.inline
  implicit class OnCellErrorStateChangedMutableBuilder[Self <: OnCellErrorStateChanged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBAddingError(value: Boolean): Self = StObject.set(x, "bAddingError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBCellCurrentlyHasError(value: Boolean): Self = StObject.set(x, "bCellCurrentlyHasError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBCellHadError(value: Boolean): Self = StObject.set(x, "bCellHadError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorId(value: Double): Self = StObject.set(x, "errorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldKey(value: String): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
