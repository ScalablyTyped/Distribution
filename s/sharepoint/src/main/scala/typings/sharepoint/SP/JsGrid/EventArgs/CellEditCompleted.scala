package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.CellEditCompleted")
@js.native
class CellEditCompleted protected () extends IEventArgs {
  def this(recordKey: Double, fieldKey: String, changeKey: IChangeKey, bCancelled: Boolean) = this()
  var bCancelled: Boolean = js.native
  var changeKey: IChangeKey = js.native
  var fieldKey: String = js.native
  var recordKey: Double = js.native
}

