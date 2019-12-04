package typings.reactDashSelect.srcCreatableMod

import typings.react.reactMod.ReactNode
import typings.reactDashSelect.reactDashSelectStrings.first
import typings.reactDashSelect.reactDashSelectStrings.last
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import typings.reactDashSelect.srcTypesMod.OptionsType
import typings.reactDashSelect.srcTypesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatableProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  /* Allow options to be created while the `isLoading` prop is true. Useful to
    prevent the "create new ..." option being displayed while async results are
    still being loaded. */
  var allowCreateWhileLoading: js.UndefOr[Boolean] = js.undefined
  /* Sets the position of the createOption element in your options list. Defaults to 'last' */
  var createOptionPosition: js.UndefOr[first | last] = js.undefined
  /* Gets the label for the "create new ..." option in the menu. Is given the
    current input value. */
  var formatCreateLabel: js.UndefOr[js.Function1[/* inputValue */ String, ReactNode]] = js.undefined
  /* Returns the data for the new option when it is created. Used to display the
    value, and is passed to `onChange`. */
  var getNewOptionData: js.UndefOr[js.Function2[/* inputValue */ String, /* optionLabel */ ReactNode, OptionType]] = js.undefined
  /* Determines whether the "create new ..." option should be displayed based on
    the current input value, select value and options array. */
  var isValidNewOption: js.UndefOr[
    js.Function3[
      /* inputValue */ String, 
      /* value */ ValueType[OptionType], 
      /* options */ OptionsType[OptionType], 
      Boolean
    ]
  ] = js.undefined
  /* If provided, this will be called with the input value when a new option is
    created, and `onChange` will **not** be called. Use this when you need more
    control over what happens when new options are created. */
  var onCreateOption: js.UndefOr[js.Function1[/* inputValue */ String, Unit]] = js.undefined
}

object CreatableProps {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](
    allowCreateWhileLoading: js.UndefOr[Boolean] = js.undefined,
    createOptionPosition: first | last = null,
    formatCreateLabel: /* inputValue */ String => ReactNode = null,
    getNewOptionData: (/* inputValue */ String, /* optionLabel */ ReactNode) => OptionType = null,
    isValidNewOption: (/* inputValue */ String, /* value */ ValueType[OptionType], /* options */ OptionsType[OptionType]) => Boolean = null,
    onCreateOption: /* inputValue */ String => Unit = null
  ): CreatableProps[OptionType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCreateWhileLoading)) __obj.updateDynamic("allowCreateWhileLoading")(allowCreateWhileLoading.asInstanceOf[js.Any])
    if (createOptionPosition != null) __obj.updateDynamic("createOptionPosition")(createOptionPosition.asInstanceOf[js.Any])
    if (formatCreateLabel != null) __obj.updateDynamic("formatCreateLabel")(js.Any.fromFunction1(formatCreateLabel))
    if (getNewOptionData != null) __obj.updateDynamic("getNewOptionData")(js.Any.fromFunction2(getNewOptionData))
    if (isValidNewOption != null) __obj.updateDynamic("isValidNewOption")(js.Any.fromFunction3(isValidNewOption))
    if (onCreateOption != null) __obj.updateDynamic("onCreateOption")(js.Any.fromFunction1(onCreateOption))
    __obj.asInstanceOf[CreatableProps[OptionType]]
  }
}

