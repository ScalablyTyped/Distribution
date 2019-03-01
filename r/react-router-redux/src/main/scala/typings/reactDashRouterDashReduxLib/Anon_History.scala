package typings
package reactDashRouterDashReduxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_History extends js.Object {
  var history: historyLib.historyMod.History[historyLib.historyMod.LocationState]
  var location: historyLib.historyMod.Location[historyLib.historyMod.LocationState]
  var `match`: Anon_IsExact
}

object Anon_History {
  @scala.inline
  def apply(
    history: historyLib.historyMod.History[historyLib.historyMod.LocationState],
    location: historyLib.historyMod.Location[historyLib.historyMod.LocationState],
    `match`: Anon_IsExact
  ): Anon_History = {
    val __obj = js.Dynamic.literal(`match` = `match`)
    __obj.updateDynamic("history")(history)
    __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[Anon_History]
  }
}

