package typings
package sharepointLib.SPNs.JsGridNs.EventArgsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.OnRowErrorStateChanged")
@js.native
class OnRowErrorStateChanged protected ()
  extends sharepointLib.SPNs.JsGridNs.IEventArgs {
  def this(recordKey: scala.Double, bAddingError: scala.Boolean, bErrorCurrentlyInRow: scala.Boolean, bRowHadError: scala.Boolean, errorId: scala.Double, message: java.lang.String) = this()
  var bAddingError: scala.Boolean = js.native
  var bErrorCurrentlyInRow: scala.Boolean = js.native
  var bRowHadError: scala.Boolean = js.native
  var errorId: scala.Double = js.native
  var message: java.lang.String = js.native
  var recordKey: scala.Double = js.native
}

