package typings
package reduxDashFirstDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashFirstDashRouterMod {
  type ConfirmLeave = js.Function2[/* state */ js.Object, /* action */ js.Object, Nullable[java.lang.String]]
  type DisplayConfirmLeave = js.Function2[
    /* message */ java.lang.String, 
    /* callback */ js.Function1[/* unblock */ scala.Boolean, scala.Unit], 
    scala.Unit
  ]
  type HistoryAction = java.lang.String
  type HistoryEntries = js.Array[reduxDashFirstDashRouterLib.Anon_Pathname]
  type Listener = js.Function2[/* location */ HistoryLocation, /* action */ HistoryAction, scala.Unit]
  type Nullable[T] = js.UndefOr[T | scala.Null]
  type Params = js.Object
  type Payload = js.Object
  type Route[TKeys, TState] = RouteString | (RouteObject[TKeys, TState])
  type RouteObject[TKeys, TState] = TKeys with reduxDashFirstDashRouterLib.Anon_ToPath[TState]
  type RouteString = java.lang.String
  type RouteThunk[TState] = js.Function2[
    /* dispatch */ reduxLib.reduxMod.Dispatch[js.Any], 
    /* getState */ StateGetter[TState], 
    js.Any | stdLib.Promise[js.Any]
  ]
  type ScrollBehavior = js.Object
  type ScrollUpdater = js.Function1[/* performedByUser */ scala.Boolean, scala.Unit]
  type SelectLocationState[TKeys, TState] = js.Function1[/* state */ TState, LocationState[TKeys, TState]]
  type SelectTitleState[TState] = js.Function1[/* state */ TState, java.lang.String]
  type StateGetter[TState] = js.Function0[TState]
}
