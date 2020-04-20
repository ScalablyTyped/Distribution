package typings.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractiveButtons[T] extends js.Object {
  var calls: js.Array[InteractiveButtonCall[T]]
  def addResponse(opts: InteractiveButtonOptions[T]): Unit
  def reset(): Unit
  def send(targetUrl: InteractiveButtonUrl, body: T): js.Promise[Unit]
}

object InteractiveButtons {
  @scala.inline
  def apply[T](
    addResponse: InteractiveButtonOptions[T] => Unit,
    calls: js.Array[InteractiveButtonCall[T]],
    reset: () => Unit,
    send: (InteractiveButtonUrl, T) => js.Promise[Unit]
  ): InteractiveButtons[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1(addResponse), calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[InteractiveButtons[T]]
  }
}

