package typings
package sharepointLib.SPNs.JsGridNs.EventArgsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.OnEndRenameColumn")
@js.native
class OnEndRenameColumn protected ()
  extends sharepointLib.SPNs.JsGridNs.IEventArgs {
  def this(columnKey: java.lang.String, originalColumnTitle: java.lang.String, newColumnTitle: java.lang.String) = this()
  var columnKey: java.lang.String = js.native
  var newColumnTitle: java.lang.String = js.native
  var originalColumnTitle: java.lang.String = js.native
}

