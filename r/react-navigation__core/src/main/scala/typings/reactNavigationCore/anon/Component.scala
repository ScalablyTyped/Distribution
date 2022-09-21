package typings.reactNavigationCore.anon

import typings.reactNavigationCore.typesMod.RouteConfigComponent
import typings.reactNavigationCore.typesMod.ScreenComponentType
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */]
  extends StObject
     with RouteConfigComponent[ParamList, RouteName] {
  
  var children: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * React component to render for this screen.
    */
  var component: ScreenComponentType[ParamList, RouteName]
  
  var getComponent: js.UndefOr[scala.Nothing] = js.undefined
}
object Component {
  
  inline def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](component: ScreenComponentType[ParamList, RouteName]): Component[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component[ParamList, RouteName]]
  }
  
  extension [Self <: Component[?, ?], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](x: Self & (Component[ParamList, RouteName])) {
    
    inline def setComponent(value: ScreenComponentType[ParamList, RouteName]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
  }
}
