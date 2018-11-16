package typings
package sharepointLib.SPNs.JsGridNs.EventArgsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.OnEntryRecordCommitted")
@js.native
class OnEntryRecordCommitted protected ()
  extends sharepointLib.SPNs.JsGridNs.IEventArgs {
  def this(origRecKey: java.lang.String, recordKey: scala.Double, changeKey: sharepointLib.SPNs.JsGridNs.IChangeKey) = this()
  var changeKey: sharepointLib.SPNs.JsGridNs.IChangeKey = js.native
  var originalRecordKey: scala.Double = js.native
  var recordKey: scala.Double = js.native
}

