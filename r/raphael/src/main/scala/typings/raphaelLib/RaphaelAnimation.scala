package typings
package raphaelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelAnimation extends js.Object {
  def delay(delay: scala.Double): RaphaelAnimation
  def repeat(repeat: scala.Double): RaphaelAnimation
}

object RaphaelAnimation {
  @scala.inline
  def apply(
    delay: js.Function1[scala.Double, RaphaelAnimation],
    repeat: js.Function1[scala.Double, RaphaelAnimation]
  ): RaphaelAnimation = {
    val __obj = js.Dynamic.literal(delay = delay, repeat = repeat)
  
    __obj.asInstanceOf[RaphaelAnimation]
  }
}

