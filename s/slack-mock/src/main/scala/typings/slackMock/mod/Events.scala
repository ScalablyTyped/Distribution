package typings.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events[T] extends js.Object {
  var calls: js.Array[EventCall[T]]
  def reset(): Unit
  def send(targetUrl: EventUrl, body: T): js.Promise[Unit]
}

object Events {
  @scala.inline
  def apply[T](calls: js.Array[EventCall[T]], reset: () => Unit, send: (EventUrl, T) => js.Promise[Unit]): Events[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[Events[T]]
  }
}

