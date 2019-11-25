package typings.reduxDashAction.reduxDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaAction[Payload, Meta] extends Action[Payload] {
  var meta: Meta
}

object MetaAction {
  @scala.inline
  def apply[Payload, Meta](meta: Meta, payload: Payload, `type`: String): MetaAction[Payload, Meta] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaAction[Payload, Meta]]
  }
}

