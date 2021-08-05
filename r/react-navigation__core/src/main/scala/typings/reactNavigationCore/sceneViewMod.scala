package typings.reactNavigationCore

import typings.react.mod.global.JSX.Element
import typings.reactNavigationCore.anon.PartialStateNavigationSta
import typings.reactNavigationCore.typesMod.EventMapBase
import typings.reactNavigationCore.typesMod.NavigationProp
import typings.reactNavigationCore.typesMod.RouteConfig
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneViewMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/SceneView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](hasScreenRouteNavigationRouteStateGetStateSetStateOptions: Props[State, ScreenOptions, EventMap]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasScreenRouteNavigationRouteStateGetStateSetStateOptions.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] extends StObject {
    
    def getState(): State
    
    var navigation: NavigationProp[ParamListBase, String, State, ScreenOptions, js.Object]
    
    var options: js.Object
    
    var route: Route[String, js.UndefOr[js.Object]]
    
    var routeState: js.UndefOr[NavigationState[ParamListBase] | PartialStateNavigationSta] = js.undefined
    
    var screen: RouteConfig[ParamListBase, String, State, ScreenOptions, EventMap]
    
    def setState(state: State): Unit
  }
  object Props {
    
    inline def apply[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](
      getState: () => State,
      navigation: NavigationProp[ParamListBase, String, State, ScreenOptions, js.Object],
      options: js.Object,
      route: Route[String, js.UndefOr[js.Object]],
      screen: RouteConfig[ParamListBase, String, State, ScreenOptions, EventMap],
      setState: State => Unit
    ): Props[State, ScreenOptions, EventMap] = {
      val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), navigation = navigation.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], setState = js.Any.fromFunction1(setState))
      __obj.asInstanceOf[Props[State, ScreenOptions, EventMap]]
    }
    
    extension [Self <: Props[?, ?, ?], State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](x: Self & (Props[State, ScreenOptions, EventMap])) {
      
      inline def setGetState(value: () => State): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setNavigation(value: NavigationProp[ParamListBase, String, State, ScreenOptions, js.Object]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: Route[String, js.UndefOr[js.Object]]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setRouteState(value: NavigationState[ParamListBase] | PartialStateNavigationSta): Self = StObject.set(x, "routeState", value.asInstanceOf[js.Any])
      
      inline def setRouteStateUndefined: Self = StObject.set(x, "routeState", js.undefined)
      
      inline def setScreen(value: RouteConfig[ParamListBase, String, State, ScreenOptions, EventMap]): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      inline def setSetState(value: State => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    }
  }
}
