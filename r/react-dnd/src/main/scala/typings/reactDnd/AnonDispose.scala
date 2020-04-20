package typings.reactDnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDispose extends js.Object {
  var dispose: js.Function0[Unit]
}

object AnonDispose {
  @scala.inline
  def apply(dispose: () => Unit): AnonDispose = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[AnonDispose]
  }
}

