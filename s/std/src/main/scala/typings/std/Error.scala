package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var message: java.lang.String
  var name: java.lang.String
  var stack: js.UndefOr[java.lang.String] = js.undefined
}

object Error {
  @scala.inline
  def apply(message: java.lang.String, name: java.lang.String, stack: java.lang.String = null): Error = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

