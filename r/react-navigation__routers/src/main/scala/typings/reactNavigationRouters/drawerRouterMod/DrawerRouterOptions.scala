package typings.reactNavigationRouters.drawerRouterMod

import typings.reactNavigationRouters.tabRouterMod.BackBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-navigation/routers.@react-navigation/routers/lib/typescript/src/TabRouter.TabRouterOptions & {  openByDefault :boolean | undefined} */
@js.native
trait DrawerRouterOptions extends js.Object {
  
  var backBehavior: js.UndefOr[BackBehavior] = js.native
  
  /**
    * Name of the route to focus by on initial render.
    * If not specified, usually the first route is used.
    */
  var initialRouteName: js.UndefOr[String] = js.native
  
  var openByDefault: js.UndefOr[Boolean] = js.native
}
object DrawerRouterOptions {
  
  @scala.inline
  def apply(): DrawerRouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerRouterOptions]
  }
  
  @scala.inline
  implicit class DrawerRouterOptionsOps[Self <: DrawerRouterOptions] (val x: Self) extends AnyVal {
    
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
    def setBackBehavior(value: BackBehavior): Self = this.set("backBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackBehavior: Self = this.set("backBehavior", js.undefined)
    
    @scala.inline
    def setInitialRouteName(value: String): Self = this.set("initialRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialRouteName: Self = this.set("initialRouteName", js.undefined)
    
    @scala.inline
    def setOpenByDefault(value: Boolean): Self = this.set("openByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenByDefault: Self = this.set("openByDefault", js.undefined)
  }
}
