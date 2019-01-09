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

