package typings.rbx.navbarContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarContainerState extends js.Object {
  var active: Boolean
}

object NavbarContainerState {
  @scala.inline
  def apply(active: Boolean): NavbarContainerState = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarContainerState]
  }
}

