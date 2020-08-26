package typings.reactRouterRedux.anon

import typings.history.mod.Location
import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History extends js.Object {
  var history: typings.history.mod.History[LocationState] = js.native
  var location: Location[LocationState] = js.native
  var `match`: IsExact = js.native
}

object History {
  @scala.inline
  def apply(
    history: typings.history.mod.History[LocationState],
    location: Location[LocationState],
    `match`: IsExact
  ): History = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[History]
  }
  @scala.inline
  implicit class HistoryOps[Self <: History] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHistory(value: typings.history.mod.History[LocationState]): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Location[LocationState]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatch(value: IsExact): Self = this.set("match", value.asInstanceOf[js.Any])
  }
  
}

