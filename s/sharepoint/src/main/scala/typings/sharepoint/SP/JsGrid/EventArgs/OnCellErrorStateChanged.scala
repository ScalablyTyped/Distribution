package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCellErrorStateChanged extends IEventArgs {
  var bAddingError: Boolean
  var bCellCurrentlyHasError: Boolean
  var bCellHadError: Boolean
  var errorId: Double
  var fieldKey: String
  var recordKey: Double
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
}

