package typings
package slackDashMockLib.slackDashMockMod

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
  def apply[T](addResponse: WebOptions[T] => scala.Unit, calls: js.Array[WebCall[T]], reset: () => scala.Unit): Web[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1(addResponse), calls = calls, reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[Web[T]]
  }
}

