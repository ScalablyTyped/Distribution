package typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingMod

import typings.history.historyMod.LocationDescriptorObject
import typings.history.historyMod.LocationState
import typings.history.historyMod.Path
import typings.redux.reduxMod.Action
import typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.`ROUTER/REPLACE`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait replaceAction[T /* <: Path | LocationDescriptorObject[LocationState] */] extends Action[`ROUTER/REPLACE`] {
  var payload: T
}

object replaceAction {
  @scala.inline
  def apply[T /* <: Path | LocationDescriptorObject[LocationState] */](payload: T, `type`: `ROUTER/REPLACE`): replaceAction[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[replaceAction[T]]
  }
}

