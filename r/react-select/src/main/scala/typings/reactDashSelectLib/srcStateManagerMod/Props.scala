package typings
package reactDashSelectLib.srcStateManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[OptionType] extends js.Object {
  var defaultInputValue: js.UndefOr[java.lang.String] = js.undefined
  var defaultMenuIsOpen: js.UndefOr[scala.Boolean] = js.undefined
  var defaultValue: js.UndefOr[reactDashSelectLib.srcTypesMod.ValueType[OptionType]] = js.undefined
  var inputValue: js.UndefOr[java.lang.String] = js.undefined
  var menuIsOpen: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* value */ reactDashSelectLib.srcTypesMod.ValueType[OptionType], 
      /* actionMeta */ reactDashSelectLib.srcTypesMod.ActionMeta, 
      scala.Unit
    ]
  ] = js.undefined
  var value: js.UndefOr[reactDashSelectLib.srcTypesMod.ValueType[OptionType]] = js.undefined
}

object Props {
  @scala.inline
  def apply[OptionType](
    defaultInputValue: java.lang.String = null,
    defaultMenuIsOpen: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: reactDashSelectLib.srcTypesMod.ValueType[OptionType] = null,
    inputValue: java.lang.String = null,
    menuIsOpen: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: (/* value */ reactDashSelectLib.srcTypesMod.ValueType[OptionType], /* actionMeta */ reactDashSelectLib.srcTypesMod.ActionMeta) => scala.Unit = null,
    value: reactDashSelectLib.srcTypesMod.ValueType[OptionType] = null
  ): Props[OptionType] = {
    val __obj = js.Dynamic.literal()
    if (defaultInputValue != null) __obj.updateDynamic("defaultInputValue")(defaultInputValue)
    if (!js.isUndefined(defaultMenuIsOpen)) __obj.updateDynamic("defaultMenuIsOpen")(defaultMenuIsOpen)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue)
    if (!js.isUndefined(menuIsOpen)) __obj.updateDynamic("menuIsOpen")(menuIsOpen)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[OptionType]]
  }
}

