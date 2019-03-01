package typings
package reactDashSwipeableDashViewsLib.reactDashSwipeableDashViewsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeableViewsState extends js.Object {
  var displaySameSlide: js.UndefOr[scala.Boolean] = js.undefined
  var heightLatest: js.UndefOr[scala.Double] = js.undefined
  var indexCurrent: js.UndefOr[scala.Double] = js.undefined
  var indexLatest: js.UndefOr[scala.Double] = js.undefined
  var isDragging: js.UndefOr[scala.Boolean] = js.undefined
  var isFirstRender: js.UndefOr[scala.Boolean] = js.undefined
}

object SwipeableViewsState {
  @scala.inline
  def apply(
    displaySameSlide: js.UndefOr[scala.Boolean] = js.undefined,
    heightLatest: scala.Int | scala.Double = null,
    indexCurrent: scala.Int | scala.Double = null,
    indexLatest: scala.Int | scala.Double = null,
    isDragging: js.UndefOr[scala.Boolean] = js.undefined,
    isFirstRender: js.UndefOr[scala.Boolean] = js.undefined
  ): SwipeableViewsState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displaySameSlide)) __obj.updateDynamic("displaySameSlide")(displaySameSlide)
    if (heightLatest != null) __obj.updateDynamic("heightLatest")(heightLatest.asInstanceOf[js.Any])
    if (indexCurrent != null) __obj.updateDynamic("indexCurrent")(indexCurrent.asInstanceOf[js.Any])
    if (indexLatest != null) __obj.updateDynamic("indexLatest")(indexLatest.asInstanceOf[js.Any])
    if (!js.isUndefined(isDragging)) __obj.updateDynamic("isDragging")(isDragging)
    if (!js.isUndefined(isFirstRender)) __obj.updateDynamic("isFirstRender")(isFirstRender)
    __obj.asInstanceOf[SwipeableViewsState]
  }
}

