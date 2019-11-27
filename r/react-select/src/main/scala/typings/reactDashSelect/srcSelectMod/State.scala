package typings.reactDashSelect.srcSelectMod

import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import typings.reactDashSelect.srcTypesMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State[OptionType /* <: OptionTypeBase */] extends js.Object {
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
  def apply[OptionType /* <: OptionTypeBase */](
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
    val __obj = js.Dynamic.literal(ariaLiveContext = ariaLiveContext.asInstanceOf[js.Any], ariaLiveSelection = ariaLiveSelection.asInstanceOf[js.Any], inputIsHidden = inputIsHidden.asInstanceOf[js.Any], isComposing = isComposing.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], menuOptions = menuOptions.asInstanceOf[js.Any], selectValue = selectValue.asInstanceOf[js.Any])
    if (focusedOption != null) __obj.updateDynamic("focusedOption")(focusedOption.asInstanceOf[js.Any])
    if (focusedValue != null) __obj.updateDynamic("focusedValue")(focusedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[OptionType]]
  }
}

