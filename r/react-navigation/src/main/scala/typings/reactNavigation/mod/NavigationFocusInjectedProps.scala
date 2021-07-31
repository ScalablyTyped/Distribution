package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationFocusInjectedProps[P]
  extends StObject
     with NavigationInjectedProps[P] {
  
  var isFocused: Boolean
}
object NavigationFocusInjectedProps {
  
  @scala.inline
  def apply[P](isFocused: Boolean, navigation: NavigationScreenProp[NavigationRoute[P], P]): NavigationFocusInjectedProps[P] = {
    val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationFocusInjectedProps[P]]
  }
  
  @scala.inline
  implicit class NavigationFocusInjectedPropsMutableBuilder[Self <: NavigationFocusInjectedProps[?], P] (val x: Self & NavigationFocusInjectedProps[P]) extends AnyVal {
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
  }
}
