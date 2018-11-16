package typings
package sharepointLib.SPNs.JsGridNs.EventArgsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.OnCellErrorStateChanged")
@js.native
class OnCellErrorStateChanged protected ()
  extends sharepointLib.SPNs.JsGridNs.IEventArgs {
  def this(recordKey: scala.Double, fieldKey: java.lang.String, bAddingError: scala.Boolean, bCellCurrentlyHasError: scala.Boolean, bCellHadError: scala.Boolean, errorId: scala.Double) = this()
  var bAddingError: scala.Boolean = js.native
  var bCellCurrentlyHasError: scala.Boolean = js.native
  var bCellHadError: scala.Boolean = js.native
  var errorId: scala.Double = js.native
  var fieldKey: java.lang.String = js.native
  var recordKey: scala.Double = js.native
}

