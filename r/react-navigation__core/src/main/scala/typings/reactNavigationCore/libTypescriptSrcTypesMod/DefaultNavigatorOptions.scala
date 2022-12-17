package typings.reactNavigationCore.libTypescriptSrcTypesMod

import typings.react.mod.ReactNode
import typings.reactNavigationCore.anon.NavigationOptions
import typings.reactNavigationCore.anon.NavigationRoute
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.DefaultRouterOptions
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultNavigatorOptions[ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */]
  extends StObject
     with DefaultRouterOptions[Keyof[ParamList]] {
  
  /**
    * Children React Elements to extract the route configuration from.
    * Only `Screen`, `Group` and `React.Fragment` are supported as children.
    */
  var children: ReactNode
  
  /**
    * Default options specified by the navigator.
    * It receives the custom options in the arguments if a function is specified.
    */
  var defaultScreenOptions: js.UndefOr[
    ScreenOptions | (js.Function1[/* props */ NavigationOptions[ParamList, ScreenOptions], ScreenOptions])
  ] = js.undefined
  
  /**
    * Optional ID for the navigator. Can be used with `navigation.getParent(id)` to refer to a parent.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Event listeners for all the screens in the navigator.
    */
  var screenListeners: js.UndefOr[
    (ScreenListeners[State, EventMap]) | (js.Function1[/* props */ NavigationRoute[ParamList], ScreenListeners[State, EventMap]])
  ] = js.undefined
  
  /**
    * Default options for all screens under this navigator.
    */
  var screenOptions: js.UndefOr[
    ScreenOptions | (js.Function1[/* props */ NavigationRoute[ParamList], ScreenOptions])
  ] = js.undefined
}
object DefaultNavigatorOptions {
  
  inline def apply[ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](): DefaultNavigatorOptions[ParamList, State, ScreenOptions, EventMap] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultNavigatorOptions[ParamList, State, ScreenOptions, EventMap]]
  }
  
  extension [Self <: DefaultNavigatorOptions[?, ?, ?, ?], ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](x: Self & (DefaultNavigatorOptions[ParamList, State, ScreenOptions, EventMap])) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDefaultScreenOptions(
      value: ScreenOptions | (js.Function1[/* props */ NavigationOptions[ParamList, ScreenOptions], ScreenOptions])
    ): Self = StObject.set(x, "defaultScreenOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultScreenOptionsFunction1(value: /* props */ NavigationOptions[ParamList, ScreenOptions] => ScreenOptions): Self = StObject.set(x, "defaultScreenOptions", js.Any.fromFunction1(value))
    
    inline def setDefaultScreenOptionsUndefined: Self = StObject.set(x, "defaultScreenOptions", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setScreenListeners(
      value: (ScreenListeners[State, EventMap]) | (js.Function1[/* props */ NavigationRoute[ParamList], ScreenListeners[State, EventMap]])
    ): Self = StObject.set(x, "screenListeners", value.asInstanceOf[js.Any])
    
    inline def setScreenListenersFunction1(value: /* props */ NavigationRoute[ParamList] => ScreenListeners[State, EventMap]): Self = StObject.set(x, "screenListeners", js.Any.fromFunction1(value))
    
    inline def setScreenListenersUndefined: Self = StObject.set(x, "screenListeners", js.undefined)
    
    inline def setScreenOptions(value: ScreenOptions | (js.Function1[/* props */ NavigationRoute[ParamList], ScreenOptions])): Self = StObject.set(x, "screenOptions", value.asInstanceOf[js.Any])
    
    inline def setScreenOptionsFunction1(value: /* props */ NavigationRoute[ParamList] => ScreenOptions): Self = StObject.set(x, "screenOptions", js.Any.fromFunction1(value))
    
    inline def setScreenOptionsUndefined: Self = StObject.set(x, "screenOptions", js.undefined)
  }
}
