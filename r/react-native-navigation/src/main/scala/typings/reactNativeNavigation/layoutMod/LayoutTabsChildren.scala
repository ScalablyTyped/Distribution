package typings.reactNativeNavigation.layoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutTabsChildren extends js.Object {
  /**
    * Set component
    */
  var component: js.UndefOr[LayoutComponent[js.Object]] = js.native
  /**
    * Set the external component
    */
  var externalComponent: js.UndefOr[ExternalComponent] = js.native
  /**
    * Set the side menu
    */
  var sideMenu: js.UndefOr[LayoutSideMenu] = js.native
  /**
    * Set stack
    */
  var stack: js.UndefOr[LayoutStack] = js.native
}

object LayoutTabsChildren {
  @scala.inline
  def apply(): LayoutTabsChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutTabsChildren]
  }
  @scala.inline
  implicit class LayoutTabsChildrenOps[Self <: LayoutTabsChildren] (val x: Self) extends AnyVal {
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
    def setComponent(value: LayoutComponent[js.Object]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setExternalComponent(value: ExternalComponent): Self = this.set("externalComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalComponent: Self = this.set("externalComponent", js.undefined)
    @scala.inline
    def setSideMenu(value: LayoutSideMenu): Self = this.set("sideMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSideMenu: Self = this.set("sideMenu", js.undefined)
    @scala.inline
    def setStack(value: LayoutStack): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}

