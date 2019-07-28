package typings.reactDashCountup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Reset extends js.Object {
  def reset(): Unit
  def start(): Unit
  def update(): Unit
}

object Anon_Reset {
  @scala.inline
  def apply(reset: () => Unit, start: () => Unit, update: () => Unit): Anon_Reset = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[Anon_Reset]
  }
}

