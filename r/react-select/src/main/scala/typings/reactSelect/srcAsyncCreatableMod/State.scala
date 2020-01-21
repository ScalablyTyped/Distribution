package typings.reactSelect.srcAsyncCreatableMod

import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-select.react-select/src/Async.State<OptionType> & react-select.react-select/src/Creatable.State<OptionType> */
trait State[OptionType /* <: OptionTypeBase */] extends js.Object {
  var defaultOptions: js.UndefOr[OptionsType[OptionType]] = js.undefined
  var inputValue: String
  var isLoading: Boolean
  var loadedInputValue: js.UndefOr[String] = js.undefined
  var loadedOptions: OptionsType[OptionType]
  var newOption: js.UndefOr[OptionType] = js.undefined
  var options: OptionsType[OptionType]
  var passEmptyOptions: Boolean
}

object State {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](
    inputValue: String,
    isLoading: Boolean,
    loadedOptions: OptionsType[OptionType],
    options: OptionsType[OptionType],
    passEmptyOptions: Boolean,
    defaultOptions: OptionsType[OptionType] = null,
    loadedInputValue: String = null,
    newOption: OptionType = null
  ): State[OptionType] = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], loadedOptions = loadedOptions.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], passEmptyOptions = passEmptyOptions.asInstanceOf[js.Any])
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions.asInstanceOf[js.Any])
    if (loadedInputValue != null) __obj.updateDynamic("loadedInputValue")(loadedInputValue.asInstanceOf[js.Any])
    if (newOption != null) __obj.updateDynamic("newOption")(newOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[OptionType]]
  }
}

