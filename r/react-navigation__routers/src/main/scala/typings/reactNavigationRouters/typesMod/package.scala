package typings.reactNavigationRouters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ActionCreators[Action /* <: typings.reactNavigationRouters.typesMod.NavigationAction */] = org.scalablytyped.runtime.StringDictionary[js.Function1[/* args */ js.Any, Action]]
  
  type CommonNavigationAction = typings.reactNavigationRouters.commonActionsMod.Action
  
  type NavigationRoute[ParamList /* <: typings.reactNavigationRouters.typesMod.ParamListBase */, RouteName /* <: /* keyof ParamList */ java.lang.String */] = (typings.reactNavigationRouters.typesMod.Route[
    typings.std.Extract[RouteName, java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ]) with typings.reactNavigationRouters.anon.State
  
  type ParamListBase = typings.std.Record[java.lang.String, js.UndefOr[js.Object]]
  
  type PartialRoute[R /* <: typings.reactNavigationRouters.typesMod.Route[java.lang.String, js.UndefOr[js.Object]] */] = (typings.std.Omit[R, typings.reactNavigationRouters.reactNavigationRoutersStrings.key]) with typings.reactNavigationRouters.anon.KeyState
  
  type PartialState[State /* <: typings.reactNavigationRouters.typesMod.NavigationState[typings.reactNavigationRouters.typesMod.ParamListBase] */] = (typings.std.Partial[
    typings.std.Omit[
      State, 
      typings.reactNavigationRouters.reactNavigationRoutersStrings.stale | typings.reactNavigationRouters.reactNavigationRoutersStrings.routes
    ]
  ]) with typings.reactNavigationRouters.anon.Routes[State]
  
  type Route[RouteName /* <: java.lang.String */, Params /* <: js.UndefOr[js.Object] */] = typings.reactNavigationRouters.anon.KeyName[RouteName] with (typings.reactNavigationRouters.anon.ParamsReadonly[Params] | typings.reactNavigationRouters.anon.`2`[Params])
  
  type RouterFactory[State /* <: typings.reactNavigationRouters.typesMod.NavigationState[typings.reactNavigationRouters.typesMod.ParamListBase] */, Action /* <: typings.reactNavigationRouters.typesMod.NavigationAction */, RouterOptions /* <: typings.reactNavigationRouters.typesMod.DefaultRouterOptions[java.lang.String] */] = js.Function1[
    /* options */ RouterOptions, 
    typings.reactNavigationRouters.typesMod.Router[State, Action]
  ]
}
