package typings.scBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRun extends js.Object {
  var run: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonRun {
  @scala.inline
  def apply(run: () => Unit = null): AnonRun = {
    val __obj = js.Dynamic.literal()
    if (run != null) __obj.updateDynamic("run")(js.Any.fromFunction0(run))
    __obj.asInstanceOf[AnonRun]
  }
}

