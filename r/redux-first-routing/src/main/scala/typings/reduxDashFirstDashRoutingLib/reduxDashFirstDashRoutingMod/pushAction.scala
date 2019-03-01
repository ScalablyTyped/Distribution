package typings
package reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pushAction[T /* <: historyLib.historyMod.Path | historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState] */]
  extends reduxLib.reduxMod.Action[reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingLibStrings.`ROUTER/PUSH`] {
  var payload: T
}

object pushAction {
  @scala.inline
  def apply[T /* <: historyLib.historyMod.Path | historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState] */](payload: T, `type`: reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingLibStrings.`ROUTER/PUSH`): pushAction[T] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[pushAction[T]]
  }
}

