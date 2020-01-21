package typings.reduxLittleRouter

import typings.reduxLittleRouter.mod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayload extends js.Object {
  var payload: Location
  var `type`: String
}

object AnonPayload {
  @scala.inline
  def apply(payload: Location, `type`: String): AnonPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPayload]
  }
}

