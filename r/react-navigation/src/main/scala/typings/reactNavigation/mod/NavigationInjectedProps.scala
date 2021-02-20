package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationInjectedProps[P] extends StObject {
  
  var navigation: NavigationScreenProp[NavigationRoute[P], P] = js.native
}
object NavigationInjectedProps {
  
  @scala.inline
  def apply[P](navigation: NavigationScreenProp[NavigationRoute[P], P]): NavigationInjectedProps[P] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationInjectedProps[P]]
  }
  
  @scala.inline
  implicit class NavigationInjectedPropsMutableBuilder[Self <: NavigationInjectedProps[_], P] (val x: Self with NavigationInjectedProps[P]) extends AnyVal {
    
    @scala.inline
    def setNavigation(value: NavigationScreenProp[NavigationRoute[P], P]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
  }
}
