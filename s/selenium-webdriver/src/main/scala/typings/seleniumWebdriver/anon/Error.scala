package typings.seleniumWebdriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: String
  var message: String
}

object Error {
  @scala.inline
  def apply(error: String, message: String): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

