package typings.sharepoint.SPNs.JsGridNs.EventArgsNs

import typings.sharepoint.SPNs.JsGridNs.IChangeKey
import typings.sharepoint.SPNs.JsGridNs.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.OnRecordsReordered")
@js.native
class OnRecordsReordered protected () extends IEventArgs {
  def this(recordKeys: js.Array[String], changeKey: IChangeKey) = this()
  var changeKey: IChangeKey = js.native
  var reorderedKeys: js.Array[String] = js.native
}

