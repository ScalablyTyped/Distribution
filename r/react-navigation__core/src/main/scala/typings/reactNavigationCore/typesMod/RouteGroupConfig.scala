package typings.reactNavigationCore.typesMod

import typings.react.mod.ReactNode
import typings.reactNavigationCore.anon.NavigationAny
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteGroupConfig[ParamList /* <: ParamListBase */, ScreenOptions /* <: js.Object */] extends StObject {
  
  /**
    * Children React Elements to extract the route configuration from.
    * Only `Screen`, `Group` and `React.Fragment` are supported as children.
    */
  var children: ReactNode
  
  /**
    * Optional key for the screens in this group.
    * If the key changes, all existing screens in this group will be removed or reset.
    */
  var navigationKey: js.UndefOr[String] = js.undefined
  
  /**
    * Navigator options for this screen.
    */
  var screenOptions: js.UndefOr[
    ScreenOptions | (js.Function1[/* props */ NavigationAny[ParamList], ScreenOptions])
  ] = js.undefined
}
object RouteGroupConfig {
  
  inline def apply[ParamList /* <: ParamListBase */, ScreenOptions /* <: js.Object */](): RouteGroupConfig[ParamList, ScreenOptions] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteGroupConfig[ParamList, ScreenOptions]]
  }
  
  extension [Self <: RouteGroupConfig[?, ?], ParamList /* <: ParamListBase */, ScreenOptions /* <: js.Object */](x: Self & (RouteGroupConfig[ParamList, ScreenOptions])) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setNavigationKey(value: String): Self = StObject.set(x, "navigationKey", value.asInstanceOf[js.Any])
    
    inline def setNavigationKeyUndefined: Self = StObject.set(x, "navigationKey", js.undefined)
    
    inline def setScreenOptions(value: ScreenOptions | (js.Function1[/* props */ NavigationAny[ParamList], ScreenOptions])): Self = StObject.set(x, "screenOptions", value.asInstanceOf[js.Any])
    
    inline def setScreenOptionsFunction1(value: /* props */ NavigationAny[ParamList] => ScreenOptions): Self = StObject.set(x, "screenOptions", js.Any.fromFunction1(value))
    
    inline def setScreenOptionsUndefined: Self = StObject.set(x, "screenOptions", js.undefined)
  }
}
