package typings.rbx.navbarContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarContextValue extends js.Object {
  var active: Boolean
  def setActive(value: Boolean): Unit
}

object NavbarContextValue {
  @scala.inline
  def apply(active: Boolean, setActive: Boolean => Unit): NavbarContextValue = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive))
    __obj.asInstanceOf[NavbarContextValue]
  }
}

