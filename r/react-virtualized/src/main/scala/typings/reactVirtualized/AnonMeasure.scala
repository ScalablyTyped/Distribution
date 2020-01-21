package typings.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMeasure extends js.Object {
  def measure(): Unit
}

object AnonMeasure {
  @scala.inline
  def apply(measure: () => Unit): AnonMeasure = {
    val __obj = js.Dynamic.literal(measure = js.Any.fromFunction0(measure))
  
    __obj.asInstanceOf[AnonMeasure]
  }
}

