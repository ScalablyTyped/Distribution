package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events[T] extends js.Object {
  var calls: js.Array[EventCall[T]]
  def reset(): scala.Unit
  def send(targetUrl: EventUrl, body: T): js.Promise[scala.Unit]
}

object Events {
  @scala.inline
  def apply[T](
    calls: js.Array[EventCall[T]],
    reset: js.Function0[scala.Unit],
    send: js.Function2[EventUrl, T, js.Promise[scala.Unit]]
  ): Events[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calls")(calls)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("send")(send)
    __obj.asInstanceOf[Events[T]]
  }
}

