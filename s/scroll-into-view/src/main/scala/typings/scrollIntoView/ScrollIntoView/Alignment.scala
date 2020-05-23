package typings.scrollIntoView.ScrollIntoView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alignment extends js.Object {
  /** 0 to 1, default 0.5 (center) */
  var left: js.UndefOr[Double] = js.undefined
  /** pixels to offset left alignment */
  var leftOffset: js.UndefOr[Double] = js.undefined
  /** 0 to 1, default 0.5 (center) */
  var top: js.UndefOr[Double] = js.undefined
  /** pixels to offset top alignment */
  var topOffset: js.UndefOr[Double] = js.undefined
}

object Alignment {
  @scala.inline
  def apply(
    left: js.UndefOr[Double] = js.undefined,
    leftOffset: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined,
    topOffset: js.UndefOr[Double] = js.undefined
  ): Alignment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leftOffset)) __obj.updateDynamic("leftOffset")(leftOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topOffset)) __obj.updateDynamic("topOffset")(topOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alignment]
  }
}

