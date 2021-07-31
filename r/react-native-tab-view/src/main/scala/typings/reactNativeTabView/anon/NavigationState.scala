package typings.reactNativeTabView.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationState[T /* <: typings.reactNativeTabView.typesMod.Route */] extends StObject {
  
  var navigationState: typings.reactNativeTabView.typesMod.NavigationState[T]
}
object NavigationState {
  
  @scala.inline
  def apply[T /* <: typings.reactNativeTabView.typesMod.Route */](navigationState: typings.reactNativeTabView.typesMod.NavigationState[T]): NavigationState[T] = {
    val __obj = js.Dynamic.literal(navigationState = navigationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationState[T]]
  }
  
  @scala.inline
  implicit class NavigationStateMutableBuilder[Self <: NavigationState[?], T /* <: typings.reactNativeTabView.typesMod.Route */] (val x: Self & NavigationState[T]) extends AnyVal {
    
    @scala.inline
    def setNavigationState(value: typings.reactNativeTabView.typesMod.NavigationState[T]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
  }
}
