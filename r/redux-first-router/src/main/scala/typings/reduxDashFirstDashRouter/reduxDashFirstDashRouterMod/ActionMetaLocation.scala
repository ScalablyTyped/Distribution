package typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionMetaLocation extends js.Object {
  var current: Location
  var history: Nullable[HistoryData]
  var kind: Nullable[String]
  var prev: Location
}

object ActionMetaLocation {
  @scala.inline
  def apply(current: Location, history: Nullable[HistoryData], kind: Nullable[String], prev: Location): ActionMetaLocation = {
    val __obj = js.Dynamic.literal(current = current, history = history.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], prev = prev)
  
    __obj.asInstanceOf[ActionMetaLocation]
  }
}

