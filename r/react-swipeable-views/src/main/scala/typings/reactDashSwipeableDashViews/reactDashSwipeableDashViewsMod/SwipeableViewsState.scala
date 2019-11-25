package typings.reactDashSwipeableDashViews.reactDashSwipeableDashViewsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeableViewsState extends js.Object {
  var displaySameSlide: js.UndefOr[Boolean] = js.undefined
  var heightLatest: js.UndefOr[Double] = js.undefined
  var indexCurrent: js.UndefOr[Double] = js.undefined
  var indexLatest: js.UndefOr[Double] = js.undefined
  var isDragging: js.UndefOr[Boolean] = js.undefined
  var isFirstRender: js.UndefOr[Boolean] = js.undefined
}

object SwipeableViewsState {
  @scala.inline
  def apply(
    displaySameSlide: js.UndefOr[Boolean] = js.undefined,
    heightLatest: Int | Double = null,
    indexCurrent: Int | Double = null,
    indexLatest: Int | Double = null,
    isDragging: js.UndefOr[Boolean] = js.undefined,
    isFirstRender: js.UndefOr[Boolean] = js.undefined
  ): SwipeableViewsState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displaySameSlide)) __obj.updateDynamic("displaySameSlide")(displaySameSlide.asInstanceOf[js.Any])
    if (heightLatest != null) __obj.updateDynamic("heightLatest")(heightLatest.asInstanceOf[js.Any])
    if (indexCurrent != null) __obj.updateDynamic("indexCurrent")(indexCurrent.asInstanceOf[js.Any])
    if (indexLatest != null) __obj.updateDynamic("indexLatest")(indexLatest.asInstanceOf[js.Any])
    if (!js.isUndefined(isDragging)) __obj.updateDynamic("isDragging")(isDragging.asInstanceOf[js.Any])
    if (!js.isUndefined(isFirstRender)) __obj.updateDynamic("isFirstRender")(isFirstRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeableViewsState]
  }
}

