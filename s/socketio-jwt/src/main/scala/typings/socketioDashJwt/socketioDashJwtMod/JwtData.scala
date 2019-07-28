package typings.socketioDashJwt.socketioDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JwtData extends js.Object {
  var code: String
  var message: String
  var `type`: String
}

object JwtData {
  @scala.inline
  def apply(code: String, message: String, `type`: String): JwtData = {
    val __obj = js.Dynamic.literal(code = code, message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JwtData]
  }
}

