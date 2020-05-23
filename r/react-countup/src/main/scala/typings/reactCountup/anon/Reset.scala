package typings.reactCountup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reset extends js.Object {
  def pauseResume(): Unit
  def reset(): Unit
  def update(): Unit
}

object Reset {
  @scala.inline
  def apply(pauseResume: () => Unit, reset: () => Unit, update: () => Unit): Reset = {
    val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Reset]
  }
}

