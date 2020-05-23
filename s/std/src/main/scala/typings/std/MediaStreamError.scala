package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamError extends js.Object {
  val constraintName: java.lang.String | Null
  val message: java.lang.String | Null
  val name: java.lang.String
}

object MediaStreamError {
  @scala.inline
  def apply(name: java.lang.String, constraintName: java.lang.String = null, message: java.lang.String = null): MediaStreamError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], constraintName = constraintName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamError]
  }
}

