package typings.slickDashCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurX extends js.Object {
  var curX: js.UndefOr[Double] = js.undefined
  var curY: js.UndefOr[Double] = js.undefined
  var edgeHit: js.UndefOr[Boolean] = js.undefined
  var fingerCount: js.UndefOr[Double] = js.undefined
  var minSwipe: js.UndefOr[Double] = js.undefined
  var startX: js.UndefOr[Double] = js.undefined
  var startY: js.UndefOr[Double] = js.undefined
  var swipeLength: js.UndefOr[Double] = js.undefined
  var verticalSwiping: js.UndefOr[Boolean] = js.undefined
}

object Anon_CurX {
  @scala.inline
  def apply(
    curX: Int | Double = null,
    curY: Int | Double = null,
    edgeHit: js.UndefOr[Boolean] = js.undefined,
    fingerCount: Int | Double = null,
    minSwipe: Int | Double = null,
    startX: Int | Double = null,
    startY: Int | Double = null,
    swipeLength: Int | Double = null,
    verticalSwiping: js.UndefOr[Boolean] = js.undefined
  ): Anon_CurX = {
    val __obj = js.Dynamic.literal()
    if (curX != null) __obj.updateDynamic("curX")(curX.asInstanceOf[js.Any])
    if (curY != null) __obj.updateDynamic("curY")(curY.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeHit)) __obj.updateDynamic("edgeHit")(edgeHit)
    if (fingerCount != null) __obj.updateDynamic("fingerCount")(fingerCount.asInstanceOf[js.Any])
    if (minSwipe != null) __obj.updateDynamic("minSwipe")(minSwipe.asInstanceOf[js.Any])
    if (startX != null) __obj.updateDynamic("startX")(startX.asInstanceOf[js.Any])
    if (startY != null) __obj.updateDynamic("startY")(startY.asInstanceOf[js.Any])
    if (swipeLength != null) __obj.updateDynamic("swipeLength")(swipeLength.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalSwiping)) __obj.updateDynamic("verticalSwiping")(verticalSwiping)
    __obj.asInstanceOf[Anon_CurX]
  }
}

