package typings.sharepoint.SPNs.JsGridNs.EventArgsNs

import typings.sharepoint.SPNs.JsGridNs.IEventArgs
import typings.sharepoint.SPNs.UtilitiesNs.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.RecordChecked")
@js.native
class RecordChecked protected () extends IEventArgs {
  def this(recordKeySet: Set, bChecked: Boolean) = this()
  var bChecked: Boolean = js.native
  var recordKeySet: Set = js.native
}

