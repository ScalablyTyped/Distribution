package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformStream[I, O] extends js.Object {
  val readable: ReadableStream[O]
  val writable: WritableStream[I]
}

object TransformStream {
  @scala.inline
  def apply[I, O](readable: ReadableStream[O], writable: WritableStream[I]): TransformStream[I, O] = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformStream[I, O]]
  }
}

