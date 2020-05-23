package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRowErrorStateChanged extends IEventArgs {
  var bAddingError: Boolean
  var bErrorCurrentlyInRow: Boolean
  var bRowHadError: Boolean
  var errorId: Double
  var message: String
  var recordKey: Double
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
}

