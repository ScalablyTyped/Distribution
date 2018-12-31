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

