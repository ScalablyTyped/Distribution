package typings.reactDashSelect.srcStateManagerMod

import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import typings.reactDashSelect.srcTypesMod.ValueType
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
    val __obj = js.Dynamic.literal(inputValue = inputValue, menuIsOpen = menuIsOpen)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[OptionType]]
  }
}

