package typings
package sharepointLib.SPNs.JsGridNs.EventArgsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.RecordInserted")
@js.native
class RecordInserted protected ()
  extends sharepointLib.SPNs.JsGridNs.IEventArgs {
  def this(recordKey: scala.Double, recordIdx: scala.Double, afterRecordKey: scala.Double, changeKey: sharepointLib.SPNs.JsGridNs.IChangeKey) = this()
  var afterRecordKey: scala.Double = js.native
  var changeKey: sharepointLib.SPNs.JsGridNs.IChangeKey = js.native
  var recordIdx: scala.Double = js.native
  var recordKey: scala.Double = js.native
}

