package typings
package reduxDashActionLib.reduxDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaAction[Payload, Meta] extends Action[Payload] {
  var meta: Meta
}

object MetaAction {
  @scala.inline
  def apply[Payload, Meta](meta: Meta, payload: Payload, `type`: java.lang.String): MetaAction[Payload, Meta] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaAction[Payload, Meta]]
  }
}

