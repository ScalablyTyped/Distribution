package typings.slate

import typings.slate.slateMod.MarkJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mark extends js.Object {
  var mark: js.UndefOr[MarkJSON] = js.undefined
}

object Anon_Mark {
  @scala.inline
  def apply(mark: MarkJSON = null): Anon_Mark = {
    val __obj = js.Dynamic.literal()
    if (mark != null) __obj.updateDynamic("mark")(mark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Mark]
  }
}

