package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationFocusInjectedProps[P] extends NavigationInjectedProps[P] {
  
  var isFocused: Boolean = js.native
}
object NavigationFocusInjectedProps {
  
  @scala.inline
  def apply[P](isFocused: Boolean, navigation: NavigationScreenProp[NavigationRoute[P], P]): NavigationFocusInjectedProps[P] = {
    val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationFocusInjectedProps[P]]
  }
  
  @scala.inline
  implicit class NavigationFocusInjectedPropsMutableBuilder[Self <: NavigationFocusInjectedProps[_], P] (val x: Self with NavigationFocusInjectedProps[P]) extends AnyVal {
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
  }
}
