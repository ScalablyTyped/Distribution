package typings.reactNavigationDrawer.typesMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationDrawerOptions extends js.Object {
  var drawerIcon: js.UndefOr[ReactNode | (js.Function1[/* props */ DrawerIconProps, ReactNode])] = js.native
  var drawerLabel: js.UndefOr[ReactNode | (js.Function1[/* props */ DrawerLabelProps, ReactNode])] = js.native
  var drawerLockMode: js.UndefOr[DrawerLockMode] = js.native
  var title: js.UndefOr[String] = js.native
}

object NavigationDrawerOptions {
  @scala.inline
  def apply(): NavigationDrawerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationDrawerOptions]
  }
  @scala.inline
  implicit class NavigationDrawerOptionsOps[Self <: NavigationDrawerOptions] (val x: Self) extends AnyVal {
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
    def setDrawerIconFunction1(value: /* props */ DrawerIconProps => ReactNode): Self = this.set("drawerIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setDrawerIcon(value: ReactNode | (js.Function1[/* props */ DrawerIconProps, ReactNode])): Self = this.set("drawerIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawerIcon: Self = this.set("drawerIcon", js.undefined)
    @scala.inline
    def setDrawerLabelFunction1(value: /* props */ DrawerLabelProps => ReactNode): Self = this.set("drawerLabel", js.Any.fromFunction1(value))
    @scala.inline
    def setDrawerLabel(value: ReactNode | (js.Function1[/* props */ DrawerLabelProps, ReactNode])): Self = this.set("drawerLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawerLabel: Self = this.set("drawerLabel", js.undefined)
    @scala.inline
    def setDrawerLockMode(value: DrawerLockMode): Self = this.set("drawerLockMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawerLockMode: Self = this.set("drawerLockMode", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

