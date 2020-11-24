package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnEntryRecordCommitted extends IEventArgs {
  
  var changeKey: IChangeKey = js.native
  
  var originalRecordKey: Double = js.native
  
  var recordKey: Double = js.native
}
object OnEntryRecordCommitted {
  
  @scala.inline
  def apply(changeKey: IChangeKey, originalRecordKey: Double, recordKey: Double): OnEntryRecordCommitted = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any], originalRecordKey = originalRecordKey.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEntryRecordCommitted]
  }
  
  @scala.inline
  implicit class OnEntryRecordCommittedOps[Self <: OnEntryRecordCommitted] (val x: Self) extends AnyVal {
    
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
    def setChangeKey(value: IChangeKey): Self = this.set("changeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalRecordKey(value: Double): Self = this.set("originalRecordKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordKey(value: Double): Self = this.set("recordKey", value.asInstanceOf[js.Any])
  }
}
