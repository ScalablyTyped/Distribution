package typings.reactNavigationCore.libTypescriptSrcTypesMod

import typings.react.mod.ReactNode
import typings.reactNavigationCore.anon.NavigationRoute
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNavigationCore.anon.Component[ParamList, RouteName]
  - typings.reactNavigationCore.anon.GetComponent[ParamList, RouteName]
  - typings.reactNavigationCore.anon.ChildrenComponent[ParamList, RouteName]
*/
trait RouteConfigComponent[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] extends StObject
object RouteConfigComponent {
  
  inline def ChildrenComponent[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](children: NavigationRoute[ParamList, RouteName] => ReactNode): typings.reactNavigationCore.anon.ChildrenComponent[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[typings.reactNavigationCore.anon.ChildrenComponent[ParamList, RouteName]]
  }
  
  inline def Component[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](component: ScreenComponentType[ParamList, RouteName]): typings.reactNavigationCore.anon.Component[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigationCore.anon.Component[ParamList, RouteName]]
  }
  
  inline def GetComponent[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](getComponent: () => ScreenComponentType[ParamList, RouteName]): typings.reactNavigationCore.anon.GetComponent[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(getComponent = js.Any.fromFunction0(getComponent))
    __obj.asInstanceOf[typings.reactNavigationCore.anon.GetComponent[ParamList, RouteName]]
  }
}
