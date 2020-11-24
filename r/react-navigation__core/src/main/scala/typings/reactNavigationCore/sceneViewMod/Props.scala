package typings.reactNavigationCore.sceneViewMod

import typings.reactNavigationCore.anon.PartialStateNavigationSta
import typings.reactNavigationCore.typesMod.EventMapBase
import typings.reactNavigationCore.typesMod.NavigationProp
import typings.reactNavigationCore.typesMod.RouteConfig
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] extends js.Object {
  
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
  implicit class PropsOps[Self <: Props[_, _, _], State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] (val x: Self with (Props[State, ScreenOptions, EventMap])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetState(value: () => State): Self = this.set("getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNavigation(value: NavigationProp[ParamListBase, String, State, ScreenOptions, js.Object]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute(value: Route[String, js.UndefOr[js.Object]]): Self = this.set("route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen(value: RouteConfig[ParamListBase, String, State, ScreenOptions, EventMap]): Self = this.set("screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetState(value: State => Unit): Self = this.set("setState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRouteState(value: NavigationState[ParamListBase] | PartialStateNavigationSta): Self = this.set("routeState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteState: Self = this.set("routeState", js.undefined)
  }
}
