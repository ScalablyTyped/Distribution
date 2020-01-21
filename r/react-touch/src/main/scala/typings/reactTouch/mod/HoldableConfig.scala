package typings.reactTouch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoldableConfig extends js.Object {
  def holdComplete(callback: js.Function0[Unit]): js.Function0[js.Function0[Unit]]
  def holdProgress(callback: js.Function0[Unit]): js.Function1[/* updateState */ js.Function1[/* holdLength */ Double, Unit], js.Function0[Unit]]
}

object HoldableConfig {
  @scala.inline
  def apply(
    holdComplete: js.Function0[Unit] => js.Function0[js.Function0[Unit]],
    holdProgress: js.Function0[Unit] => js.Function1[/* updateState */ js.Function1[/* holdLength */ Double, Unit], js.Function0[Unit]]
  ): HoldableConfig = {
    val __obj = js.Dynamic.literal(holdComplete = js.Any.fromFunction1(holdComplete), holdProgress = js.Any.fromFunction1(holdProgress))
  
    __obj.asInstanceOf[HoldableConfig]
  }
}

