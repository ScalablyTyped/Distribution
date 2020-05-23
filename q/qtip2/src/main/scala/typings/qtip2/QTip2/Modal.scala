package typings.qtip2.QTip2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modal extends js.Object {
  var blur: js.UndefOr[Boolean] = js.undefined
  var effect: js.UndefOr[Boolean | (js.Function1[/* state */ js.Any, Unit])] = js.undefined
  var escape: js.UndefOr[Boolean] = js.undefined
  var on: js.UndefOr[Boolean] = js.undefined
  var stealfocus: js.UndefOr[Boolean] = js.undefined
}

object Modal {
  @scala.inline
  def apply(
    blur: js.UndefOr[Boolean] = js.undefined,
    effect: Boolean | (js.Function1[/* state */ js.Any, Unit]) = null,
    escape: js.UndefOr[Boolean] = js.undefined,
    on: js.UndefOr[Boolean] = js.undefined,
    stealfocus: js.UndefOr[Boolean] = js.undefined
  ): Modal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blur)) __obj.updateDynamic("blur")(blur.get.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (!js.isUndefined(escape)) __obj.updateDynamic("escape")(escape.get.asInstanceOf[js.Any])
    if (!js.isUndefined(on)) __obj.updateDynamic("on")(on.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stealfocus)) __obj.updateDynamic("stealfocus")(stealfocus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modal]
  }
}

