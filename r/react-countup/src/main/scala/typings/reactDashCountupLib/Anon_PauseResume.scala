package typings
package reactDashCountupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PauseResume extends js.Object {
  def pauseResume(): scala.Unit
  def reset(): scala.Unit
  def start(): scala.Unit
  def update(): scala.Unit
}

object Anon_PauseResume {
  @scala.inline
  def apply(
    pauseResume: js.Function0[scala.Unit],
    reset: js.Function0[scala.Unit],
    start: js.Function0[scala.Unit],
    update: js.Function0[scala.Unit]
  ): Anon_PauseResume = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pauseResume")(pauseResume)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Anon_PauseResume]
  }
}

