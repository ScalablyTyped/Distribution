package typings
package sharepointLib.SPNs.JsGridNs.EventArgsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.OnRecordsReordered")
@js.native
class OnRecordsReordered protected ()
  extends sharepointLib.SPNs.JsGridNs.IEventArgs {
  def this(recordKeys: js.Array[java.lang.String], changeKey: sharepointLib.SPNs.JsGridNs.IChangeKey) = this()
  var changeKey: sharepointLib.SPNs.JsGridNs.IChangeKey = js.native
  var reorderedKeys: js.Array[java.lang.String] = js.native
}

