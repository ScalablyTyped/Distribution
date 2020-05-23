package typings.reactVirtualized.anon

import typings.reactVirtualized.esMasonryMod.resetParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reset extends js.Object {
  def reset(params: resetParams): Unit
}

object Reset {
  @scala.inline
  def apply(reset: resetParams => Unit): Reset = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset))
    __obj.asInstanceOf[Reset]
  }
}

