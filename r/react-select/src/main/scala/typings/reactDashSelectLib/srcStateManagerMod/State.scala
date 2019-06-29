package typings
package reactDashSelectLib.srcStateManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State[OptionType] extends js.Object {
  var inputValue: java.lang.String
  var menuIsOpen: scala.Boolean
  var value: reactDashSelectLib.srcTypesMod.ValueType[OptionType]
}

object State {
  @scala.inline
  def apply[OptionType](
    inputValue: java.lang.String,
    menuIsOpen: scala.Boolean,
    value: reactDashSelectLib.srcTypesMod.ValueType[OptionType]
  ): State[OptionType] = {
    val __obj = js.Dynamic.literal(inputValue = inputValue, menuIsOpen = menuIsOpen, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State[OptionType]]
  }
}

