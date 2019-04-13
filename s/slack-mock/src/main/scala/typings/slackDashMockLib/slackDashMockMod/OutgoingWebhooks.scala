package typings
package slackDashMockLib.slackDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingWebhooks[T] extends js.Object {
  var calls: js.Array[OutgoingWebhookCall[T]]
  def reset(): scala.Unit
  def send(targetUrl: OutgoingWebhookUrl, body: T): js.Promise[scala.Unit]
}

object OutgoingWebhooks {
  @scala.inline
  def apply[T](
    calls: js.Array[OutgoingWebhookCall[T]],
    reset: () => scala.Unit,
    send: (OutgoingWebhookUrl, T) => js.Promise[scala.Unit]
  ): OutgoingWebhooks[T] = {
    val __obj = js.Dynamic.literal(calls = calls, reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send))
  
    __obj.asInstanceOf[OutgoingWebhooks[T]]
  }
}

