package typings.slate.slateMod

import typings.slate.slateStrings.selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionJSON extends RangeTypeJSON {
  var anchor: js.UndefOr[PointJSON] = js.undefined
  var focus: js.UndefOr[PointJSON] = js.undefined
  var isFocused: js.UndefOr[Boolean] = js.undefined
  var marks: js.UndefOr[js.Array[MarkJSON]] = js.undefined
  var `object`: js.UndefOr[selection] = js.undefined
}

object SelectionJSON {
  @scala.inline
  def apply(
    anchor: PointJSON = null,
    focus: PointJSON = null,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    marks: js.Array[MarkJSON] = null,
    `object`: selection = null
  ): SelectionJSON = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionJSON]
  }
}

