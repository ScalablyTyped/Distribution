package typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingMod

import typings.redux.reduxMod.Action
import typings.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.ROUTERSlashGO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait goAction[T /* <: Double */] extends Action[ROUTERSlashGO] {
  var payload: T
}

object goAction {
  @scala.inline
  def apply[T /* <: Double */](payload: T, `type`: ROUTERSlashGO): goAction[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[goAction[T]]
  }
}

