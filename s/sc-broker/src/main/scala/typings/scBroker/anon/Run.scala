package typings.scBroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Run extends js.Object {
  var run: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Run {
  @scala.inline
  def apply(run: () => Unit = null): Run = {
    val __obj = js.Dynamic.literal()
    if (run != null) __obj.updateDynamic("run")(js.Any.fromFunction0(run))
    __obj.asInstanceOf[Run]
  }
}

