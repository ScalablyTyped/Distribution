package typings
package seedrandomLib.seedrandomMod.seedrandomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait seedRandomOptions extends js.Object {
  var entropy: js.UndefOr[scala.Boolean] = js.undefined
  var global: js.UndefOr[scala.Boolean] = js.undefined
  var pass: js.UndefOr[seedrandomCallback] = js.undefined
  var state: js.UndefOr[scala.Boolean | State] = js.undefined
}

object seedRandomOptions {
  @scala.inline
  def apply(
    entropy: js.UndefOr[scala.Boolean] = js.undefined,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    pass: seedrandomCallback = null,
    state: scala.Boolean | State = null
  ): seedRandomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entropy)) __obj.updateDynamic("entropy")(entropy)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (pass != null) __obj.updateDynamic("pass")(pass)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[seedRandomOptions]
  }
}

