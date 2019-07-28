package typings.reactDashCountup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PauseResume extends js.Object {
  def pauseResume(): Unit
  def reset(): Unit
  def start(): Unit
  def update(): Unit
}

object Anon_PauseResume {
  @scala.inline
  def apply(pauseResume: () => Unit, reset: () => Unit, start: () => Unit, update: () => Unit): Anon_PauseResume = {
    val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[Anon_PauseResume]
  }
}

