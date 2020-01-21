package typings.randomJs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Engine extends js.Object {
  def next(): Double
}

object Engine {
  @scala.inline
  def apply(next: () => Double): Engine = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[Engine]
  }
}

