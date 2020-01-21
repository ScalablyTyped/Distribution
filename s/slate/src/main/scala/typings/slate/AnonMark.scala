package typings.slate

import typings.slate.mod.MarkJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMark extends js.Object {
  var mark: js.UndefOr[MarkJSON] = js.undefined
}

object AnonMark {
  @scala.inline
  def apply(mark: MarkJSON = null): AnonMark = {
    val __obj = js.Dynamic.literal()
    if (mark != null) __obj.updateDynamic("mark")(mark.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMark]
  }
}

