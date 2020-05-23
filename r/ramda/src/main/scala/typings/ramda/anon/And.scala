package typings.ramda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait And extends js.Object {
  var and: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object And {
  @scala.inline
  def apply(and: /* repeated */ js.Any => _ = null): And = {
    val __obj = js.Dynamic.literal()
    if (and != null) __obj.updateDynamic("and")(js.Any.fromFunction1(and))
    __obj.asInstanceOf[And]
  }
}

