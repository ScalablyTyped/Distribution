package typings.reduxDashOptimisticDashUi.reduxDashOptimisticDashUiMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-optimistic-ui", "optimistic")
@js.native
object optimistic extends js.Object {
  def apply[TState](reducer: Reducer[TState, AnyAction]): Reducer[OptimisticState[TState], AnyAction] = js.native
}

