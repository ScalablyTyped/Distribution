package typings.reactMdMenu.menuEventsMod

import typings.react.mod.MutableRefObject
import typings.reactMdMenu.reactMdMenuStrings.first
import typings.reactMdMenu.reactMdMenuStrings.last
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuEventsProps extends js.Object {
  var cancelled: Boolean = js.native
  var defaultFocus: first | last | String = js.native
  var menuRef: MutableRefObject[HTMLDivElement | Null] = js.native
}

object MenuEventsProps {
  @scala.inline
  def apply(
    cancelled: Boolean,
    defaultFocus: first | last | String,
    menuRef: MutableRefObject[HTMLDivElement | Null]
  ): MenuEventsProps = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], defaultFocus = defaultFocus.asInstanceOf[js.Any], menuRef = menuRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuEventsProps]
  }
  @scala.inline
  implicit class MenuEventsPropsOps[Self <: MenuEventsProps] (val x: Self) extends AnyVal {
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
    def setCancelled(value: Boolean): Self = this.set("cancelled", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultFocus(value: first | last | String): Self = this.set("defaultFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuRef(value: MutableRefObject[HTMLDivElement | Null]): Self = this.set("menuRef", value.asInstanceOf[js.Any])
  }
  
}

