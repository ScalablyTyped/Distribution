package typings.reactSelect.stateManagerMod

import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  var defaultInputValue: String
  var defaultMenuIsOpen: Boolean
  var defaultValue: ValueType[OptionType]
}

object DefaultProps {
  @scala.inline
  def apply[/* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType](
    defaultInputValue: String,
    defaultMenuIsOpen: Boolean,
    defaultValue: js.UndefOr[Null | ValueType[OptionType]] = js.undefined
  ): DefaultProps[OptionType] = {
    val __obj = js.Dynamic.literal(defaultInputValue = defaultInputValue.asInstanceOf[js.Any], defaultMenuIsOpen = defaultMenuIsOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps[OptionType]]
  }
}

