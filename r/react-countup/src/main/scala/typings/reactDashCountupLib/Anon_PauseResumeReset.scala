package typings
package reactDashCountupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PauseResumeReset extends js.Object {
  def pauseResume(): scala.Unit
  def reset(): scala.Unit
  def update(): scala.Unit
}

object Anon_PauseResumeReset {
  @scala.inline
  def apply(pauseResume: () => scala.Unit, reset: () => scala.Unit, update: () => scala.Unit): Anon_PauseResumeReset = {
    val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[Anon_PauseResumeReset]
  }
}

