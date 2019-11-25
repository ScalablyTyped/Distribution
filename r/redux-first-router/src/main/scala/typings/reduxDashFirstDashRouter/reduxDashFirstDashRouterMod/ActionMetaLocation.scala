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
  def apply(
    current: Location,
    prev: Location,
    history: Nullable[HistoryData] = null,
    kind: Nullable[String] = null
  ): ActionMetaLocation = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMetaLocation]
  }
}

