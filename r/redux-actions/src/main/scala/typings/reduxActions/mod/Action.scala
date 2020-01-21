package typings.reduxActions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[Payload] extends BaseAction {
  var error: js.UndefOr[Boolean] = js.undefined
  var payload: Payload
}

object Action {
  @scala.inline
  def apply[Payload](payload: Payload, `type`: String, error: js.UndefOr[Boolean] = js.undefined): Action[Payload] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[Payload]]
  }
}

