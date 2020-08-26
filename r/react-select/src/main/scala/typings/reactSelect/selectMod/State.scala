package typings.reactSelect.selectMod

import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State[OptionType /* <: OptionTypeBase */] extends js.Object {
  var ariaLiveContext: String = js.native
  var ariaLiveSelection: String = js.native
  var focusedOption: OptionType | Null = js.native
  var focusedValue: OptionType | Null = js.native
  var inputIsHidden: Boolean = js.native
  var isComposing: Boolean = js.native
  var isFocused: Boolean = js.native
  var menuOptions: MenuOptions[OptionType] = js.native
  var selectValue: OptionsType[OptionType] = js.native
}

object State {
  @scala.inline
  def apply[/* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType](
    ariaLiveContext: String,
    ariaLiveSelection: String,
    inputIsHidden: Boolean,
    isComposing: Boolean,
    isFocused: Boolean,
    menuOptions: MenuOptions[OptionType],
    selectValue: OptionsType[OptionType]
  ): State[OptionType] = {
    val __obj = js.Dynamic.literal(ariaLiveContext = ariaLiveContext.asInstanceOf[js.Any], ariaLiveSelection = ariaLiveSelection.asInstanceOf[js.Any], inputIsHidden = inputIsHidden.asInstanceOf[js.Any], isComposing = isComposing.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], menuOptions = menuOptions.asInstanceOf[js.Any], selectValue = selectValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[OptionType]]
  }
  @scala.inline
  implicit class StateOps[Self <: State[_], /* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType] (val x: Self with State[OptionType]) extends AnyVal {
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
    def setAriaLiveContext(value: String): Self = this.set("ariaLiveContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setAriaLiveSelection(value: String): Self = this.set("ariaLiveSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputIsHidden(value: Boolean): Self = this.set("inputIsHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsComposing(value: Boolean): Self = this.set("isComposing", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuOptions(value: MenuOptions[OptionType]): Self = this.set("menuOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectValueVarargs(value: OptionType*): Self = this.set("selectValue", js.Array(value :_*))
    @scala.inline
    def setSelectValue(value: OptionsType[OptionType]): Self = this.set("selectValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusedOption(value: OptionType): Self = this.set("focusedOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusedOptionNull: Self = this.set("focusedOption", null)
    @scala.inline
    def setFocusedValue(value: OptionType): Self = this.set("focusedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusedValueNull: Self = this.set("focusedValue", null)
  }
  
}

