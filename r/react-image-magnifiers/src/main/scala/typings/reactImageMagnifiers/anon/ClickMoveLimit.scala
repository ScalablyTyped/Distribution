package typings.reactImageMagnifiers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickMoveLimit extends js.Object {
  var clickMoveLimit: js.UndefOr[Double] = js.undefined
  var doubleTapDurationInMs: js.UndefOr[Double] = js.undefined
  var longTouchDurationInMs: js.UndefOr[Double] = js.undefined
  var longTouchMoveLimit: js.UndefOr[Double] = js.undefined
  var tapDurationInMs: js.UndefOr[Double] = js.undefined
}

object ClickMoveLimit {
  @scala.inline
  def apply(
    clickMoveLimit: js.UndefOr[Double] = js.undefined,
    doubleTapDurationInMs: js.UndefOr[Double] = js.undefined,
    longTouchDurationInMs: js.UndefOr[Double] = js.undefined,
    longTouchMoveLimit: js.UndefOr[Double] = js.undefined,
    tapDurationInMs: js.UndefOr[Double] = js.undefined
  ): ClickMoveLimit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickMoveLimit)) __obj.updateDynamic("clickMoveLimit")(clickMoveLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleTapDurationInMs)) __obj.updateDynamic("doubleTapDurationInMs")(doubleTapDurationInMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longTouchDurationInMs)) __obj.updateDynamic("longTouchDurationInMs")(longTouchDurationInMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longTouchMoveLimit)) __obj.updateDynamic("longTouchMoveLimit")(longTouchMoveLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tapDurationInMs)) __obj.updateDynamic("tapDurationInMs")(tapDurationInMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickMoveLimit]
  }
}

