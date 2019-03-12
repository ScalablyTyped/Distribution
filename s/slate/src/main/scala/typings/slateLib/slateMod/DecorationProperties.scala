package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecorationProperties extends RangeTypeProperties {
  var anchor: js.UndefOr[Point] = js.undefined
  var focus: js.UndefOr[Point] = js.undefined
  var mark: js.UndefOr[Mark | scala.Null] = js.undefined
}

object DecorationProperties {
  @scala.inline
  def apply(anchor: Point = null, focus: Point = null, mark: Mark = null): DecorationProperties = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (mark != null) __obj.updateDynamic("mark")(mark)
    __obj.asInstanceOf[DecorationProperties]
  }
}

