package typings.slate.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeJSON extends RangeTypeJSON {
  var anchor: js.UndefOr[PointJSON] = js.undefined
  var focus: js.UndefOr[PointJSON] = js.undefined
}

object RangeJSON {
  @scala.inline
  def apply(anchor: PointJSON = null, focus: PointJSON = null): RangeJSON = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    __obj.asInstanceOf[RangeJSON]
  }
}

