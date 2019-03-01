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
  def apply(
    pauseResume: js.Function0[scala.Unit],
    reset: js.Function0[scala.Unit],
    start: js.Function0[scala.Unit]
  ): Anon_PauseResumeResetStart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pauseResume")(pauseResume)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_PauseResumeResetStart]
  }
}

