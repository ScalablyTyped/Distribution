package typings.reachRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type HistoryListener = js.Function1[/* parameter */ typings.reachRouter.mod.HistoryListenerParameter, scala.Unit]
  
  type HistoryLocation = typings.reachRouter.mod.WindowLocation[typings.history.mod.LocationState] with typings.reachRouter.anon.State
  
  type HistoryUnsubscribe = js.Function0[scala.Unit]
  
  type Link[TState] = typings.react.mod.ForwardRefExoticComponent[
    typings.react.mod.PropsWithoutRef[typings.reachRouter.mod.LinkProps[TState]] with typings.react.mod.RefAttributes[typings.std.HTMLAnchorElement]
  ]
  
  type LocationProviderRenderFn = js.Function1[/* context */ typings.reachRouter.mod.LocationContext, typings.react.mod.ReactNode]
  
  type MatchRenderFn[TParams] = js.Function1[
    /* props */ typings.reachRouter.mod.MatchRenderProps[TParams], 
    typings.react.mod.ReactNode
  ]
  
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type RouteComponentProps[TParams] = typings.std.Partial[TParams] with typings.reachRouter.anon.Default
  
  type WindowLocation[S] = typings.std.Location with typings.history.mod.Location[S]
}
