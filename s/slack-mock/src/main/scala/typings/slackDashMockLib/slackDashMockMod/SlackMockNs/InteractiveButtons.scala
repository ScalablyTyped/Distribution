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
    addResponse: js.Function1[InteractiveButtonOptions[T], scala.Unit],
    calls: js.Array[InteractiveButtonCall[T]],
    reset: js.Function0[scala.Unit],
    send: js.Function2[InteractiveButtonUrl, T, js.Promise[scala.Unit]]
  ): InteractiveButtons[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addResponse")(addResponse)
    __obj.updateDynamic("calls")(calls)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("send")(send)
    __obj.asInstanceOf[InteractiveButtons[T]]
  }
}

