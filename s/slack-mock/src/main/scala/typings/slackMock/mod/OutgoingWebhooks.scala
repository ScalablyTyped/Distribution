package typings.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingWebhooks[T] extends js.Object {
  var calls: js.Array[OutgoingWebhookCall[T]]
  def reset(): Unit
  def send(targetUrl: OutgoingWebhookUrl, body: T): js.Promise[Unit]
}

object OutgoingWebhooks {
  @scala.inline
  def apply[T](
    calls: js.Array[OutgoingWebhookCall[T]],
    reset: () => Unit,
    send: (OutgoingWebhookUrl, T) => js.Promise[Unit]
  ): OutgoingWebhooks[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[OutgoingWebhooks[T]]
  }
}

