package typings.reactSelect.stateManagerMod

import typings.reactSelect.typesMod.ActionMeta
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[OptionType /* <: OptionTypeBase */] extends js.Object {
  var defaultInputValue: js.UndefOr[String] = js.undefined
  var defaultMenuIsOpen: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[ValueType[OptionType]] = js.undefined
  var inputValue: js.UndefOr[String] = js.undefined
  var menuIsOpen: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* value */ ValueType[OptionType], /* actionMeta */ ActionMeta[OptionType], Unit]
  ] = js.undefined
  var value: js.UndefOr[ValueType[OptionType]] = js.undefined
}

object Props {
  @scala.inline
  def apply[OptionType](
    defaultInputValue: String = null,
    defaultMenuIsOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: js.UndefOr[Null | ValueType[OptionType]] = js.undefined,
    inputValue: String = null,
    menuIsOpen: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* value */ ValueType[OptionType], /* actionMeta */ ActionMeta[OptionType]) => Unit = null,
    value: js.UndefOr[Null | ValueType[OptionType]] = js.undefined
  ): Props[OptionType] = {
    val __obj = js.Dynamic.literal()
    if (defaultInputValue != null) __obj.updateDynamic("defaultInputValue")(defaultInputValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMenuIsOpen)) __obj.updateDynamic("defaultMenuIsOpen")(defaultMenuIsOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIsOpen)) __obj.updateDynamic("menuIsOpen")(menuIsOpen.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[OptionType]]
  }
}

