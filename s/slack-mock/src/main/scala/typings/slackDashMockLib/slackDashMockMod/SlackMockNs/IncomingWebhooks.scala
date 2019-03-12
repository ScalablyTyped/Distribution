package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingWebhooks[T] extends js.Object {
  var calls: js.Array[IncomingWebhookCall[T]]
  def addResponse(opts: IncomingWebhookOptions[T]): scala.Unit
  def reset(): scala.Unit
}

object IncomingWebhooks {
  @scala.inline
  def apply[T](
    addResponse: IncomingWebhookOptions[T] => scala.Unit,
    calls: js.Array[IncomingWebhookCall[T]],
    reset: () => scala.Unit
  ): IncomingWebhooks[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1(addResponse), calls = calls, reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[IncomingWebhooks[T]]
  }
}

