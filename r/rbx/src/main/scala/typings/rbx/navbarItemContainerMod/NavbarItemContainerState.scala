package typings.rbx.navbarItemContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarItemContainerState extends js.Object {
  var active: Boolean = js.native
}

object NavbarItemContainerState {
  @scala.inline
  def apply(active: Boolean): NavbarItemContainerState = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarItemContainerState]
  }
  @scala.inline
  implicit class NavbarItemContainerStateOps[Self <: NavbarItemContainerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
  }
  
}

