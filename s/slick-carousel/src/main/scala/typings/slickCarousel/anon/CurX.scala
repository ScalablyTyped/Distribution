package typings.slickCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurX extends js.Object {
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

object CurX {
  @scala.inline
  def apply(
    curX: js.UndefOr[Double] = js.undefined,
    curY: js.UndefOr[Double] = js.undefined,
    edgeHit: js.UndefOr[Boolean] = js.undefined,
    fingerCount: js.UndefOr[Double] = js.undefined,
    minSwipe: js.UndefOr[Double] = js.undefined,
    startX: js.UndefOr[Double] = js.undefined,
    startY: js.UndefOr[Double] = js.undefined,
    swipeLength: js.UndefOr[Double] = js.undefined,
    verticalSwiping: js.UndefOr[Boolean] = js.undefined
  ): CurX = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(curX)) __obj.updateDynamic("curX")(curX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(curY)) __obj.updateDynamic("curY")(curY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeHit)) __obj.updateDynamic("edgeHit")(edgeHit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fingerCount)) __obj.updateDynamic("fingerCount")(fingerCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSwipe)) __obj.updateDynamic("minSwipe")(minSwipe.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startX)) __obj.updateDynamic("startX")(startX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startY)) __obj.updateDynamic("startY")(startY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeLength)) __obj.updateDynamic("swipeLength")(swipeLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalSwiping)) __obj.updateDynamic("verticalSwiping")(verticalSwiping.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurX]
  }
}

