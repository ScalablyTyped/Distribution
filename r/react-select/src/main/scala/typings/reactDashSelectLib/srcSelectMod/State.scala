package typings
package reactDashSelectLib.srcSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State[OptionType] extends js.Object {
  var ariaLiveContext: java.lang.String
  var ariaLiveSelection: java.lang.String
  var focusedOption: OptionType | scala.Null
  var focusedValue: OptionType | scala.Null
  var inputIsHidden: scala.Boolean
  var isComposing: scala.Boolean
  var isFocused: scala.Boolean
  var menuOptions: MenuOptions[OptionType]
  var selectValue: reactDashSelectLib.srcTypesMod.OptionsType[OptionType]
}

object State {
  @scala.inline
  def apply[OptionType](
    ariaLiveContext: java.lang.String,
    ariaLiveSelection: java.lang.String,
    inputIsHidden: scala.Boolean,
    isComposing: scala.Boolean,
    isFocused: scala.Boolean,
    menuOptions: MenuOptions[OptionType],
    selectValue: reactDashSelectLib.srcTypesMod.OptionsType[OptionType],
    focusedOption: OptionType = null,
    focusedValue: OptionType = null
  ): State[OptionType] = {
    val __obj = js.Dynamic.literal(ariaLiveContext = ariaLiveContext, ariaLiveSelection = ariaLiveSelection, inputIsHidden = inputIsHidden, isComposing = isComposing, isFocused = isFocused, menuOptions = menuOptions, selectValue = selectValue)
    if (focusedOption != null) __obj.updateDynamic("focusedOption")(focusedOption.asInstanceOf[js.Any])
    if (focusedValue != null) __obj.updateDynamic("focusedValue")(focusedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[OptionType]]
  }
}

