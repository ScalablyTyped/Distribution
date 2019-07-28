package typings.reactDashSelect.srcStateManagerMod

import typings.reactDashSelect.srcTypesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State[OptionType] extends js.Object {
  var inputValue: String
  var menuIsOpen: Boolean
  var value: ValueType[OptionType]
}

object State {
  @scala.inline
  def apply[OptionType](inputValue: String, menuIsOpen: Boolean, value: ValueType[OptionType]): State[OptionType] = {
    val __obj = js.Dynamic.literal(inputValue = inputValue, menuIsOpen = menuIsOpen, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State[OptionType]]
  }
}

