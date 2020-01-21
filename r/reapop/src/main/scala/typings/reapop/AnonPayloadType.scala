package typings.reapop

import typings.reapop.mod.ActionTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayloadType extends js.Object {
  var payload: js.Any
  var `type`: ActionTypes
}

object AnonPayloadType {
  @scala.inline
  def apply(payload: js.Any, `type`: ActionTypes): AnonPayloadType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPayloadType]
  }
}

