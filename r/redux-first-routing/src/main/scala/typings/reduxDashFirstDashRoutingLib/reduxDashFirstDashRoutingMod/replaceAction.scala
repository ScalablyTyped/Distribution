package typings
package reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait replaceAction[T /* <: historyLib.historyMod.Path | historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState] */]
  extends reduxLib.reduxMod.Action[
      reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingLibStrings.`ROUTER/REPLACE`
    ] {
  var payload: T
}

object replaceAction {
  @scala.inline
  def apply[T /* <: historyLib.historyMod.Path | historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState] */](
    payload: T,
    `type`: reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingLibStrings.`ROUTER/REPLACE`
  ): replaceAction[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[replaceAction[T]]
  }
}

