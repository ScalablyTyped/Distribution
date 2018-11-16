package typings
package sharepointLib.SPNs.JsGridNs.EventArgsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.CellEditCompleted")
@js.native
class CellEditCompleted protected ()
  extends sharepointLib.SPNs.JsGridNs.IEventArgs {
  def this(recordKey: scala.Double, fieldKey: java.lang.String, changeKey: sharepointLib.SPNs.JsGridNs.IChangeKey, bCancelled: scala.Boolean) = this()
  var bCancelled: scala.Boolean = js.native
  var changeKey: sharepointLib.SPNs.JsGridNs.IChangeKey = js.native
  var fieldKey: java.lang.String = js.native
  var recordKey: scala.Double = js.native
}

