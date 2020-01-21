package typings.reactSelect.stateManagerMod

import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State[OptionType /* <: OptionTypeBase */] extends js.Object {
  var inputValue: String
  var menuIsOpen: Boolean
  var value: ValueType[OptionType]
}

object State {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](inputValue: String, menuIsOpen: Boolean, value: ValueType[OptionType] = null): State[OptionType] = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], menuIsOpen = menuIsOpen.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[OptionType]]
  }
}

