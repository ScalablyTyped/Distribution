package typings
package reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options[TKeys, TState] extends js.Object {
  var createHistory: js.UndefOr[js.Function0[historyLib.historyMod.History[historyLib.historyMod.LocationState]]] = js.undefined
  var initialDispatch: js.UndefOr[scala.Boolean] = js.undefined
  var initialEntries: js.UndefOr[HistoryEntries] = js.undefined
  var location: js.UndefOr[java.lang.String | (SelectLocationState[TKeys, TState])] = js.undefined
  var navigators: js.UndefOr[NavigatorsConfig[TKeys, TState]] = js.undefined
  var notFoundPath: js.UndefOr[java.lang.String] = js.undefined
  var onAfterChange: js.UndefOr[
    js.Function2[
      /* dispatch */ reduxLib.reduxMod.Dispatch[_], 
      /* getState */ StateGetter[TState], 
      scala.Unit
    ]
  ] = js.undefined
  var onBackNext: js.UndefOr[
    js.Function2[
      /* dispatch */ reduxLib.reduxMod.Dispatch[_], 
      /* getState */ StateGetter[TState], 
      scala.Unit
    ]
  ] = js.undefined
  var onBeforeChange: js.UndefOr[
    js.Function2[
      /* dispatch */ reduxLib.reduxMod.Dispatch[_], 
      /* getState */ StateGetter[TState], 
      scala.Unit
    ]
  ] = js.undefined
  var querySerializer: js.UndefOr[QuerySerializer] = js.undefined
  var restoreScroll: js.UndefOr[
    js.Function1[
      /* history */ historyLib.historyMod.History[historyLib.historyMod.LocationState], 
      ScrollBehavior
    ]
  ] = js.undefined
  var scrollTop: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String | SelectTitleState[TState]] = js.undefined
}

