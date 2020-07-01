package typings.reactSelect.srcAsyncMod

import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
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
  def apply[/* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType](
    inputValue: String,
    isLoading: Boolean,
    loadedOptions: OptionsType[OptionType],
    passEmptyOptions: Boolean,
    defaultOptions: OptionsType[OptionType] = null,
    loadedInputValue: String = null
  ): State[OptionType] = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], loadedOptions = loadedOptions.asInstanceOf[js.Any], passEmptyOptions = passEmptyOptions.asInstanceOf[js.Any])
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions.asInstanceOf[js.Any])
    if (loadedInputValue != null) __obj.updateDynamic("loadedInputValue")(loadedInputValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[OptionType]]
  }
}

