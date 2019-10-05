package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.RowFocusChanged")
@js.native
class RowFocusChanged protected () extends IEventArgs {
  def this(newRecordKey: Double, oldRecordKey: Double) = this()
  var newRecordKey: Double = js.native
  var oldRecordKey: Double = js.native
}

