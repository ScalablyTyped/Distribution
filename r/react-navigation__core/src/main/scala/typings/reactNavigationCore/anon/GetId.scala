package typings.reactNavigationCore.anon

import typings.reactNavigationCore.libTypescriptSrcTypesMod.EventMapBase
import typings.reactNavigationCore.libTypescriptSrcTypesMod.ScreenListeners
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetId[RouteName /* <: /* keyof ParamList */ String */, ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, EventMap /* <: EventMapBase */] extends StObject {
  
  /**
    * Function to return an unique ID for this screen.
    * Receives an object with the route params.
    * For a given screen name, there will always be only one screen corresponding to an ID.
    * If `undefined` is returned, it acts same as no `getId` being specified.
    */
  var getId: js.UndefOr[js.Function1[/* hasParams */ `3`[ParamList, RouteName], js.UndefOr[String]]] = js.undefined
  
  /**
    * Initial params object for the route.
    */
  var initialParams: js.UndefOr[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ]
  ] = js.undefined
  
  /**
    * Event listeners for this screen.
    */
  var listeners: js.UndefOr[
    (ScreenListeners[State, EventMap]) | (js.Function1[
      /* props */ NavigationRoute[ParamList, RouteName], 
      ScreenListeners[State, EventMap]
    ])
  ] = js.undefined
  
  /**
    * Route name of this screen.
    */
  var name: RouteName
  
  /**
    * Optional key for this screen. This doesn't need to be unique.
    * If the key changes, existing screens with this name will be removed or reset.
    * Useful when we have some common screens and have conditional rendering.
    */
  var navigationKey: js.UndefOr[String] = js.undefined
  
  /**
    * Navigator options for this screen.
    */
  var options: js.UndefOr[
    ScreenOptions | (js.Function1[/* props */ NavigationRoute[ParamList, RouteName], ScreenOptions])
  ] = js.undefined
}
object GetId {
  
  inline def apply[RouteName /* <: /* keyof ParamList */ String */, ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, EventMap /* <: EventMapBase */](name: RouteName): GetId[RouteName, ScreenOptions, ParamList, State, EventMap] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetId[RouteName, ScreenOptions, ParamList, State, EventMap]]
  }
  
  extension [Self <: GetId[?, ?, ?, ?, ?], RouteName /* <: /* keyof ParamList */ String */, ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, EventMap /* <: EventMapBase */](x: Self & (GetId[RouteName, ScreenOptions, ParamList, State, EventMap])) {
    
    inline def setGetId(value: /* hasParams */ `3`[ParamList, RouteName] => js.UndefOr[String]): Self = StObject.set(x, "getId", js.Any.fromFunction1(value))
    
    inline def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
    
    inline def setInitialParams(
      value: Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]
    ): Self = StObject.set(x, "initialParams", value.asInstanceOf[js.Any])
    
    inline def setInitialParamsUndefined: Self = StObject.set(x, "initialParams", js.undefined)
    
    inline def setListeners(
      value: (ScreenListeners[State, EventMap]) | (js.Function1[
          /* props */ NavigationRoute[ParamList, RouteName], 
          ScreenListeners[State, EventMap]
        ])
    ): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersFunction1(value: /* props */ NavigationRoute[ParamList, RouteName] => ScreenListeners[State, EventMap]): Self = StObject.set(x, "listeners", js.Any.fromFunction1(value))
    
    inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    inline def setName(value: RouteName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNavigationKey(value: String): Self = StObject.set(x, "navigationKey", value.asInstanceOf[js.Any])
    
    inline def setNavigationKeyUndefined: Self = StObject.set(x, "navigationKey", js.undefined)
    
    inline def setOptions(
      value: ScreenOptions | (js.Function1[/* props */ NavigationRoute[ParamList, RouteName], ScreenOptions])
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsFunction1(value: /* props */ NavigationRoute[ParamList, RouteName] => ScreenOptions): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
