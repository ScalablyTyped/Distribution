package typings.reactVirtualized

import typings.reactVirtualized.esMasonryMod.resetParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReset extends js.Object {
  def reset(params: resetParams): Unit
}

object AnonReset {
  @scala.inline
  def apply(reset: resetParams => Unit): AnonReset = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset))
    __obj.asInstanceOf[AnonReset]
  }
}

