package typings.reactDashCountup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PauseResumeStart extends js.Object {
  def pauseResume(): Unit
  def start(): Unit
  def update(): Unit
}

object Anon_PauseResumeStart {
  @scala.inline
  def apply(pauseResume: () => Unit, start: () => Unit, update: () => Unit): Anon_PauseResumeStart = {
    val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), start = js.Any.fromFunction0(start), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[Anon_PauseResumeStart]
  }
}

