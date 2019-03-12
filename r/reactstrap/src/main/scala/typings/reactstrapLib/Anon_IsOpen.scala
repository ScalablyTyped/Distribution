package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsOpen extends js.Object {
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var toggle: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Anon_IsOpen {
  @scala.inline
  def apply(isOpen: js.UndefOr[scala.Boolean] = js.undefined, toggle: () => scala.Unit = null): Anon_IsOpen = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Anon_IsOpen]
  }
}

