package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class OnCellErrorStateChangedOps[Self <: OnCellErrorStateChanged] (val x: Self) extends AnyVal {
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
    def setBCellCurrentlyHasError(value: Boolean): Self = this.set("bCellCurrentlyHasError", value.asInstanceOf[js.Any])
    @scala.inline
    def setBCellHadError(value: Boolean): Self = this.set("bCellHadError", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorId(value: Double): Self = this.set("errorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldKey(value: String): Self = this.set("fieldKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordKey(value: Double): Self = this.set("recordKey", value.asInstanceOf[js.Any])
  }
  
}

