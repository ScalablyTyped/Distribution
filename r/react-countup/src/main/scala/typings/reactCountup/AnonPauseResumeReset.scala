package typings.reactCountup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPauseResumeReset extends js.Object {
  def pauseResume(): Unit
  def reset(): Unit
  def start(): Unit
}

object AnonPauseResumeReset {
  @scala.inline
  def apply(pauseResume: () => Unit, reset: () => Unit, start: () => Unit): AnonPauseResumeReset = {
    val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[AnonPauseResumeReset]
  }
}

