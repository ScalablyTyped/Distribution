package typings.atStorybookClientDashApi.distTypesMod

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
    val __obj = js.Dynamic.literal(message = message, stack = stack)
  
    __obj.asInstanceOf[ErrorLike]
  }
}

