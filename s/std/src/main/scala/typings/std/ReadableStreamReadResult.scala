package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamReadResult[T] extends js.Object {
  var done: scala.Boolean
  var value: T
}

object ReadableStreamReadResult {
  @scala.inline
  def apply[T](done: scala.Boolean, value: T): ReadableStreamReadResult[T] = {
    val __obj = js.Dynamic.literal(done = done, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadableStreamReadResult[T]]
  }
}

