package typings.sharepoint.global.SP.JsGrid.EventArgs

import typings.microsoftAjax.Sys.UI.DomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.SingleCellKeyDown")
@js.native
class SingleCellKeyDown protected ()
  extends typings.sharepoint.SP.JsGrid.EventArgs.SingleCellKeyDown {
  def this(eventInfo: DomEvent, recordKey: Double, fieldKey: String) = this()
  /* CompleteClass */
  override var eventInfo: DomEvent = js.native
  /* CompleteClass */
  override var fieldKey: String = js.native
  /* CompleteClass */
  override var recordKey: Double = js.native
}

