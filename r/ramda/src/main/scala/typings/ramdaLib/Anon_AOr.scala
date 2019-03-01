package typings
package ramdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AOr extends js.Object {
  var or: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object Anon_AOr {
  @scala.inline
  def apply(or: js.Function1[/* repeated */ js.Any, _] = null): Anon_AOr = {
    val __obj = js.Dynamic.literal()
    if (or != null) __obj.updateDynamic("or")(or)
    __obj.asInstanceOf[Anon_AOr]
  }
}

