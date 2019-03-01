package typings
package qtip2Lib.QTip2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modal extends js.Object {
  var blur: js.UndefOr[scala.Boolean] = js.undefined
  var effect: js.UndefOr[scala.Boolean | (js.Function1[/* state */ js.Any, scala.Unit])] = js.undefined
  var escape: js.UndefOr[scala.Boolean] = js.undefined
  var on: js.UndefOr[scala.Boolean] = js.undefined
  var stealfocus: js.UndefOr[scala.Boolean] = js.undefined
}

object Modal {
  @scala.inline
  def apply(
    blur: js.UndefOr[scala.Boolean] = js.undefined,
    effect: scala.Boolean | (js.Function1[/* state */ js.Any, scala.Unit]) = null,
    escape: js.UndefOr[scala.Boolean] = js.undefined,
    on: js.UndefOr[scala.Boolean] = js.undefined,
    stealfocus: js.UndefOr[scala.Boolean] = js.undefined
  ): Modal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blur)) __obj.updateDynamic("blur")(blur)
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (!js.isUndefined(escape)) __obj.updateDynamic("escape")(escape)
    if (!js.isUndefined(on)) __obj.updateDynamic("on")(on)
    if (!js.isUndefined(stealfocus)) __obj.updateDynamic("stealfocus")(stealfocus)
    __obj.asInstanceOf[Modal]
  }
}

