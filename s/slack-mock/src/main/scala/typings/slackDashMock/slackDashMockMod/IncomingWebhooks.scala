package typings.slackDashMock.slackDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingWebhooks[T] extends js.Object {
  var calls: js.Array[IncomingWebhookCall[T]]
  def addResponse(opts: IncomingWebhookOptions[T]): Unit
  def reset(): Unit
}

object IncomingWebhooks {
  @scala.inline
  def apply[T](
    addResponse: IncomingWebhookOptions[T] => Unit,
    calls: js.Array[IncomingWebhookCall[T]],
    reset: () => Unit
  ): IncomingWebhooks[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1(addResponse), calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[IncomingWebhooks[T]]
  }
}

