package typings.reactDnd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dispose extends js.Object {
  var dispose: js.Function0[Unit]
}

object Dispose {
  @scala.inline
  def apply(dispose: () => Unit): Dispose = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[Dispose]
  }
}

