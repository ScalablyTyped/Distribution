package typings.sharepoint.global.SP.JsGrid.EventArgs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.OnEndRenameColumn")
@js.native
class OnEndRenameColumn protected ()
  extends typings.sharepoint.SP.JsGrid.EventArgs.OnEndRenameColumn {
  def this(columnKey: String, originalColumnTitle: String, newColumnTitle: String) = this()
  /* CompleteClass */
  override var columnKey: String = js.native
  /* CompleteClass */
  override var newColumnTitle: String = js.native
  /* CompleteClass */
  override var originalColumnTitle: String = js.native
}

