package typings.reduxLittleRouter.anon

import typings.reduxLittleRouter.mod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payload extends js.Object {
  var payload: Location
  var `type`: String
}

object Payload {
  @scala.inline
  def apply(payload: Location, `type`: String): Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
}

