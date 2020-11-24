package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellEditCompleted extends IEventArgs {
  
  var bCancelled: Boolean = js.native
  
  var changeKey: IChangeKey = js.native
  
  var fieldKey: String = js.native
  
  var recordKey: Double = js.native
}
object CellEditCompleted {
  
  @scala.inline
  def apply(bCancelled: Boolean, changeKey: IChangeKey, fieldKey: String, recordKey: Double): CellEditCompleted = {
    val __obj = js.Dynamic.literal(bCancelled = bCancelled.asInstanceOf[js.Any], changeKey = changeKey.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellEditCompleted]
  }
  
  @scala.inline
  implicit class CellEditCompletedOps[Self <: CellEditCompleted] (val x: Self) extends AnyVal {
    
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
    def setBCancelled(value: Boolean): Self = this.set("bCancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeKey(value: IChangeKey): Self = this.set("changeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldKey(value: String): Self = this.set("fieldKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordKey(value: Double): Self = this.set("recordKey", value.asInstanceOf[js.Any])
  }
}
