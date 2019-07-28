package typings.sharepoint.SPNs.JsGridNs.EventArgsNs

import typings.sharepoint.SPNs.JsGridNs.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.CellEditBegin")
@js.native
class CellEditBegin protected () extends IEventArgs {
  def this(recordKey: Double, fieldKey: String) = this()
  var fieldKey: String = js.native
  var recordKey: Double = js.native
}

