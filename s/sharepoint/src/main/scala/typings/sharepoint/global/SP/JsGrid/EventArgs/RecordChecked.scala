package typings.sharepoint.global.SP.JsGrid.EventArgs

import typings.sharepoint.SP.Utilities.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.RecordChecked")
@js.native
class RecordChecked protected ()
  extends typings.sharepoint.SP.JsGrid.EventArgs.RecordChecked {
  def this(recordKeySet: Set, bChecked: Boolean) = this()
  /* CompleteClass */
  override var bChecked: Boolean = js.native
  /* CompleteClass */
  override var recordKeySet: Set = js.native
}

