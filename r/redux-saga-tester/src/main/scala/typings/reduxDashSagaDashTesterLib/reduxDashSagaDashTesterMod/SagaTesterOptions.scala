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

object SagaTesterOptions {
  @scala.inline
  def apply[StateType](
    combineReducers: js.Function1[
      /* map */ reduxLib.reduxMod.ReducersMapObject[_, reduxLib.reduxMod.Action[_]], 
      reduxLib.reduxMod.Reducer[StateType, reduxLib.reduxMod.AnyAction]
    ] = null,
    ignoreReduxActions: js.UndefOr[scala.Boolean] = js.undefined,
    initialState: StateType = null,
    middlewares: js.Array[
      reduxLib.reduxMod.Middleware[js.Object, _, reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]]
    ] = null,
    options: js.Object = null,
    reducers: (reduxLib.reduxMod.ReducersMapObject[_, reduxLib.reduxMod.Action[_]]) | (reduxLib.reduxMod.Reducer[StateType, reduxLib.reduxMod.AnyAction]) = null
  ): SagaTesterOptions[StateType] = {
    val __obj = js.Dynamic.literal()
    if (combineReducers != null) __obj.updateDynamic("combineReducers")(combineReducers)
    if (!js.isUndefined(ignoreReduxActions)) __obj.updateDynamic("ignoreReduxActions")(ignoreReduxActions)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (middlewares != null) __obj.updateDynamic("middlewares")(middlewares)
    if (options != null) __obj.updateDynamic("options")(options)
    if (reducers != null) __obj.updateDynamic("reducers")(reducers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SagaTesterOptions[StateType]]
  }
}

