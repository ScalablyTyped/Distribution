package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeProperties extends RangeTypeProperties {
  var anchor: js.UndefOr[Point] = js.undefined
  var focus: js.UndefOr[Point] = js.undefined
}

object RangeProperties {
  @scala.inline
  def apply(anchor: Point = null, focus: Point = null): RangeProperties = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    __obj.asInstanceOf[RangeProperties]
  }
}

