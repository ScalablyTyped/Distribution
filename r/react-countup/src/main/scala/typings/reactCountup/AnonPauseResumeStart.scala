package typings.reactCountup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPauseResumeStart extends js.Object {
  def pauseResume(): Unit
  def start(): Unit
  def update(): Unit
}

object AnonPauseResumeStart {
  @scala.inline
  def apply(pauseResume: () => Unit, start: () => Unit, update: () => Unit): AnonPauseResumeStart = {
    val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), start = js.Any.fromFunction0(start), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[AnonPauseResumeStart]
  }
}

