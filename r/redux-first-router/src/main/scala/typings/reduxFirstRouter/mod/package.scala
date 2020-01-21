package typings.reduxFirstRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConfirmLeave = js.Function2[
    /* state */ js.Object, 
    /* action */ js.Object, 
    typings.reduxFirstRouter.mod.Nullable[java.lang.String]
  ]
  type DisplayConfirmLeave = js.Function2[
    /* message */ java.lang.String, 
    /* callback */ js.Function1[/* unblock */ scala.Boolean, scala.Unit], 
    scala.Unit
  ]
  type HistoryAction = java.lang.String
  type HistoryEntries = js.Array[typings.reduxFirstRouter.AnonPathname]
  type Listener = js.Function2[
    /* location */ typings.reduxFirstRouter.mod.HistoryLocation, 
    /* action */ typings.reduxFirstRouter.mod.HistoryAction, 
    scala.Unit
  ]
  type Navigators[TState] = org.scalablytyped.runtime.StringDictionary[typings.reduxFirstRouter.mod.Navigator[TState]]
  type Nullable[T] = js.UndefOr[T | scala.Null]
  type Params = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Query = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  type Route[TKeys, TState] = typings.reduxFirstRouter.mod.RouteString | (typings.reduxFirstRouter.mod.RouteObject[TKeys, TState])
  type RouteObject[TKeys, TState] = TKeys with typings.reduxFirstRouter.AnonCapitalizedWords[TState]
  type RouteString = java.lang.String
  type RouteThunk[TState] = js.Function2[
    /* dispatch */ typings.redux.mod.Dispatch[js.Any], 
    /* getState */ typings.reduxFirstRouter.mod.StateGetter[TState], 
    js.Any | js.Promise[js.Any]
  ]
  type RoutesMap[TKeys, TState] = org.scalablytyped.runtime.StringDictionary[typings.reduxFirstRouter.mod.Route[TKeys, TState]]
  type ScrollBehavior_ = js.Object
  type ScrollUpdater = js.Function1[/* performedByUser */ scala.Boolean, scala.Unit]
  type SelectLocationState[TKeys, TState] = js.Function1[/* state */ TState, typings.reduxFirstRouter.mod.LocationState[TKeys, TState]]
  type SelectTitleState[TState] = js.Function1[/* state */ TState, java.lang.String]
  type StateGetter[TState] = js.Function0[TState]
}
