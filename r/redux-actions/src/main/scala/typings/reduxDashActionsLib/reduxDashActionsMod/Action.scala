package typings
package reduxDashActionsLib.reduxDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[Payload] extends BaseAction {
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var payload: js.UndefOr[Payload] = js.undefined
}

object Action {
  @scala.inline
  def apply[Payload](`type`: java.lang.String, error: js.UndefOr[scala.Boolean] = js.undefined, payload: Payload = null): Action[Payload] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[Payload]]
  }
}

