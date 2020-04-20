package typings.rbx.navbarItemContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarItemContextValue extends js.Object {
  var active: Boolean
  def setActive(value: Boolean): Unit
}

object NavbarItemContextValue {
  @scala.inline
  def apply(active: Boolean, setActive: Boolean => Unit): NavbarItemContextValue = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive))
    __obj.asInstanceOf[NavbarItemContextValue]
  }
}

