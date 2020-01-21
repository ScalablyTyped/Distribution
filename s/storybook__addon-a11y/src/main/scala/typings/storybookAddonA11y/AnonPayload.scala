package typings.storybookAddonA11y

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayload extends js.Object {
  var payload: AnonData
  var `type`: String
}

object AnonPayload {
  @scala.inline
  def apply(payload: AnonData, `type`: String): AnonPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPayload]
  }
}

