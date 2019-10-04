package typings.reactDashSelect.srcAsyncMod

import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import typings.reactDashSelect.srcTypesMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State[OptionType /* <: OptionTypeBase */] extends js.Object {
  var defaultOptions: js.UndefOr[OptionsType[OptionType]] = js.undefined
  var inputValue: String
  var isLoading: Boolean
  var loadedInputValue: js.UndefOr[String] = js.undefined
  var loadedOptions: OptionsType[OptionType]
  var passEmptyOptions: Boolean
}

object State {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](
    inputValue: String,
    isLoading: Boolean,
    loadedOptions: OptionsType[OptionType],
    passEmptyOptions: Boolean,
    defaultOptions: OptionsType[OptionType] = null,
    loadedInputValue: String = null
  ): State[OptionType] = {
    val __obj = js.Dynamic.literal(inputValue = inputValue, isLoading = isLoading, loadedOptions = loadedOptions, passEmptyOptions = passEmptyOptions)
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions)
    if (loadedInputValue != null) __obj.updateDynamic("loadedInputValue")(loadedInputValue)
    __obj.asInstanceOf[State[OptionType]]
  }
}

