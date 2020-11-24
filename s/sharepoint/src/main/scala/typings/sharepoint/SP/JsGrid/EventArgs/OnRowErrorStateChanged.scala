package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
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
  implicit class OnRowErrorStateChangedOps[Self <: OnRowErrorStateChanged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBAddingError(value: Boolean): Self = this.set("bAddingError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBErrorCurrentlyInRow(value: Boolean): Self = this.set("bErrorCurrentlyInRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBRowHadError(value: Boolean): Self = this.set("bRowHadError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorId(value: Double): Self = this.set("errorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordKey(value: Double): Self = this.set("recordKey", value.asInstanceOf[js.Any])
  }
}
