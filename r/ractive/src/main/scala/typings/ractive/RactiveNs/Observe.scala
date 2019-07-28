package typings.ractive.RactiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observe extends js.Object {
  def cancel(): Unit
}

object Observe {
  @scala.inline
  def apply(cancel: () => Unit): Observe = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
  
    __obj.asInstanceOf[Observe]
  }
}

