package typings.reduxDashOptimisticDashUi.reduxDashOptimisticDashUiMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import typings.reduxDashOptimisticDashUi.reduxDashOptimisticDashUiStrings.`@@optimist/BEGIN`
import typings.reduxDashOptimisticDashUi.reduxDashOptimisticDashUiStrings.`@@optimist/COMMIT`
import typings.reduxDashOptimisticDashUi.reduxDashOptimisticDashUiStrings.`@@optimist/REVERT`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-optimistic-ui", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BEGIN: `@@optimist/BEGIN` = js.native
  val COMMIT: `@@optimist/COMMIT` = js.native
  val REVERT: `@@optimist/REVERT` = js.native
  def ensureState[TState](state: TState): TState = js.native
  def ensureState[TState](state: OptimisticState[TState]): TState = js.native
  def optimistic[TState](reducer: Reducer[TState, AnyAction]): Reducer[OptimisticState[TState], AnyAction] = js.native
}

