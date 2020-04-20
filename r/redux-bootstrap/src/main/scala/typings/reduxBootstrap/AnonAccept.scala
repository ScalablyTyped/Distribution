package typings.reduxBootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccept extends js.Object {
  def accept(path: String, cb: js.Function0[Unit]): Unit
}

object AnonAccept {
  @scala.inline
  def apply(accept: (String, js.Function0[Unit]) => Unit): AnonAccept = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction2(accept))
    __obj.asInstanceOf[AnonAccept]
  }
}

