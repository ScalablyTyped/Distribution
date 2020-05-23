package typings.reduxTestkit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flush extends js.Object {
  def flush(): Unit
  def reset(): Unit
}

object Flush {
  @scala.inline
  def apply(flush: () => Unit, reset: () => Unit): Flush = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Flush]
  }
}

