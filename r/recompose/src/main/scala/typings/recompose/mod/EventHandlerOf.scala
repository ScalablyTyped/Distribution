package typings.recompose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// createEventHandler: https://github.com/acdlite/recompose/blob/master/docs/API.md#createEventHandler
trait EventHandlerOf[T, TSubs /* <: Subscribable[T] */] extends js.Object {
  var stream: TSubs
  def handler(value: T): Unit
}

object EventHandlerOf {
  @scala.inline
  def apply[T, TSubs /* <: Subscribable[T] */](handler: T => Unit, stream: TSubs): EventHandlerOf[T, TSubs] = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventHandlerOf[T, TSubs]]
  }
}

