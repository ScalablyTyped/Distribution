package typings.reduxTestkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlush extends js.Object {
  def flush(): Unit
  def reset(): Unit
}

object AnonFlush {
  @scala.inline
  def apply(flush: () => Unit, reset: () => Unit): AnonFlush = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[AnonFlush]
  }
}

