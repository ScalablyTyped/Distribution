package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
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
  implicit class CellFocusChangedOps[Self <: CellFocusChanged] (val x: Self) extends AnyVal {
    
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
    def setNewFieldKey(value: String): Self = this.set("newFieldKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewRecordKey(value: Double): Self = this.set("newRecordKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldFieldKey(value: String): Self = this.set("oldFieldKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldRecordKey(value: Double): Self = this.set("oldRecordKey", value.asInstanceOf[js.Any])
  }
}
