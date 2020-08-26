package typings.reactNavigationDrawer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseDrawer extends js.Object {
  def closeDrawer(): js.Any = js.native
  def openDrawer(): js.Any = js.native
  def toggleDrawer(): js.Any = js.native
}

object CloseDrawer {
  @scala.inline
  def apply(closeDrawer: () => js.Any, openDrawer: () => js.Any, toggleDrawer: () => js.Any): CloseDrawer = {
    val __obj = js.Dynamic.literal(closeDrawer = js.Any.fromFunction0(closeDrawer), openDrawer = js.Any.fromFunction0(openDrawer), toggleDrawer = js.Any.fromFunction0(toggleDrawer))
    __obj.asInstanceOf[CloseDrawer]
  }
  @scala.inline
  implicit class CloseDrawerOps[Self <: CloseDrawer] (val x: Self) extends AnyVal {
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
    def setCloseDrawer(value: () => js.Any): Self = this.set("closeDrawer", js.Any.fromFunction0(value))
    @scala.inline
    def setOpenDrawer(value: () => js.Any): Self = this.set("openDrawer", js.Any.fromFunction0(value))
    @scala.inline
    def setToggleDrawer(value: () => js.Any): Self = this.set("toggleDrawer", js.Any.fromFunction0(value))
  }
  
}

