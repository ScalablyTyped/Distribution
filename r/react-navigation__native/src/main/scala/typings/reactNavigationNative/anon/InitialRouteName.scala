package typings.reactNavigationNative.anon

import typings.reactNavigationCore.typesMod.PathConfigMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialRouteName extends StObject {
  
  var initialRouteName: js.UndefOr[String] = js.undefined
  
  var screens: PathConfigMap
}
object InitialRouteName {
  
  inline def apply(screens: PathConfigMap): InitialRouteName = {
    val __obj = js.Dynamic.literal(screens = screens.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialRouteName]
  }
  
  extension [Self <: InitialRouteName](x: Self) {
    
    inline def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
    
    inline def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
    
    inline def setScreens(value: PathConfigMap): Self = StObject.set(x, "screens", value.asInstanceOf[js.Any])
  }
}
