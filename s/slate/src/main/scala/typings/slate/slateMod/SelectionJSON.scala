package typings.slate.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionJSON extends RangeTypeJSON {
  var anchor: js.UndefOr[PointJSON] = js.undefined
  var focus: js.UndefOr[PointJSON] = js.undefined
  var isBackward: js.UndefOr[Boolean | Null] = js.undefined
  var isFocused: js.UndefOr[Boolean] = js.undefined
  var marks: js.UndefOr[js.Array[MarkJSON] | Null] = js.undefined
}

object SelectionJSON {
  @scala.inline
  def apply(
    anchor: PointJSON = null,
    focus: PointJSON = null,
    isBackward: js.UndefOr[Boolean] = js.undefined,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    marks: js.Array[MarkJSON] = null
  ): SelectionJSON = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (!js.isUndefined(isBackward)) __obj.updateDynamic("isBackward")(isBackward)
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused)
    if (marks != null) __obj.updateDynamic("marks")(marks)
    __obj.asInstanceOf[SelectionJSON]
  }
}

