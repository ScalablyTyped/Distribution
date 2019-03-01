package typings
package reduxDashActionsLib.reduxDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionMeta[Payload, Meta] extends Action[Payload] {
  var meta: Meta
}

object ActionMeta {
  @scala.inline
  def apply[Payload, Meta](
    meta: Meta,
    `type`: java.lang.String,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    payload: Payload = null
  ): ActionMeta[Payload, Meta] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMeta[Payload, Meta]]
  }
}

