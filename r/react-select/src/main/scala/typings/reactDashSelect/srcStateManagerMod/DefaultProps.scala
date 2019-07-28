package typings.reactDashSelect.srcStateManagerMod

import typings.reactDashSelect.srcTypesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultProps[OptionType] extends js.Object {
  var defaultInputValue: String
  var defaultMenuIsOpen: Boolean
  var defaultValue: ValueType[OptionType]
}

object DefaultProps {
  @scala.inline
  def apply[OptionType](defaultInputValue: String, defaultMenuIsOpen: Boolean, defaultValue: ValueType[OptionType]): DefaultProps[OptionType] = {
    val __obj = js.Dynamic.literal(defaultInputValue = defaultInputValue, defaultMenuIsOpen = defaultMenuIsOpen, defaultValue = defaultValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultProps[OptionType]]
  }
}

