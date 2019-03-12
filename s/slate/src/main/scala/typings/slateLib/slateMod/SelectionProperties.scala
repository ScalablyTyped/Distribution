package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionProperties extends RangeTypeProperties {
  var anchor: js.UndefOr[Point] = js.undefined
  var focus: js.UndefOr[Point] = js.undefined
  var isFocused: js.UndefOr[scala.Boolean] = js.undefined
  var marks: js.UndefOr[immutableLib.immutableMod.Set[Mark] | scala.Null] = js.undefined
}

object SelectionProperties {
  @scala.inline
  def apply(
    anchor: Point = null,
    focus: Point = null,
    isFocused: js.UndefOr[scala.Boolean] = js.undefined,
    marks: immutableLib.immutableMod.Set[Mark] = null
  ): SelectionProperties = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused)
    if (marks != null) __obj.updateDynamic("marks")(marks)
    __obj.asInstanceOf[SelectionProperties]
  }
}

