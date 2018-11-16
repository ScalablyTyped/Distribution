package typings
package reduxDashSagaDashTesterLib.reduxDashSagaDashTesterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SagaTesterOptions[StateType /* <: js.Object */] extends js.Object {
  var combineReducers: js.UndefOr[js.Function1[/* map */ ReducerMap, Reducer]] = js.undefined
  var ignoreReduxActions: js.UndefOr[scala.Boolean] = js.undefined
  var initialState: js.UndefOr[StateType] = js.undefined
  var middlewares: js.UndefOr[js.Array[ReduxMiddleware]] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var reducers: js.UndefOr[ReducerMap | Reducer] = js.undefined
}

