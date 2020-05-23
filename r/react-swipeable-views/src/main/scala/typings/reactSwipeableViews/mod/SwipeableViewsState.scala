package typings.reactSwipeableViews.mod

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
    heightLatest: js.UndefOr[Double] = js.undefined,
    indexCurrent: js.UndefOr[Double] = js.undefined,
    indexLatest: js.UndefOr[Double] = js.undefined,
    isDragging: js.UndefOr[Boolean] = js.undefined,
    isFirstRender: js.UndefOr[Boolean] = js.undefined
  ): SwipeableViewsState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displaySameSlide)) __obj.updateDynamic("displaySameSlide")(displaySameSlide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heightLatest)) __obj.updateDynamic("heightLatest")(heightLatest.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indexCurrent)) __obj.updateDynamic("indexCurrent")(indexCurrent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indexLatest)) __obj.updateDynamic("indexLatest")(indexLatest.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDragging)) __obj.updateDynamic("isDragging")(isDragging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFirstRender)) __obj.updateDynamic("isFirstRender")(isFirstRender.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeableViewsState]
  }
}

