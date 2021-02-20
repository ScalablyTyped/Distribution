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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneViewMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/SceneView", JSImport.Default)
  @js.native
  def default[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](hasScreenRouteNavigationRouteStateGetStateSetStateOptions: Props[State, ScreenOptions, EventMap]): Element = js.native
  
  @js.native
  trait Props[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] extends StObject {
    
    def getState(): State = js.native
    
    var navigation: NavigationProp[ParamListBase, String, State, ScreenOptions, js.Object] = js.native
    
    var options: js.Object = js.native
    
    var route: Route[String, js.UndefOr[js.Object]] = js.native
    
    var routeState: js.UndefOr[NavigationState[ParamListBase] | PartialStateNavigationSta] = js.native
    
    var screen: RouteConfig[ParamListBase, String, State, ScreenOptions, EventMap] = js.native
    
    def setState(state: State): Unit = js.native
  }
  object Props {
    
    @scala.inline
    def apply[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](
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
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props[_, _, _], State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] (val x: Self with (Props[State, ScreenOptions, EventMap])) extends AnyVal {
      
      @scala.inline
      def setGetState(value: () => State): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNavigation(value: NavigationProp[ParamListBase, String, State, ScreenOptions, js.Object]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute(value: Route[String, js.UndefOr[js.Object]]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteState(value: NavigationState[ParamListBase] | PartialStateNavigationSta): Self = StObject.set(x, "routeState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteStateUndefined: Self = StObject.set(x, "routeState", js.undefined)
      
      @scala.inline
      def setScreen(value: RouteConfig[ParamListBase, String, State, ScreenOptions, EventMap]): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetState(value: State => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    }
  }
}
