package typings.reactRouterRedux

import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHistory extends js.Object {
  var history: History[LocationState]
  var location: Location[LocationState]
  var `match`: AnonIsExact
}

object AnonHistory {
  @scala.inline
  def apply(history: History[LocationState], location: Location[LocationState], `match`: AnonIsExact): AnonHistory = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHistory]
  }
}

