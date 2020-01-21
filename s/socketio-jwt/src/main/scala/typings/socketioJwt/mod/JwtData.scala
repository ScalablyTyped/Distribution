package typings.socketioJwt.mod

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
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwtData]
  }
}

