package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewabilityConfig extends js.Object {
  /**
    * Similar to `viewAreaCoveragePercentThreshold`, but considers the percent of the item that is visible,
    * rather than the fraction of the viewable area it covers.
    */
  var itemVisiblePercentThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Minimum amount of time (in milliseconds) that an item must be physically viewable before the
    * viewability callback will be fired. A high number means that scrolling through content without
    * stopping will not mark the content as viewable.
    */
  var minimumViewTime: js.UndefOr[Double] = js.undefined
  /**
    * Percent of viewport that must be covered for a partially occluded item to count as
    * "viewable", 0-100. Fully visible items are always considered viewable. A value of 0 means
    * that a single pixel in the viewport makes the item viewable, and a value of 100 means that
    * an item must be either entirely visible or cover the entire viewport to count as viewable.
    */
  var viewAreaCoveragePercentThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Nothing is considered viewable until the user scrolls or `recordInteraction` is called after
    * render.
    */
  var waitForInteraction: js.UndefOr[Boolean] = js.undefined
}

object ViewabilityConfig {
  @scala.inline
  def apply(
    itemVisiblePercentThreshold: js.UndefOr[Double] = js.undefined,
    minimumViewTime: js.UndefOr[Double] = js.undefined,
    viewAreaCoveragePercentThreshold: js.UndefOr[Double] = js.undefined,
    waitForInteraction: js.UndefOr[Boolean] = js.undefined
  ): ViewabilityConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(itemVisiblePercentThreshold)) __obj.updateDynamic("itemVisiblePercentThreshold")(itemVisiblePercentThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumViewTime)) __obj.updateDynamic("minimumViewTime")(minimumViewTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewAreaCoveragePercentThreshold)) __obj.updateDynamic("viewAreaCoveragePercentThreshold")(viewAreaCoveragePercentThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForInteraction)) __obj.updateDynamic("waitForInteraction")(waitForInteraction.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewabilityConfig]
  }
}

