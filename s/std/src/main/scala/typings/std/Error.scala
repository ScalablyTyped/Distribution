package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var message: java.lang.String
  var name: java.lang.String
  var stack: js.UndefOr[java.lang.String] = js.undefined
}

@JSGlobal("Error")
@js.native
class ErrorCls () extends Error {
  def this(message: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

object Error {
  @scala.inline
  def apply(message: java.lang.String, name: java.lang.String, stack: java.lang.String = null): Error = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[Error]
  }
}

