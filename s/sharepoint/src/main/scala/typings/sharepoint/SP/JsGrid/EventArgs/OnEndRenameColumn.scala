package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.OnEndRenameColumn")
@js.native
class OnEndRenameColumn protected () extends IEventArgs {
  def this(columnKey: String, originalColumnTitle: String, newColumnTitle: String) = this()
  var columnKey: String = js.native
  var newColumnTitle: String = js.native
  var originalColumnTitle: String = js.native
}

