package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnRowErrorStateChanged extends IEventArgs {
  
  var bAddingError: Boolean = js.native
  
  var bErrorCurrentlyInRow: Boolean = js.native
  
  var bRowHadError: Boolean = js.native
  
  var errorId: Double = js.native
  
  var message: String = js.native
  
  var recordKey: Double = js.native
}
object OnRowErrorStateChanged {
  
  @scala.inline
  def apply(
    bAddingError: Boolean,
    bErrorCurrentlyInRow: Boolean,
    bRowHadError: Boolean,
    errorId: Double,
    message: String,
    recordKey: Double
  ): OnRowErrorStateChanged = {
    val __obj = js.Dynamic.literal(bAddingError = bAddingError.asInstanceOf[js.Any], bErrorCurrentlyInRow = bErrorCurrentlyInRow.asInstanceOf[js.Any], bRowHadError = bRowHadError.asInstanceOf[js.Any], errorId = errorId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRowErrorStateChanged]
  }
  
  @scala.inline
  implicit class OnRowErrorStateChangedMutableBuilder[Self <: OnRowErrorStateChanged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBAddingError(value: Boolean): Self = StObject.set(x, "bAddingError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBErrorCurrentlyInRow(value: Boolean): Self = StObject.set(x, "bErrorCurrentlyInRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBRowHadError(value: Boolean): Self = StObject.set(x, "bRowHadError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorId(value: Double): Self = StObject.set(x, "errorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
