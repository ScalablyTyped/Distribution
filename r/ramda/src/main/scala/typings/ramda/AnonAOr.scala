package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAOr extends js.Object {
  var or: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object AnonAOr {
  @scala.inline
  def apply(or: /* repeated */ js.Any => _ = null): AnonAOr = {
    val __obj = js.Dynamic.literal()
    if (or != null) __obj.updateDynamic("or")(js.Any.fromFunction1(or))
    __obj.asInstanceOf[AnonAOr]
  }
}

