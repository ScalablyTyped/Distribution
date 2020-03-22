package typings.std

import typings.std.stdBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamReadDoneResult[T] extends ReadableStreamReadResult[T] {
  var done: `true`
  var value: js.UndefOr[T] = js.undefined
}

object ReadableStreamReadDoneResult {
  @scala.inline
  def apply[T](done: `true`, value: T = null): ReadableStreamReadDoneResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamReadDoneResult[T]]
  }
}

