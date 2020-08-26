package typings.reactSelect.srcAsyncMod

import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State[OptionType /* <: OptionTypeBase */] extends js.Object {
  var defaultOptions: js.UndefOr[OptionsType[OptionType]] = js.native
  var inputValue: String = js.native
  var isLoading: Boolean = js.native
  var loadedInputValue: js.UndefOr[String] = js.native
  var loadedOptions: OptionsType[OptionType] = js.native
  var passEmptyOptions: Boolean = js.native
}

object State {
  @scala.inline
  def apply[/* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType](
    inputValue: String,
    isLoading: Boolean,
    loadedOptions: OptionsType[OptionType],
    passEmptyOptions: Boolean
  ): State[OptionType] = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], loadedOptions = loadedOptions.asInstanceOf[js.Any], passEmptyOptions = passEmptyOptions.asInstanceOf[js.Any])
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
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLoading(value: Boolean): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadedOptionsVarargs(value: OptionType*): Self = this.set("loadedOptions", js.Array(value :_*))
    @scala.inline
    def setLoadedOptions(value: OptionsType[OptionType]): Self = this.set("loadedOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassEmptyOptions(value: Boolean): Self = this.set("passEmptyOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultOptionsVarargs(value: OptionType*): Self = this.set("defaultOptions", js.Array(value :_*))
    @scala.inline
    def setDefaultOptions(value: OptionsType[OptionType]): Self = this.set("defaultOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOptions: Self = this.set("defaultOptions", js.undefined)
    @scala.inline
    def setLoadedInputValue(value: String): Self = this.set("loadedInputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadedInputValue: Self = this.set("loadedInputValue", js.undefined)
  }
  
}

