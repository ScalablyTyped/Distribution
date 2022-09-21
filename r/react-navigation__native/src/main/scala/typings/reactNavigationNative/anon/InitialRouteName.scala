package typings.reactNavigationNative.anon

import typings.reactNavigationCore.typesMod.PathConfigMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialRouteName[ParamList /* <: js.Object */] extends StObject {
  
  var initialRouteName: js.UndefOr[/* keyof ParamList */ String] = js.undefined
  
  var screens: PathConfigMap[ParamList]
}
object InitialRouteName {
  
  inline def apply[ParamList /* <: js.Object */](screens: PathConfigMap[ParamList]): InitialRouteName[ParamList] = {
    val __obj = js.Dynamic.literal(screens = screens.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialRouteName[ParamList]]
  }
  
  extension [Self <: InitialRouteName[?], ParamList /* <: js.Object */](x: Self & InitialRouteName[ParamList]) {
    
    inline def setInitialRouteName(value: /* keyof ParamList */ String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
    
    inline def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
    
    inline def setScreens(value: PathConfigMap[ParamList]): Self = StObject.set(x, "screens", value.asInstanceOf[js.Any])
  }
}
