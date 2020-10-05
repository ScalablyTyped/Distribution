package typings.reactNavigationDrawer.typesMod

import typings.react.mod.ComponentType
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.history
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.initialRoute
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationDrawerRouterConfig extends js.Object {
  var backBehavior: js.UndefOr[none | initialRoute | history] = js.native
  var contentComponent: js.UndefOr[ComponentType[DrawerContentComponentProps]] = js.native
  var contentOptions: js.UndefOr[js.Object] = js.native
  var initialRouteName: js.UndefOr[String] = js.native
  var resetOnBlur: js.UndefOr[Boolean] = js.native
  var unmountInactiveRoutes: js.UndefOr[Boolean] = js.native
}

object NavigationDrawerRouterConfig {
  @scala.inline
  def apply(): NavigationDrawerRouterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationDrawerRouterConfig]
  }
  @scala.inline
  implicit class NavigationDrawerRouterConfigOps[Self <: NavigationDrawerRouterConfig] (val x: Self) extends AnyVal {
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
    def setBackBehavior(value: none | initialRoute | history): Self = this.set("backBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackBehavior: Self = this.set("backBehavior", js.undefined)
    @scala.inline
    def setContentComponent(value: ComponentType[DrawerContentComponentProps]): Self = this.set("contentComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentComponent: Self = this.set("contentComponent", js.undefined)
    @scala.inline
    def setContentOptions(value: js.Object): Self = this.set("contentOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentOptions: Self = this.set("contentOptions", js.undefined)
    @scala.inline
    def setInitialRouteName(value: String): Self = this.set("initialRouteName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialRouteName: Self = this.set("initialRouteName", js.undefined)
    @scala.inline
    def setResetOnBlur(value: Boolean): Self = this.set("resetOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetOnBlur: Self = this.set("resetOnBlur", js.undefined)
    @scala.inline
    def setUnmountInactiveRoutes(value: Boolean): Self = this.set("unmountInactiveRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmountInactiveRoutes: Self = this.set("unmountInactiveRoutes", js.undefined)
  }
  
}

