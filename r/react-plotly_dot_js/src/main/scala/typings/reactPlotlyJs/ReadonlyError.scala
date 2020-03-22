package typings.reactPlotlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Error> */
trait ReadonlyError extends js.Object {
  val message: String
  val name: String
  val stack: js.UndefOr[String] = js.undefined
}

object ReadonlyError {
  @scala.inline
  def apply(message: String, name: String, stack: String = null): ReadonlyError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyError]
  }
}

