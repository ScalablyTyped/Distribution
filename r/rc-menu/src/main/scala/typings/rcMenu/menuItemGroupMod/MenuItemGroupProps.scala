package typings.rcMenu.menuItemGroupMod

import typings.rcMenu.interfaceMod.MenuClickEventHandler
import typings.rcMenu.interfaceMod.MenuInfo
import typings.rcMenu.rcMenuStrings.ltr
import typings.rcMenu.rcMenuStrings.rtl
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemGroupProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var direction: js.UndefOr[ltr | rtl] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[MenuClickEventHandler] = js.native
  var renderMenuItem: js.UndefOr[
    js.Function3[/* item */ ReactElement, /* index */ Double, /* key */ String, ReactElement]
  ] = js.native
  var rootPrefixCls: js.UndefOr[String] = js.native
  var subMenuKey: js.UndefOr[String] = js.native
  var title: js.UndefOr[ReactNode] = js.native
}

object MenuItemGroupProps {
  @scala.inline
  def apply(): MenuItemGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemGroupProps]
  }
  @scala.inline
  implicit class MenuItemGroupPropsOps[Self <: MenuItemGroupProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setOnClick(value: /* info */ MenuInfo => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setRenderMenuItem(value: (/* item */ ReactElement, /* index */ Double, /* key */ String) => ReactElement): Self = this.set("renderMenuItem", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRenderMenuItem: Self = this.set("renderMenuItem", js.undefined)
    @scala.inline
    def setRootPrefixCls(value: String): Self = this.set("rootPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootPrefixCls: Self = this.set("rootPrefixCls", js.undefined)
    @scala.inline
    def setSubMenuKey(value: String): Self = this.set("subMenuKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubMenuKey: Self = this.set("subMenuKey", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

