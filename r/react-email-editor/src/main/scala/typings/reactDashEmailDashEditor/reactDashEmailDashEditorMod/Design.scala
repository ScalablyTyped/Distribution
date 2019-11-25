package typings.reactDashEmailDashEditor.reactDashEmailDashEditorMod

import typings.reactDashEmailDashEditor.Anon_Rows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Design extends js.Object {
  val body: Anon_Rows
  val counters: js.UndefOr[js.Object] = js.undefined
}

object Design {
  @scala.inline
  def apply(body: Anon_Rows, counters: js.Object = null): Design = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (counters != null) __obj.updateDynamic("counters")(counters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Design]
  }
}

