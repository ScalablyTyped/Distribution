package typings
package reduxDashOptimisticDashUiLib.reduxDashOptimisticDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-optimistic-ui", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BEGIN: /* @@optimist/BEGIN */ java.lang.String = js.native
  val COMMIT: /* @@optimist/COMMIT */ java.lang.String = js.native
  val REVERT: /* @@optimist/REVERT */ java.lang.String = js.native
  def ensureState[TState](state: TState): TState = js.native
  def ensureState[TState](state: reduxDashOptimisticDashUiLib.reduxDashOptimisticDashUiMod.OptimisticState[TState]): TState = js.native
  def optimistic[TState](reducer: reduxLib.reduxMod.Reducer[TState, reduxLib.reduxMod.AnyAction]): reduxLib.reduxMod.Reducer[
    reduxDashOptimisticDashUiLib.reduxDashOptimisticDashUiMod.OptimisticState[TState], 
    reduxLib.reduxMod.AnyAction
  ] = js.native
}

