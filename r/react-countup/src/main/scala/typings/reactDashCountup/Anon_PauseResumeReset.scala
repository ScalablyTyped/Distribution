package typings.reactDashCountup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PauseResumeReset extends js.Object {
  def pauseResume(): Unit
  def reset(): Unit
  def update(): Unit
}

object Anon_PauseResumeReset {
  @scala.inline
  def apply(pauseResume: () => Unit, reset: () => Unit, update: () => Unit): Anon_PauseResumeReset = {
    val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[Anon_PauseResumeReset]
  }
}

