package typings
package reduxDashActionLib.reduxDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action[Payload] extends BaseAction {
  var payload: Payload
}

object Action {
  @scala.inline
  def apply[Payload](payload: Payload, `type`: java.lang.String): Action[Payload] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[Payload]]
  }
}

