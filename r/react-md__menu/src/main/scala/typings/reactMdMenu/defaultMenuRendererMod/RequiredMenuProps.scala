package typings.reactMdMenu.defaultMenuRendererMod

import typings.react.mod.ReactNode
import typings.reactMdMenu.reactMdMenuStrings.first
import typings.reactMdMenu.reactMdMenuStrings.last
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<@react-md/menu.@react-md/menu/types/Menu.MenuProps, 'id' | 'visible' | 'onRequestClose' | 'controlId' | 'children' | 'defaultFocus'>> */
@js.native
trait RequiredMenuProps extends js.Object {
  var children: ReactNode = js.native
  var controlId: String = js.native
  var defaultFocus: first | last | String = js.native
  var id: String = js.native
  var onRequestClose: js.Function0[Unit] = js.native
  var visible: Boolean = js.native
}

object RequiredMenuProps {
  @scala.inline
  def apply(
    controlId: String,
    defaultFocus: first | last | String,
    id: String,
    onRequestClose: () => Unit,
    visible: Boolean
  ): RequiredMenuProps = {
    val __obj = js.Dynamic.literal(controlId = controlId.asInstanceOf[js.Any], defaultFocus = defaultFocus.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredMenuProps]
  }
  @scala.inline
  implicit class RequiredMenuPropsOps[Self <: RequiredMenuProps] (val x: Self) extends AnyVal {
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
    def setControlId(value: String): Self = this.set("controlId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultFocus(value: first | last | String): Self = this.set("defaultFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRequestClose(value: () => Unit): Self = this.set("onRequestClose", js.Any.fromFunction0(value))
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

