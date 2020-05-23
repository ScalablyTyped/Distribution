package typings.reduxBootstrap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accept extends js.Object {
  def accept(path: String, cb: js.Function0[Unit]): Unit
}

object Accept {
  @scala.inline
  def apply(accept: (String, js.Function0[Unit]) => Unit): Accept = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction2(accept))
    __obj.asInstanceOf[Accept]
  }
}

