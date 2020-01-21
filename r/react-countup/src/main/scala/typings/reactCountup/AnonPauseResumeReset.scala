package typings.reactCountup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPauseResumeReset extends js.Object {
  def pauseResume(): Unit
  def reset(): Unit
  def update(): Unit
}

object AnonPauseResumeReset {
  @scala.inline
  def apply(pauseResume: () => Unit, reset: () => Unit, update: () => Unit): AnonPauseResumeReset = {
    val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[AnonPauseResumeReset]
  }
}

