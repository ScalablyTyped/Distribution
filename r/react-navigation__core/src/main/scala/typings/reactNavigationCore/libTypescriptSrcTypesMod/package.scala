package typings.reactNavigationCore.libTypescriptSrcTypesMod

import typings.react.mod.ComponentType
import typings.reactNavigationCore.anon.CanPreventDefault
import typings.reactNavigationCore.anon.GetId
import typings.reactNavigationCore.anon.Initial
import typings.reactNavigationCore.anon.NavigationRoute
import typings.reactNavigationCore.anon.Target
import typings.reactNavigationCore.reactNavigationCoreStrings._empty
import typings.reactNavigationCore.reactNavigationCoreStrings.addListener
import typings.reactNavigationCore.reactNavigationCoreStrings.canGoBack
import typings.reactNavigationCore.reactNavigationCoreStrings.dispatch
import typings.reactNavigationCore.reactNavigationCoreStrings.getId
import typings.reactNavigationCore.reactNavigationCoreStrings.getParent
import typings.reactNavigationCore.reactNavigationCoreStrings.getState
import typings.reactNavigationCore.reactNavigationCoreStrings.goBack
import typings.reactNavigationCore.reactNavigationCoreStrings.isFocused
import typings.reactNavigationCore.reactNavigationCoreStrings.navigate_
import typings.reactNavigationCore.reactNavigationCoreStrings.removeListener
import typings.reactNavigationCore.reactNavigationCoreStrings.reset
import typings.reactNavigationCore.reactNavigationCoreStrings.setOptions
import typings.reactNavigationCore.reactNavigationCoreStrings.setParams
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.Route
import typings.std.Extract
import typings.std.Omit
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CompositeNavigationProp[A /* <: NavigationProp[ParamListBase, String, Any, Any, Any, js.Object] */, B /* <: NavigationHelpersCommon[ParamListBase, Any] */] = (Omit[
A & B, 
/* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<any, @react-navigation/core.@react-navigation/core/lib/typescript/src/types.Keyof<any>, undefined, @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<any>, {}, {}> */ isFocused | reset | getState | navigate_ | canGoBack | getId | dispatch | goBack | _empty | getParent | setParams | setOptions | addListener | removeListener]) & (NavigationProp[
/* import warning: importer.ImportType#apply Failed type conversion: A extends @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationHelpersCommon<infer T, @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase>> ? T : never */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: / **
  * The route name should refer to the route name specified in the first type
  * Ideally it should work for any of them, but it's not possible to infer that way
  * /
A extends @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<any, infer R, undefined, @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<any>, {}, {}> ? R : string */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: A extends @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<any, any, infer I, @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<any>, {}, {}> ? I : never */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: / **
  * The type of state should refer to the state specified in the first type
  * /
A extends @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<any, any, any, infer S, {}, {}> ? S : @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase> */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: A extends @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<any, any, any, any, infer O, {}> ? O : {} */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: / **
  * Event consumer config should refer to the config specified in the first type
  * This allows typechecking `addListener`/`removeListener`
  * /
A extends @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<any, any, any, any, any, infer E> ? E : {} */ js.Any])

type EventArg[EventName /* <: String */, CanPreventDefault /* <: js.UndefOr[Boolean] */, Data] = Target[EventName] & (/* import warning: importer.ImportType#apply Failed type conversion: CanPreventDefault extends true ? { readonly defaultPrevented :boolean, preventDefault (): void} : {} */ js.Any)

type EventListenerCallback[EventMap /* <: EventMapBase */, EventName /* <: /* keyof EventMap */ String */] = js.Function1[
/* e */ EventArg[
  Extract[EventName, String], 
  /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
], 
Unit]

type EventMapBase = Record[String, CanPreventDefault]

type Keyof[T /* <: js.Object */] = Extract[/* keyof T */ String, String]

type NavigatorScreenParams[ParamList, State /* <: NavigationState[ParamListBase] */] = Initial[State] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ RouteName in keyof ParamList ]: undefined extends ParamList[RouteName]? {  screen :RouteName,   params :ParamList[RouteName] | undefined,   initial :boolean | undefined,   path :string | undefined,   state :never | undefined} : {  screen :RouteName,   params :ParamList[RouteName],   initial :boolean | undefined,   path :string | undefined,   state :never | undefined}}[keyof ParamList] */ js.Any)

type RouteConfig[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] = (GetId[RouteName, ScreenOptions, ParamList, State, EventMap]) & (RouteConfigComponent[ParamList, RouteName])

type RouteProp[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] = Route[
Extract[RouteName, String], 
/* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any]

type ScreenComponentType[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] = ComponentType[(NavigationRoute[ParamList, RouteName]) | js.Object]

type ScreenListeners[State /* <: NavigationState[ParamListBase] */, EventMap /* <: EventMapBase */] = Partial[
/* import warning: importer.ImportType#apply Failed type conversion: {[ EventName in keyof EventMap & @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventMapCore<State> ]: @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventListenerCallback<EventMap, EventName>} */ js.Any]
