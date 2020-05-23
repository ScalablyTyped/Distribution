package typings.sinonjsFakeTimers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Now extends js.Object {
  def now(): Double
}

object Now {
  @scala.inline
  def apply(now: () => Double): Now = {
    val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
    __obj.asInstanceOf[Now]
  }
}

