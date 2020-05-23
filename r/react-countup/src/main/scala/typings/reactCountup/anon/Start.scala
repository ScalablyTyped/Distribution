package typings.reactCountup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Start extends js.Object {
  def reset(): Unit
  def start(): Unit
  def update(): Unit
}

object Start {
  @scala.inline
  def apply(reset: () => Unit, start: () => Unit, update: () => Unit): Start = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Start]
  }
}

