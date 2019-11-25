package typings.slate.slateMod

import typings.slate.slateStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeProperties extends RangeTypeProperties {
  var anchor: js.UndefOr[Point] = js.undefined
  var focus: js.UndefOr[Point] = js.undefined
  var `object`: js.UndefOr[range] = js.undefined
}

object RangeProperties {
  @scala.inline
  def apply(anchor: Point = null, focus: Point = null, `object`: range = null): RangeProperties = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeProperties]
  }
}

