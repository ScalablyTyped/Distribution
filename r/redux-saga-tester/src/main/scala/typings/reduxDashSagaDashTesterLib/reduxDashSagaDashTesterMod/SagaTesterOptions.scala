package typings
package reduxDashSagaDashTesterLib.reduxDashSagaDashTesterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SagaTesterOptions[StateType] extends js.Object {
  var combineReducers: js.UndefOr[
    js.Function1[
      /* map */ reduxLib.reduxMod.ReducersMapObject[_, reduxLib.reduxMod.Action[_]], 
      reduxLib.reduxMod.Reducer[StateType, reduxLib.reduxMod.AnyAction]
    ]
  ] = js.undefined
  var ignoreReduxActions: js.UndefOr[scala.Boolean] = js.undefined
  var initialState: js.UndefOr[StateType] = js.undefined
  var middlewares: js.UndefOr[
    js.Array[
      reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]]
    ]
  ] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var reducers: js.UndefOr[
    (reduxLib.reduxMod.ReducersMapObject[_, reduxLib.reduxMod.Action[_]]) | (reduxLib.reduxMod.Reducer[StateType, reduxLib.reduxMod.AnyAction])
  ] = js.undefined
}

