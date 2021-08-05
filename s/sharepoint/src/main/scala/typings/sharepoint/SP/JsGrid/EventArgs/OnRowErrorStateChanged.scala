package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnRowErrorStateChanged
  extends StObject
     with IEventArgs {
  
  var bAddingError: Boolean
  
  var bErrorCurrentlyInRow: Boolean
  
  var bRowHadError: Boolean
  
  var errorId: Double
  
  var message: String
  
  var recordKey: Double
}
object OnRowErrorStateChanged {
  
  inline def apply(
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
  
  extension [Self <: OnRowErrorStateChanged](x: Self) {
    
    inline def setBAddingError(value: Boolean): Self = StObject.set(x, "bAddingError", value.asInstanceOf[js.Any])
    
    inline def setBErrorCurrentlyInRow(value: Boolean): Self = StObject.set(x, "bErrorCurrentlyInRow", value.asInstanceOf[js.Any])
    
    inline def setBRowHadError(value: Boolean): Self = StObject.set(x, "bRowHadError", value.asInstanceOf[js.Any])
    
    inline def setErrorId(value: Double): Self = StObject.set(x, "errorId", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
