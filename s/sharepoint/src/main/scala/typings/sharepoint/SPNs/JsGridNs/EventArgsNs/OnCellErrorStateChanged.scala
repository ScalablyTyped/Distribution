package typings.sharepoint.SPNs.JsGridNs.EventArgsNs

import typings.sharepoint.SPNs.JsGridNs.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.OnCellErrorStateChanged")
@js.native
class OnCellErrorStateChanged protected () extends IEventArgs {
  def this(
    recordKey: Double,
    fieldKey: String,
    bAddingError: Boolean,
    bCellCurrentlyHasError: Boolean,
    bCellHadError: Boolean,
    errorId: Double
  ) = this()
  var bAddingError: Boolean = js.native
  var bCellCurrentlyHasError: Boolean = js.native
  var bCellHadError: Boolean = js.native
  var errorId: Double = js.native
  var fieldKey: String = js.native
  var recordKey: Double = js.native
}

