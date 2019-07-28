package typings.sharepoint.SPNs.JsGridNs.EventArgsNs

import typings.sharepoint.SPNs.JsGridNs.IChangeKey
import typings.sharepoint.SPNs.JsGridNs.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.OnBeginRedoDataUpdateChange")
@js.native
class OnBeginRedoDataUpdateChange protected () extends IEventArgs {
  def this(changeKey: IChangeKey) = this()
  var changeKey: IChangeKey = js.native
}

