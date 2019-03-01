package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

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
    reset: js.Function0[scala.Unit],
    send: js.Function2[OutgoingWebhookUrl, T, js.Promise[scala.Unit]]
  ): OutgoingWebhooks[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calls")(calls)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("send")(send)
    __obj.asInstanceOf[OutgoingWebhooks[T]]
  }
}

