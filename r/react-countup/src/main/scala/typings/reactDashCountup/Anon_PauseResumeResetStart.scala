package typings.reactDashCountup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PauseResumeResetStart extends js.Object {
  def pauseResume(): Unit
  def reset(): Unit
  def start(): Unit
}

object Anon_PauseResumeResetStart {
  @scala.inline
  def apply(pauseResume: () => Unit, reset: () => Unit, start: () => Unit): Anon_PauseResumeResetStart = {
    val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[Anon_PauseResumeResetStart]
  }
}

