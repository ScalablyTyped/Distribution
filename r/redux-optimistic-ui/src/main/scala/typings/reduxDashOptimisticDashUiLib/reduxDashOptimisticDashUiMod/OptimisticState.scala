package typings
package reduxDashOptimisticDashUiLib.reduxDashOptimisticDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimisticState[TState] extends js.Object {
  /**
    * Before state
    */
  var beforeState: TState
  /**
    * Current state
    */
  var current: TState
  /**
    * History list
    * List is Immutable.List<>
    */
  var history: js.Any
}

object OptimisticState {
  @scala.inline
  def apply[TState](beforeState: TState, current: TState, history: js.Any): OptimisticState[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beforeState")(beforeState.asInstanceOf[js.Any])
    __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    __obj.updateDynamic("history")(history)
    __obj.asInstanceOf[OptimisticState[TState]]
  }
}

