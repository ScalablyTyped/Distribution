package typings.reactNavigationCore.typesMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.reactNavigationCore.anon.CanPreventDefault
import typings.reactNavigationCore.anon.DataReadonly
import typings.reactNavigationCore.anon.DefaultPrevented
import typings.reactNavigationCore.anon.GetId
import typings.reactNavigationCore.anon.Initial
import typings.reactNavigationCore.anon.Target
import typings.reactNavigationCore.anon.`2`
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
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.Route
import typings.std.Extract
import typings.std.Omit
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CompositeNavigationProp[A /* <: NavigationProp[ParamListBase, String, Any, Any, Any, js.Object] */, B /* <: NavigationHelpersCommon[ParamListBase, Any] */] = (Omit[
A & B, 
/* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<any, @react-navigation/core.@react-navigation/core/lib/typescript/src/types.Keyof<any>, undefined, @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<any>, {}, {}> */ isFocused | reset | getState | navigate_ | canGoBack | getId | dispatch | goBack | _empty | getParent | setParams | setOptions | addListener | removeListener]) & (NavigationProp[Any, String, Any, NavigationState[ParamListBase], js.Object, js.Object])

type EventArg[EventName /* <: String */, CanPreventDefault /* <: js.UndefOr[Boolean] */, Data] = Target[EventName] & (js.Object | DefaultPrevented) & (DataReadonly[Data] | `2`[Data])

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

type PathConfigMap[ParamList /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ RouteName in keyof ParamList ]:? std.NonNullable<ParamList[RouteName]> extends @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigatorScreenParams<infer T, any>? string | @react-navigation/core.@react-navigation/core/lib/typescript/src/types.PathConfig<any> : string | / * Inlined std.Omit<@react-navigation/core.@react-navigation/core/lib/typescript/src/types.PathConfig<{}>, 'screens' | 'initialRouteName'> * /
{  parse :std.Record<string, (value : string): any> | undefined | undefined,   path :string | undefined | undefined,   stringify :std.Record<string, (value : any): string> | undefined | undefined,   exact :boolean | undefined | undefined}}
  */ typings.reactNavigationCore.reactNavigationCoreStrings.PathConfigMap & TopLevel[ParamList]

type RouteConfig[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] = (GetId[RouteName, ScreenOptions, ParamList, State, EventMap]) & (RouteConfigComponent[ParamList, RouteName])

type RouteProp[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] = Route[
Extract[RouteName, String], 
/* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any]

type ScreenComponentType[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] = ComponentType[js.Object | (typings.reactNavigationCore.anon.Route[ParamList, RouteName])]

type ScreenListeners[State /* <: NavigationState[ParamListBase] */, EventMap /* <: EventMapBase */] = Partial[
/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ EventName in keyof EventMap & @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventMapCore<State> ]: @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventListenerCallback<EventMap, EventName>}
  */ typings.reactNavigationCore.reactNavigationCoreStrings.ScreenListeners & TopLevel[Any]]
