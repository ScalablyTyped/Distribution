package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.CellFocusChanged")
@js.native
class CellFocusChanged protected () extends IEventArgs {
  def this(newRecordKey: Double, newFieldKey: String, oldRecordKey: Double, oldFieldKey: String) = this()
  var newFieldKey: String = js.native
  var newRecordKey: Double = js.native
  var oldFieldKey: String = js.native
  var oldRecordKey: Double = js.native
}

