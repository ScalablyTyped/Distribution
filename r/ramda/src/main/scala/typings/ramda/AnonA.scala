package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonA extends js.Object {
  var and: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object AnonA {
  @scala.inline
  def apply(and: /* repeated */ js.Any => _ = null): AnonA = {
    val __obj = js.Dynamic.literal()
    if (and != null) __obj.updateDynamic("and")(js.Any.fromFunction1(and))
    __obj.asInstanceOf[AnonA]
  }
}

