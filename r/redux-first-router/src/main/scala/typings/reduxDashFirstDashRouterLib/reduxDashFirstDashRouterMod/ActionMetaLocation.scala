package typings
package reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionMetaLocation extends js.Object {
  var current: Location
  var history: Nullable[HistoryData]
  var kind: Nullable[java.lang.String]
  var prev: Location
}

object ActionMetaLocation {
  @scala.inline
  def apply(
    current: Location,
    history: Nullable[HistoryData],
    kind: Nullable[java.lang.String],
    prev: Location
  ): ActionMetaLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[ActionMetaLocation]
  }
}

