package typings.sharepoint.SPNs.JsGridNs.EventArgsNs

import typings.sharepoint.SPNs.JsGridNs.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.OnRowErrorStateChanged")
@js.native
class OnRowErrorStateChanged protected () extends IEventArgs {
  def this(
    recordKey: Double,
    bAddingError: Boolean,
    bErrorCurrentlyInRow: Boolean,
    bRowHadError: Boolean,
    errorId: Double,
    message: String
  ) = this()
  var bAddingError: Boolean = js.native
  var bErrorCurrentlyInRow: Boolean = js.native
  var bRowHadError: Boolean = js.native
  var errorId: Double = js.native
  var message: String = js.native
  var recordKey: Double = js.native
}

