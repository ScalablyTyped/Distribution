package typings.storybookClientApi.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorLike extends js.Object {
  var message: String
  var stack: String
}

object ErrorLike {
  @scala.inline
  def apply(message: String, stack: String): ErrorLike = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorLike]
  }
}

