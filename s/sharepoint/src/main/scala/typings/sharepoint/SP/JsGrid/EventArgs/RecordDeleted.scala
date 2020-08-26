package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordDeleted extends IEventArgs {
  var changeKey: IChangeKey = js.native
  var recordIdx: Double = js.native
  var recordKey: Double = js.native
}

object RecordDeleted {
  @scala.inline
  def apply(changeKey: IChangeKey, recordIdx: Double, recordKey: Double): RecordDeleted = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any], recordIdx = recordIdx.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordDeleted]
  }
  @scala.inline
  implicit class RecordDeletedOps[Self <: RecordDeleted] (val x: Self) extends AnyVal {
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
    def setRecordIdx(value: Double): Self = this.set("recordIdx", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordKey(value: Double): Self = this.set("recordKey", value.asInstanceOf[js.Any])
  }
  
}

