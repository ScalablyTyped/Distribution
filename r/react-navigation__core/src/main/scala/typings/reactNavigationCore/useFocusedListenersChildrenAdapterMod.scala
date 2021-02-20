package typings.reactNavigationCore

import typings.reactNavigationCore.navigationBuilderContextMod.FocusedNavigationListener
import typings.reactNavigationCore.typesMod.NavigationHelpers
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFocusedListenersChildrenAdapterMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useFocusedListenersChildrenAdapter", JSImport.Default)
  @js.native
  def default(hasNavigationFocusedListeners: Options): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusedListeners(value: js.Array[FocusedNavigationListener]): Self = StObject.set(x, "focusedListeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedListenersVarargs(value: FocusedNavigationListener*): Self = StObject.set(x, "focusedListeners", js.Array(value :_*))
      
      @scala.inline
      def setNavigation(value: NavigationHelpers[ParamListBase, js.Object]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    }
  }
}
