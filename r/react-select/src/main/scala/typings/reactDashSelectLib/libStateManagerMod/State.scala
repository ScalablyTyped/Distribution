package typings
package reactDashSelectLib.libStateManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State[OptionType] extends js.Object {
  var inputValue: java.lang.String
  var menuIsOpen: scala.Boolean
  var value: reactDashSelectLib.libTypesMod.ValueType[OptionType]
}

object State {
  @scala.inline
  def apply[OptionType](
    inputValue: java.lang.String,
    menuIsOpen: scala.Boolean,
    value: reactDashSelectLib.libTypesMod.ValueType[OptionType]
  ): State[OptionType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inputValue")(inputValue)
    __obj.updateDynamic("menuIsOpen")(menuIsOpen)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[OptionType]]
  }
}

