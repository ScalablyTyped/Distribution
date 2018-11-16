package typings
package sharepointLib.SPNs.JsGridNs.EventArgsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.RecordDeleted")
@js.native
class RecordDeleted protected ()
  extends sharepointLib.SPNs.JsGridNs.IEventArgs {
  def this(recordKey: scala.Double, recordIdx: scala.Double, changeKey: sharepointLib.SPNs.JsGridNs.IChangeKey) = this()
  var changeKey: sharepointLib.SPNs.JsGridNs.IChangeKey = js.native
  var recordIdx: scala.Double = js.native
  var recordKey: scala.Double = js.native
}

