package typings.rx.Rx.internals

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectDisposedError extends Error

object ObjectDisposedError {
  @scala.inline
  def apply(message: String, name: String): ObjectDisposedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectDisposedError]
  }
}

