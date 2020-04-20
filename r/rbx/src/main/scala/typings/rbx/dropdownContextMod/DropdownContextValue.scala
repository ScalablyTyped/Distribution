package typings.rbx.dropdownContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownContextValue extends js.Object {
  var active: Boolean
  def setActive(value: Boolean): Unit
}

object DropdownContextValue {
  @scala.inline
  def apply(active: Boolean, setActive: Boolean => Unit): DropdownContextValue = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive))
    __obj.asInstanceOf[DropdownContextValue]
  }
}

