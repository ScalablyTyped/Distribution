package typings.reduxDashFirstDashRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashFirstDashRouterMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.redux.reduxMod.Dispatch
  import typings.reduxDashFirstDashRouter.Anon_CapitalizedWords
  import typings.reduxDashFirstDashRouter.Anon_Pathname

  type ConfirmLeave = js.Function2[/* state */ js.Object, /* action */ js.Object, Nullable[String]]
  type DisplayConfirmLeave = js.Function2[/* message */ String, /* callback */ js.Function1[/* unblock */ Boolean, Unit], Unit]
  type HistoryAction = String
  type HistoryEntries = js.Array[Anon_Pathname]
  type Listener = js.Function2[/* location */ HistoryLocation, /* action */ HistoryAction, Unit]
  type Navigators[TState] = StringDictionary[Navigator[TState]]
  type Nullable[T] = js.UndefOr[T | Null]
  type Params = StringDictionary[js.Any]
  type Query = StringDictionary[js.UndefOr[String]]
  type Route[TKeys, TState] = RouteString | (RouteObject[TKeys, TState])
  type RouteObject[TKeys, TState] = TKeys with Anon_CapitalizedWords[TState]
  type RouteString = String
  type RouteThunk[TState] = js.Function2[
    /* dispatch */ Dispatch[js.Any], 
    /* getState */ StateGetter[TState], 
    js.Any | js.Promise[js.Any]
  ]
  type RoutesMap[TKeys, TState] = StringDictionary[Route[TKeys, TState]]
  type ScrollBehavior = js.Object
  type ScrollUpdater = js.Function1[/* performedByUser */ Boolean, Unit]
  type SelectLocationState[TKeys, TState] = js.Function1[/* state */ TState, LocationState[TKeys, TState]]
  type SelectTitleState[TState] = js.Function1[/* state */ TState, String]
  type StateGetter[TState] = js.Function0[TState]
}
