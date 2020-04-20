package typings.sinonjsFakeTimers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNow extends js.Object {
  def now(): Double
}

object AnonNow {
  @scala.inline
  def apply(now: () => Double): AnonNow = {
    val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
    __obj.asInstanceOf[AnonNow]
  }
}

