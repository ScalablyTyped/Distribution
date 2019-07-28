package typings.reactDashSelect.srcAccessibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstructionsContext extends js.Object {
  var isMulti: js.UndefOr[Boolean] = js.undefined
  var isSearchable: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
}

object InstructionsContext {
  @scala.inline
  def apply(
    isMulti: js.UndefOr[Boolean] = js.undefined,
    isSearchable: js.UndefOr[Boolean] = js.undefined,
    label: String = null
  ): InstructionsContext = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isMulti)) __obj.updateDynamic("isMulti")(isMulti)
    if (!js.isUndefined(isSearchable)) __obj.updateDynamic("isSearchable")(isSearchable)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[InstructionsContext]
  }
}

