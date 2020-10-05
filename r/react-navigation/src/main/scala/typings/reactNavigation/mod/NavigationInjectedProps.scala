package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationInjectedProps[P] extends js.Object {
  var navigation: NavigationScreenProp[NavigationRoute[P], P] = js.native
}

object NavigationInjectedProps {
  @scala.inline
  def apply[P](navigation: NavigationScreenProp[NavigationRoute[P], P]): NavigationInjectedProps[P] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationInjectedProps[P]]
  }
  @scala.inline
  implicit class NavigationInjectedPropsOps[Self <: NavigationInjectedProps[_], P] (val x: Self with NavigationInjectedProps[P]) extends AnyVal {
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
    def setNavigation(value: NavigationScreenProp[NavigationRoute[P], P]): Self = this.set("navigation", value.asInstanceOf[js.Any])
  }
  
}

