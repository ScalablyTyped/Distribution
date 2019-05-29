package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectListState extends js.Object {
  val highlightedIdx: scala.Double | scala.Null
  val isExpanded: scala.Boolean
  val isFocused: scala.Boolean
  val isHovered: scala.Boolean
  val selectedOption: reactDashElementalLib.Anon_LabelValue
}

object SelectListState {
  @scala.inline
  def apply(
    isExpanded: scala.Boolean,
    isFocused: scala.Boolean,
    isHovered: scala.Boolean,
    selectedOption: reactDashElementalLib.Anon_LabelValue,
    highlightedIdx: scala.Int | scala.Double = null
  ): SelectListState = {
    val __obj = js.Dynamic.literal(isExpanded = isExpanded, isFocused = isFocused, isHovered = isHovered, selectedOption = selectedOption)
    if (highlightedIdx != null) __obj.updateDynamic("highlightedIdx")(highlightedIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectListState]
  }
}

