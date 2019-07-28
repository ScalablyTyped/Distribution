package typings.reactDashRouterDashRedux

import typings.history.historyMod.History
import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_History extends js.Object {
  var history: History[LocationState]
  var location: Location[LocationState]
  var `match`: Anon_IsExact
}

object Anon_History {
  @scala.inline
  def apply(history: History[LocationState], location: Location[LocationState], `match`: Anon_IsExact): Anon_History = {
    val __obj = js.Dynamic.literal(history = history, location = location)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[Anon_History]
  }
}

