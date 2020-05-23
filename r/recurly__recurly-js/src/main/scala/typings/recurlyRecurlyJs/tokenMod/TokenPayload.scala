package typings.recurlyRecurlyJs.tokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenPayload extends js.Object {
  var id: String
  var `type`: String
}

object TokenPayload {
  @scala.inline
  def apply(id: String, `type`: String): TokenPayload = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenPayload]
  }
}

