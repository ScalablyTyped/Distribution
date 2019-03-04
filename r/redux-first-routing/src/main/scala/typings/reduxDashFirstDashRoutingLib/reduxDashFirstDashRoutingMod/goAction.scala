package typings
package reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait goAction[T /* <: scala.Double */]
  extends reduxLib.reduxMod.Action[reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingLibStrings.`ROUTER/GO`] {
  var payload: T
}

object goAction {
  @scala.inline
  def apply[T /* <: scala.Double */](payload: T, `type`: reduxDashFirstDashRoutingLib.reduxDashFirstDashRoutingLibStrings.`ROUTER/GO`): goAction[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[goAction[T]]
  }
}

