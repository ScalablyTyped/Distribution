package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellFocusChanged extends IEventArgs {
  var newFieldKey: String
  var newRecordKey: Double
  var oldFieldKey: String
  var oldRecordKey: Double
}

object CellFocusChanged {
  @scala.inline
  def apply(newFieldKey: String, newRecordKey: Double, oldFieldKey: String, oldRecordKey: Double): CellFocusChanged = {
    val __obj = js.Dynamic.literal(newFieldKey = newFieldKey.asInstanceOf[js.Any], newRecordKey = newRecordKey.asInstanceOf[js.Any], oldFieldKey = oldFieldKey.asInstanceOf[js.Any], oldRecordKey = oldRecordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellFocusChanged]
  }
}

