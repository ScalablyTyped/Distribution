package typings.reactNavigationCore.anon

import typings.reactNavigationCore.typesMod.EventMapBase
import typings.reactNavigationCore.typesMod.ScreenListeners
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialParams[RouteName /* <: /* keyof ParamList */ String */, ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, EventMap /* <: EventMapBase */] extends js.Object {
  
  /**
    * Initial params object for the route.
    */
  var initialParams: js.UndefOr[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ]
  ] = js.native
  
  /**
    * Event listeners for this screen.
    */
  var listeners: js.UndefOr[
    (ScreenListeners[State, EventMap]) | (js.Function1[/* props */ Route[ParamList, RouteName], ScreenListeners[State, EventMap]])
  ] = js.native
  
  /**
    * Route name of this screen.
    */
  var name: RouteName = js.native
  
  /**
    * Navigator options for this screen.
    */
  var options: js.UndefOr[
    ScreenOptions | (js.Function1[/* props */ Route[ParamList, RouteName], ScreenOptions])
  ] = js.native
}
object InitialParams {
  
  @scala.inline
  def apply[RouteName /* <: /* keyof ParamList */ String */, ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, EventMap /* <: EventMapBase */](name: RouteName): InitialParams[RouteName, ScreenOptions, ParamList, State, EventMap] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialParams[RouteName, ScreenOptions, ParamList, State, EventMap]]
  }
  
  @scala.inline
  implicit class InitialParamsOps[Self <: InitialParams[_, _, _, _, _], RouteName /* <: /* keyof ParamList */ String */, ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, EventMap /* <: EventMapBase */] (val x: Self with (InitialParams[RouteName, ScreenOptions, ParamList, State, EventMap])) extends AnyVal {
    
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
    def setName(value: RouteName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialParams(
      value: Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]
    ): Self = this.set("initialParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialParams: Self = this.set("initialParams", js.undefined)
    
    @scala.inline
    def setListenersFunction1(value: /* props */ Route[ParamList, RouteName] => ScreenListeners[State, EventMap]): Self = this.set("listeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListeners(
      value: (ScreenListeners[State, EventMap]) | (js.Function1[/* props */ Route[ParamList, RouteName], ScreenListeners[State, EventMap]])
    ): Self = this.set("listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListeners: Self = this.set("listeners", js.undefined)
    
    @scala.inline
    def setOptionsFunction1(value: /* props */ Route[ParamList, RouteName] => ScreenOptions): Self = this.set("options", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptions(value: ScreenOptions | (js.Function1[/* props */ Route[ParamList, RouteName], ScreenOptions])): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
