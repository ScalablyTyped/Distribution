package typings.reactElemental.mod

import typings.reactElemental.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectListState extends js.Object {
  val highlightedIdx: Double | Null
  val isExpanded: Boolean
  val isFocused: Boolean
  val isHovered: Boolean
  val selectedOption: Value
}

object SelectListState {
  @scala.inline
  def apply(
    isExpanded: Boolean,
    isFocused: Boolean,
    isHovered: Boolean,
    selectedOption: Value,
    highlightedIdx: Double = null.asInstanceOf[Double]
  ): SelectListState = {
    val __obj = js.Dynamic.literal(isExpanded = isExpanded.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], selectedOption = selectedOption.asInstanceOf[js.Any], highlightedIdx = highlightedIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectListState]
  }
}

