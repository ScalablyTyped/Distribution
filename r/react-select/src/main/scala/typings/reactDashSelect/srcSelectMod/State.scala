package typings.reactDashSelect.srcSelectMod

import typings.reactDashSelect.srcTypesMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State[OptionType] extends js.Object {
  var ariaLiveContext: String
  var ariaLiveSelection: String
  var focusedOption: OptionType | Null
  var focusedValue: OptionType | Null
  var inputIsHidden: Boolean
  var isComposing: Boolean
  var isFocused: Boolean
  var menuOptions: MenuOptions[OptionType]
  var selectValue: OptionsType[OptionType]
}

object State {
  @scala.inline
  def apply[OptionType](
    ariaLiveContext: String,
    ariaLiveSelection: String,
    inputIsHidden: Boolean,
    isComposing: Boolean,
    isFocused: Boolean,
    menuOptions: MenuOptions[OptionType],
    selectValue: OptionsType[OptionType],
    focusedOption: OptionType = null,
    focusedValue: OptionType = null
  ): State[OptionType] = {
    val __obj = js.Dynamic.literal(ariaLiveContext = ariaLiveContext, ariaLiveSelection = ariaLiveSelection, inputIsHidden = inputIsHidden, isComposing = isComposing, isFocused = isFocused, menuOptions = menuOptions, selectValue = selectValue)
    if (focusedOption != null) __obj.updateDynamic("focusedOption")(focusedOption.asInstanceOf[js.Any])
    if (focusedValue != null) __obj.updateDynamic("focusedValue")(focusedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[OptionType]]
  }
}

