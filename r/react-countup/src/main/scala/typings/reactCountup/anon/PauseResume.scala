package typings.reactCountup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PauseResume extends js.Object {
  def pauseResume(): Unit
  def reset(): Unit
  def start(): Unit
  def update(): Unit
}

object PauseResume {
  @scala.inline
  def apply(pauseResume: () => Unit, reset: () => Unit, start: () => Unit, update: () => Unit): PauseResume = {
    val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[PauseResume]
  }
}

