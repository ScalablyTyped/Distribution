package typings.reactNativeNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("react-native-navigation/lib/dist/adapters/Constants", "Constants")
  @js.native
  class Constants protected () extends StObject {
    
    val backButtonId: String = js.native
    
    val bottomTabsHeight: Double = js.native
    
    val statusBarHeight: Double = js.native
    
    val topBarHeight: Double = js.native
  }
  /* static members */
  object Constants {
    
    @JSImport("react-native-navigation/lib/dist/adapters/Constants", "Constants.get")
    @js.native
    def get(): js.Promise[NavigationConstants] = js.native
  }
  
  @js.native
  trait NavigationConstants extends StObject {
    
    var backButtonId: String = js.native
    
    var bottomTabsHeight: Double = js.native
    
    var statusBarHeight: Double = js.native
    
    var topBarHeight: Double = js.native
  }
  object NavigationConstants {
    
    @scala.inline
    def apply(backButtonId: String, bottomTabsHeight: Double, statusBarHeight: Double, topBarHeight: Double): NavigationConstants = {
      val __obj = js.Dynamic.literal(backButtonId = backButtonId.asInstanceOf[js.Any], bottomTabsHeight = bottomTabsHeight.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], topBarHeight = topBarHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationConstants]
    }
    
    @scala.inline
    implicit class NavigationConstantsMutableBuilder[Self <: NavigationConstants] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackButtonId(value: String): Self = StObject.set(x, "backButtonId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomTabsHeight(value: Double): Self = StObject.set(x, "bottomTabsHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusBarHeight(value: Double): Self = StObject.set(x, "statusBarHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopBarHeight(value: Double): Self = StObject.set(x, "topBarHeight", value.asInstanceOf[js.Any])
    }
  }
}
