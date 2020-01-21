package typings.reduxActions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionMeta[Payload, Meta] extends Action[Payload] {
  var meta: Meta
}

object ActionMeta {
  @scala.inline
  def apply[Payload, Meta](meta: Meta, payload: Payload, `type`: String, error: js.UndefOr[Boolean] = js.undefined): ActionMeta[Payload, Meta] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMeta[Payload, Meta]]
  }
}

