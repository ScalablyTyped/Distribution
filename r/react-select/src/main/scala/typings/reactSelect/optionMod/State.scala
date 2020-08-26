package typings.reactSelect.optionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  /** Whether the option is disabled. */
  var isDisabled: Boolean = js.native
  /** Whether the option is focused. */
  var isFocused: Boolean = js.native
  /** Whether the option is selected. */
  var isSelected: Boolean = js.native
}

object State {
  @scala.inline
  def apply(isDisabled: Boolean, isFocused: Boolean, isSelected: Boolean): State = {
    val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
  }
  
}

