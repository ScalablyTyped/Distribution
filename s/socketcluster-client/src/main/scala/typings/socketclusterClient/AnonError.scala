package typings.socketclusterClient

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: Error
}

object AnonError {
  @scala.inline
  def apply(error: Error): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

