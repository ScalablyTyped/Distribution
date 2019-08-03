package typings.slate.slateMod

import typings.immutable.immutableMod.Set
import typings.slate.slateStrings.selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionProperties extends RangeTypeProperties {
  var anchor: js.UndefOr[Point] = js.undefined
  var focus: js.UndefOr[Point] = js.undefined
  var isFocused: js.UndefOr[Boolean] = js.undefined
  var marks: js.UndefOr[Set[Mark] | js.Array[Mark]] = js.undefined
  var `object`: js.UndefOr[selection] = js.undefined
}

object SelectionProperties {
  @scala.inline
  def apply(
    anchor: Point = null,
    focus: Point = null,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    marks: Set[Mark] | js.Array[Mark] = null,
    `object`: selection = null
  ): SelectionProperties = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused)
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[SelectionProperties]
  }
}

