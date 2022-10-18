package typings.reactNativeNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcAdaptersConstantsMod {
  
  @JSImport("react-native-navigation/lib/dist/src/adapters/Constants", "Constants")
  @js.native
  /* private */ open class Constants () extends StObject {
    
    val backButtonId: String = js.native
    
    val bottomTabsHeight: Double = js.native
    
    val statusBarHeight: Double = js.native
    
    val topBarHeight: Double = js.native
  }
  /* static members */
  object Constants {
    
    @JSImport("react-native-navigation/lib/dist/src/adapters/Constants", "Constants")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(): js.Promise[NavigationConstants] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[NavigationConstants]]
    
    inline def getSync(): NavigationConstants = ^.asInstanceOf[js.Dynamic].applyDynamic("getSync")().asInstanceOf[NavigationConstants]
  }
  
  trait NavigationConstants extends StObject {
    
    var backButtonId: String
    
    var bottomTabsHeight: Double
    
    var statusBarHeight: Double
    
    var topBarHeight: Double
  }
  object NavigationConstants {
    
    inline def apply(backButtonId: String, bottomTabsHeight: Double, statusBarHeight: Double, topBarHeight: Double): NavigationConstants = {
      val __obj = js.Dynamic.literal(backButtonId = backButtonId.asInstanceOf[js.Any], bottomTabsHeight = bottomTabsHeight.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], topBarHeight = topBarHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationConstants]
    }
    
    extension [Self <: NavigationConstants](x: Self) {
      
      inline def setBackButtonId(value: String): Self = StObject.set(x, "backButtonId", value.asInstanceOf[js.Any])
      
      inline def setBottomTabsHeight(value: Double): Self = StObject.set(x, "bottomTabsHeight", value.asInstanceOf[js.Any])
      
      inline def setStatusBarHeight(value: Double): Self = StObject.set(x, "statusBarHeight", value.asInstanceOf[js.Any])
      
      inline def setTopBarHeight(value: Double): Self = StObject.set(x, "topBarHeight", value.asInstanceOf[js.Any])
    }
  }
}
