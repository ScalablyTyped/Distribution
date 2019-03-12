package typings
package reactDashCountupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PauseResumeResetStart extends js.Object {
  def pauseResume(): scala.Unit
  def reset(): scala.Unit
  def start(): scala.Unit
}

object Anon_PauseResumeResetStart {
  @scala.inline
  def apply(pauseResume: () => scala.Unit, reset: () => scala.Unit, start: () => scala.Unit): Anon_PauseResumeResetStart = {
    val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[Anon_PauseResumeResetStart]
  }
}

