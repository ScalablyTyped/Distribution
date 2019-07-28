package typings.raphael

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelAnimation extends js.Object {
  def delay(delay: Double): RaphaelAnimation
  def repeat(repeat: Double): RaphaelAnimation
}

object RaphaelAnimation {
  @scala.inline
  def apply(delay: Double => RaphaelAnimation, repeat: Double => RaphaelAnimation): RaphaelAnimation = {
    val __obj = js.Dynamic.literal(delay = js.Any.fromFunction1(delay), repeat = js.Any.fromFunction1(repeat))
  
    __obj.asInstanceOf[RaphaelAnimation]
  }
}

