package typings.reactNavigation.mod

import typings.reactNavigation.reactNavigationStrings.history
import typings.reactNavigation.reactNavigationStrings.initialRoute
import typings.reactNavigation.reactNavigationStrings.none
import typings.reactNavigation.reactNavigationStrings.order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationSwitchRouterConfig extends js.Object {
  
  var backBehavior: js.UndefOr[none | initialRoute | history | order] = js.native
  
  var initialRouteName: js.UndefOr[String] = js.native
  
  var initialRouteParams: js.UndefOr[NavigationParams] = js.native
  
  var order: js.UndefOr[js.Array[String]] = js.native
  
  var paths: js.UndefOr[NavigationPathsConfig] = js.native
  
   // defaults to 'none'
  var resetOnBlur: js.UndefOr[Boolean] = js.native
}
object NavigationSwitchRouterConfig {
  
  @scala.inline
  def apply(): NavigationSwitchRouterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationSwitchRouterConfig]
  }
  
  @scala.inline
  implicit class NavigationSwitchRouterConfigOps[Self <: NavigationSwitchRouterConfig] (val x: Self) extends AnyVal {
    
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
    def setBackBehavior(value: none | initialRoute | history | order): Self = this.set("backBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackBehavior: Self = this.set("backBehavior", js.undefined)
    
    @scala.inline
    def setInitialRouteName(value: String): Self = this.set("initialRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialRouteName: Self = this.set("initialRouteName", js.undefined)
    
    @scala.inline
    def setInitialRouteParams(value: NavigationParams): Self = this.set("initialRouteParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialRouteParams: Self = this.set("initialRouteParams", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: String*): Self = this.set("order", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: js.Array[String]): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setPaths(value: NavigationPathsConfig): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    
    @scala.inline
    def setResetOnBlur(value: Boolean): Self = this.set("resetOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetOnBlur: Self = this.set("resetOnBlur", js.undefined)
  }
}
