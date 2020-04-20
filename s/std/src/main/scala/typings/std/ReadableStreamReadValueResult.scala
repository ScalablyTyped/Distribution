package typings.std

import typings.std.stdBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamReadValueResult[T] extends ReadableStreamReadResult[T] {
  var done: `false`
  var value: T
}

object ReadableStreamReadValueResult {
  @scala.inline
  def apply[T](done: `false`, value: T): ReadableStreamReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamReadValueResult[T]]
  }
}

