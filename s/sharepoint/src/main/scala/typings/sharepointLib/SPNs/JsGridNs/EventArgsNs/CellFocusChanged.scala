package typings
package sharepointLib.SPNs.JsGridNs.EventArgsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.CellFocusChanged")
@js.native
class CellFocusChanged protected ()
  extends sharepointLib.SPNs.JsGridNs.IEventArgs {
  def this(newRecordKey: scala.Double, newFieldKey: java.lang.String, oldRecordKey: scala.Double, oldFieldKey: java.lang.String) = this()
  var newFieldKey: java.lang.String = js.native
  var newRecordKey: scala.Double = js.native
  var oldFieldKey: java.lang.String = js.native
  var oldRecordKey: scala.Double = js.native
}

