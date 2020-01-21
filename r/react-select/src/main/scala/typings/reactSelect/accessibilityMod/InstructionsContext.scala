package typings.reactSelect.accessibilityMod

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
    if (!js.isUndefined(isMulti)) __obj.updateDynamic("isMulti")(isMulti.asInstanceOf[js.Any])
    if (!js.isUndefined(isSearchable)) __obj.updateDynamic("isSearchable")(isSearchable.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstructionsContext]
  }
}

