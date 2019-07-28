package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_A extends js.Object {
  var and: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object Anon_A {
  @scala.inline
  def apply(and: /* repeated */ js.Any => _ = null): Anon_A = {
    val __obj = js.Dynamic.literal()
    if (and != null) __obj.updateDynamic("and")(js.Any.fromFunction1(and))
    __obj.asInstanceOf[Anon_A]
  }
}

