package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowFocusChanged extends IEventArgs {
  
  var newRecordKey: Double = js.native
  
  var oldRecordKey: Double = js.native
}
object RowFocusChanged {
  
  @scala.inline
  def apply(newRecordKey: Double, oldRecordKey: Double): RowFocusChanged = {
    val __obj = js.Dynamic.literal(newRecordKey = newRecordKey.asInstanceOf[js.Any], oldRecordKey = oldRecordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowFocusChanged]
  }
  
  @scala.inline
  implicit class RowFocusChangedOps[Self <: RowFocusChanged] (val x: Self) extends AnyVal {
    
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
    def setNewRecordKey(value: Double): Self = this.set("newRecordKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldRecordKey(value: Double): Self = this.set("oldRecordKey", value.asInstanceOf[js.Any])
  }
}
