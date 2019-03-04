package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Web[T] extends js.Object {
  var calls: js.Array[WebCall[T]]
  def addResponse(opts: WebOptions[T]): scala.Unit
  def reset(): scala.Unit
}

object Web {
  @scala.inline
  def apply[T](
    addResponse: js.Function1[WebOptions[T], scala.Unit],
    calls: js.Array[WebCall[T]],
    reset: js.Function0[scala.Unit]
  ): Web[T] = {
    val __obj = js.Dynamic.literal(addResponse = addResponse, calls = calls, reset = reset)
  
    __obj.asInstanceOf[Web[T]]
  }
}

