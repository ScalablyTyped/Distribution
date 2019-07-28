package typings.slate.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecorationJSON extends RangeTypeJSON {
  var anchor: js.UndefOr[PointJSON] = js.undefined
  var focus: js.UndefOr[PointJSON] = js.undefined
  var mark: js.UndefOr[MarkJSON | Null] = js.undefined
}

object DecorationJSON {
  @scala.inline
  def apply(anchor: PointJSON = null, focus: PointJSON = null, mark: MarkJSON = null): DecorationJSON = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (mark != null) __obj.updateDynamic("mark")(mark)
    __obj.asInstanceOf[DecorationJSON]
  }
}

