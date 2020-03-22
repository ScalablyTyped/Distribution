package typings.reachRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HistoryListener = js.Function1[/* parameter */ typings.reachRouter.mod.HistoryListenerParameter, scala.Unit]
  type HistoryLocation = typings.reachRouter.mod.WindowLocation with typings.reachRouter.AnonState
  type HistoryUnsubscribe = js.Function0[scala.Unit]
  type LocationProviderRenderFn = js.Function1[/* context */ typings.reachRouter.mod.LocationContext, typings.react.mod.ReactNode]
  type MatchRenderFn[TParams] = js.Function1[
    /* props */ typings.reachRouter.mod.MatchRenderProps[TParams], 
    typings.react.mod.ReactNode
  ]
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type RouteComponentProps[TParams] = typings.std.Partial[TParams] with typings.reachRouter.AnonDefault
  type WindowLocation = typings.std.Location_ with typings.history.mod.Location[typings.history.mod.LocationState]
}
