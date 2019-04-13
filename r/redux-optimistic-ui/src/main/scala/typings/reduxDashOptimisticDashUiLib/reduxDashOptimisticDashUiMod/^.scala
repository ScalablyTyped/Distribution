package typings
package reduxDashOptimisticDashUiLib.reduxDashOptimisticDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-optimistic-ui", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BEGIN: reduxDashOptimisticDashUiLib.reduxDashOptimisticDashUiLibStrings.`@@optimist/BEGIN` = js.native
  val COMMIT: reduxDashOptimisticDashUiLib.reduxDashOptimisticDashUiLibStrings.`@@optimist/COMMIT` = js.native
  val REVERT: reduxDashOptimisticDashUiLib.reduxDashOptimisticDashUiLibStrings.`@@optimist/REVERT` = js.native
  def ensureState[TState](state: TState): TState = js.native
  def ensureState[TState](state: OptimisticState[TState]): TState = js.native
  def optimistic[TState](reducer: reduxLib.reduxMod.Reducer[TState, reduxLib.reduxMod.AnyAction]): reduxLib.reduxMod.Reducer[OptimisticState[TState], reduxLib.reduxMod.AnyAction] = js.native
}

