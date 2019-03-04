package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowRootInit extends js.Object {
  var delegatesFocus: js.UndefOr[scala.Boolean] = js.undefined
  var mode: stdLib.stdLibStrings.open | stdLib.stdLibStrings.closed
}

object ShadowRootInit {
  @scala.inline
  def apply(
    mode: stdLib.stdLibStrings.open | stdLib.stdLibStrings.closed,
    delegatesFocus: js.UndefOr[scala.Boolean] = js.undefined
  ): ShadowRootInit = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (!js.isUndefined(delegatesFocus)) __obj.updateDynamic("delegatesFocus")(delegatesFocus)
    __obj.asInstanceOf[ShadowRootInit]
  }
}

