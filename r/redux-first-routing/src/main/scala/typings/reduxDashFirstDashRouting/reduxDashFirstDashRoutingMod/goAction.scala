package typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingMod

import typings.redux.reduxMod.Action
import typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.`ROUTER/GO`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait goAction[T /* <: Double */] extends Action[`ROUTER/GO`] {
  var payload: T
}

object goAction {
  @scala.inline
  def apply[T /* <: Double */](payload: T, `type`: `ROUTER/GO`): goAction[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[goAction[T]]
  }
}

