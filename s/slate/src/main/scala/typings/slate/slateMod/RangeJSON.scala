package typings.slate.slateMod

import typings.slate.slateStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeJSON extends RangeTypeJSON {
  var anchor: js.UndefOr[PointJSON] = js.undefined
  var focus: js.UndefOr[PointJSON] = js.undefined
  var `object`: js.UndefOr[range] = js.undefined
}

object RangeJSON {
  @scala.inline
  def apply(anchor: PointJSON = null, focus: PointJSON = null, `object`: range = null): RangeJSON = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[RangeJSON]
  }
}

