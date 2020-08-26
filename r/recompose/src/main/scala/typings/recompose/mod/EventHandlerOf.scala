package typings.recompose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// createEventHandler: https://github.com/acdlite/recompose/blob/master/docs/API.md#createEventHandler
@js.native
trait EventHandlerOf[T, TSubs /* <: Subscribable[T] */] extends js.Object {
  var stream: TSubs = js.native
  def handler(value: T): Unit = js.native
}

object EventHandlerOf {
  @scala.inline
  def apply[T, /* <: typings.recompose.mod.Subscribable[T] */ TSubs](handler: T => Unit, stream: TSubs): EventHandlerOf[T, TSubs] = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventHandlerOf[T, TSubs]]
  }
  @scala.inline
  implicit class EventHandlerOfOps[Self <: EventHandlerOf[_, _], T, /* <: typings.recompose.mod.Subscribable[T] */ TSubs] (val x: Self with (EventHandlerOf[T, TSubs])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandler(value: T => Unit): Self = this.set("handler", js.Any.fromFunction1(value))
    @scala.inline
    def setStream(value: TSubs): Self = this.set("stream", value.asInstanceOf[js.Any])
  }
  
}

