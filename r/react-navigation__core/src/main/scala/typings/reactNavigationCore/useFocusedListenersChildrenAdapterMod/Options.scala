package typings.reactNavigationCore.useFocusedListenersChildrenAdapterMod

import typings.reactNavigationCore.navigationBuilderContextMod.FocusedNavigationListener
import typings.reactNavigationCore.typesMod.NavigationHelpers
import typings.reactNavigationRouters.typesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var focusedListeners: js.Array[FocusedNavigationListener] = js.native
  
  var navigation: NavigationHelpers[ParamListBase, js.Object] = js.native
}
object Options {
  
  @scala.inline
  def apply(
    focusedListeners: js.Array[FocusedNavigationListener],
    navigation: NavigationHelpers[ParamListBase, js.Object]
  ): Options = {
    val __obj = js.Dynamic.literal(focusedListeners = focusedListeners.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setFocusedListenersVarargs(value: FocusedNavigationListener*): Self = this.set("focusedListeners", js.Array(value :_*))
    
    @scala.inline
    def setFocusedListeners(value: js.Array[FocusedNavigationListener]): Self = this.set("focusedListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: NavigationHelpers[ParamListBase, js.Object]): Self = this.set("navigation", value.asInstanceOf[js.Any])
  }
}
