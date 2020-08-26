package typings.reactElemental.mod

import typings.reactElemental.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectListState extends js.Object {
  val highlightedIdx: Double | Null = js.native
  val isExpanded: Boolean = js.native
  val isFocused: Boolean = js.native
  val isHovered: Boolean = js.native
  val selectedOption: Value = js.native
}

object SelectListState {
  @scala.inline
  def apply(isExpanded: Boolean, isFocused: Boolean, isHovered: Boolean, selectedOption: Value): SelectListState = {
    val __obj = js.Dynamic.literal(isExpanded = isExpanded.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], selectedOption = selectedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectListState]
  }
  @scala.inline
  implicit class SelectListStateOps[Self <: SelectListState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsHovered(value: Boolean): Self = this.set("isHovered", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedOption(value: Value): Self = this.set("selectedOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightedIdx(value: Double): Self = this.set("highlightedIdx", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightedIdxNull: Self = this.set("highlightedIdx", null)
  }
  
}

