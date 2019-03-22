package typings
package reduxDashActionsLib.reduxDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[Payload] extends BaseAction {
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var payload: Payload
}

object Action {
  @scala.inline
  def apply[Payload](payload: Payload, `type`: java.lang.String, error: js.UndefOr[scala.Boolean] = js.undefined): Action[Payload] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[Action[Payload]]
  }
}

