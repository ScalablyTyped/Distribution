package typings.slackDashMock.slackDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Web[T] extends js.Object {
  var calls: js.Array[WebCall[T]]
  def addResponse(opts: WebOptions[T]): Unit
  def reset(): Unit
}

object Web {
  @scala.inline
  def apply[T](addResponse: WebOptions[T] => Unit, calls: js.Array[WebCall[T]], reset: () => Unit): Web[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1(addResponse), calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[Web[T]]
  }
}

