package typings.reactNavigationCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type CompositeNavigationProp[A /* <: typings.reactNavigationCore.typesMod.NavigationProp[typings.reactNavigationRouters.typesMod.ParamListBase, java.lang.String, _, _, js.Object] */, B /* <: typings.reactNavigationCore.typesMod.NavigationHelpersCommon[typings.reactNavigationRouters.typesMod.ParamListBase, _] */] = (typings.std.Omit[
    A with B, 
    /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<any, string, @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<any>, {}, {}> */ typings.reactNavigationCore.reactNavigationCoreStrings.dispatch | typings.reactNavigationCore.reactNavigationCoreStrings.navigate_ | typings.reactNavigationCore.reactNavigationCoreStrings.reset | typings.reactNavigationCore.reactNavigationCoreStrings.goBack | typings.reactNavigationCore.reactNavigationCoreStrings.isFocused | typings.reactNavigationCore.reactNavigationCoreStrings.canGoBack | typings.reactNavigationCore.reactNavigationCoreStrings.dangerouslyGetParent | typings.reactNavigationCore.reactNavigationCoreStrings.dangerouslyGetState | typings.reactNavigationCore.reactNavigationCoreStrings._empty | typings.reactNavigationCore.reactNavigationCoreStrings.setParams | typings.reactNavigationCore.reactNavigationCoreStrings.setOptions | typings.reactNavigationCore.reactNavigationCoreStrings.addListener | typings.reactNavigationCore.reactNavigationCoreStrings.removeListener
  ]) with (typings.reactNavigationCore.typesMod.NavigationProp[
    js.Any, 
    java.lang.String, 
    typings.reactNavigationRouters.typesMod.NavigationState[typings.reactNavigationRouters.typesMod.ParamListBase], 
    js.Object, 
    js.Object
  ])
  
  type EventArg[EventName /* <: java.lang.String */, CanPreventDefault /* <: js.UndefOr[scala.Boolean] */, Data] = typings.reactNavigationCore.anon.Target[EventName] with (js.Object | typings.reactNavigationCore.anon.DefaultPrevented) with (typings.reactNavigationCore.anon.DataReadonly[Data] | typings.reactNavigationCore.anon.`1`[Data])
  
  type EventListenerCallback[EventMap /* <: typings.reactNavigationCore.typesMod.EventMapBase */, EventName /* <: /* keyof EventMap */ java.lang.String */] = js.Function1[
    /* e */ typings.reactNavigationCore.typesMod.EventArg[
      typings.std.Extract[EventName, java.lang.String], 
      /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
    ], 
    scala.Unit
  ]
  
  type EventMapBase = typings.std.Record[java.lang.String, typings.reactNavigationCore.anon.CanPreventDefault]
  
  type NavigatorScreenParams[ParamList, State /* <: typings.reactNavigationRouters.typesMod.NavigationState[typings.reactNavigationRouters.typesMod.ParamListBase] */] = typings.reactNavigationCore.anon.Initial[State] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ RouteName in keyof ParamList ]: undefined extends ParamList[RouteName]? {  screen :RouteName,   params :ParamList[RouteName] | undefined,   initial :boolean | undefined,   state :never | undefined} : {  screen :RouteName,   params :ParamList[RouteName],   initial :boolean | undefined,   state :never | undefined}}[keyof ParamList] */ js.Any)
  
  type RouteConfig[ParamList /* <: typings.reactNavigationRouters.typesMod.ParamListBase */, RouteName /* <: /* keyof ParamList */ java.lang.String */, State /* <: typings.reactNavigationRouters.typesMod.NavigationState[typings.reactNavigationRouters.typesMod.ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: typings.reactNavigationCore.typesMod.EventMapBase */] = (typings.reactNavigationCore.anon.InitialParams[RouteName, ScreenOptions, ParamList, State, EventMap]) with (typings.reactNavigationCore.anon.Children | typings.reactNavigationCore.anon.Component | (typings.reactNavigationCore.anon.GetComponent[ParamList, RouteName]))
  
  type RouteProp[ParamList /* <: typings.reactNavigationRouters.typesMod.ParamListBase */, RouteName /* <: /* keyof ParamList */ java.lang.String */] = typings.reactNavigationRouters.typesMod.Route[
    typings.std.Extract[RouteName, java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ]
  
  type ScreenListeners[State /* <: typings.reactNavigationRouters.typesMod.NavigationState[typings.reactNavigationRouters.typesMod.ParamListBase] */, EventMap /* <: typings.reactNavigationCore.typesMod.EventMapBase */] = typings.std.Partial[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ EventName in keyof EventMap & @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventMapCore<State> ]: @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventListenerCallback<EventMap, EventName>}
    */ typings.reactNavigationCore.reactNavigationCoreStrings.ScreenListeners with org.scalablytyped.runtime.TopLevel[js.Any]
  ]
}
