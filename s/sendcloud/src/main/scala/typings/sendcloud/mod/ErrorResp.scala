package typings.sendcloud.mod

import typings.sendcloud.sendcloudStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorResp extends js.Object {
  var errors: js.Array[String]
  var message: error
}

object ErrorResp {
  @scala.inline
  def apply(errors: js.Array[String], message: error): ErrorResp = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResp]
  }
}

