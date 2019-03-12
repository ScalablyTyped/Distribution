package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractiveButtons[T] extends js.Object {
  var calls: js.Array[InteractiveButtonCall[T]]
  def addResponse(opts: InteractiveButtonOptions[T]): scala.Unit
  def reset(): scala.Unit
  def send(targetUrl: InteractiveButtonUrl, body: T): js.Promise[scala.Unit]
}

object InteractiveButtons {
  @scala.inline
  def apply[T](
    addResponse: InteractiveButtonOptions[T] => scala.Unit,
    calls: js.Array[InteractiveButtonCall[T]],
    reset: () => scala.Unit,
    send: (InteractiveButtonUrl, T) => js.Promise[scala.Unit]
  ): InteractiveButtons[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1(addResponse), calls = calls, reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send))
  
    __obj.asInstanceOf[InteractiveButtons[T]]
  }
}

