package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnEntryRecordAdded extends IEventArgs {
  var recordKey: Double = js.native
}

object OnEntryRecordAdded {
  @scala.inline
  def apply(recordKey: Double): OnEntryRecordAdded = {
    val __obj = js.Dynamic.literal(recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEntryRecordAdded]
  }
  @scala.inline
  implicit class OnEntryRecordAddedOps[Self <: OnEntryRecordAdded] (val x: Self) extends AnyVal {
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
    def setRecordKey(value: Double): Self = this.set("recordKey", value.asInstanceOf[js.Any])
  }
  
}

