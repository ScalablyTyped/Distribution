package typings.ranjs.mod._ts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commons extends js.Object {
  def reset(): Unit
  def update(x: js.Array[Double]): Unit
}

object Commons {
  @scala.inline
  def apply(reset: () => Unit, update: js.Array[Double] => Unit): Commons = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Commons]
  }
}

