package typings.std.anon

import typings.std.ReadableStream
import typings.std.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Readable[R, T] extends js.Object {
  var readable: ReadableStream[T]
  var writable: WritableStream[R]
}

object Readable {
  @scala.inline
  def apply[R, T](readable: ReadableStream[T], writable: WritableStream[R]): Readable[R, T] = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readable[R, T]]
  }
}

