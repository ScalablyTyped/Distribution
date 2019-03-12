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
    pauseResume: () => scala.Unit,
    reset: () => scala.Unit,
    start: () => scala.Unit,
    update: () => scala.Unit
  ): Anon_PauseResume = {
    val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[Anon_PauseResume]
  }
}

