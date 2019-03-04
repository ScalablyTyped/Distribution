package typings
package reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Router[TState] extends js.Object {
  def getActionForPathAndParams(path: java.lang.String): Nullable[js.Object]
  def getPathAndParamsForState(state: TState): reduxDashFirstDashRouterLib.Anon_Params
  def getStateForAction(action: js.Object, state: Nullable[TState]): Nullable[TState]
  def getStateForActionOriginal(action: js.Object, state: Nullable[TState]): Nullable[TState]
}

object Router {
  @scala.inline
  def apply[TState](
    getActionForPathAndParams: js.Function1[java.lang.String, Nullable[js.Object]],
    getPathAndParamsForState: js.Function1[TState, reduxDashFirstDashRouterLib.Anon_Params],
    getStateForAction: js.Function2[js.Object, Nullable[TState], Nullable[TState]],
    getStateForActionOriginal: js.Function2[js.Object, Nullable[TState], Nullable[TState]]
  ): Router[TState] = {
    val __obj = js.Dynamic.literal(getActionForPathAndParams = getActionForPathAndParams, getPathAndParamsForState = getPathAndParamsForState, getStateForAction = getStateForAction, getStateForActionOriginal = getStateForActionOriginal)
  
    __obj.asInstanceOf[Router[TState]]
  }
}

