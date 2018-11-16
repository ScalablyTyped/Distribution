package typings
package sharepointLib.SPNs.JsGridNs.EventArgsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.RecordChecked")
@js.native
class RecordChecked protected ()
  extends sharepointLib.SPNs.JsGridNs.IEventArgs {
  def this(recordKeySet: sharepointLib.SPNs.UtilitiesNs.Set, bChecked: scala.Boolean) = this()
  var bChecked: scala.Boolean = js.native
  var recordKeySet: sharepointLib.SPNs.UtilitiesNs.Set = js.native
}

