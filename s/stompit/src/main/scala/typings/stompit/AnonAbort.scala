package typings.stompit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbort extends js.Object {
  def abort(): Unit
}

object AnonAbort {
  @scala.inline
  def apply(abort: () => Unit): AnonAbort = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    __obj.asInstanceOf[AnonAbort]
  }
}

