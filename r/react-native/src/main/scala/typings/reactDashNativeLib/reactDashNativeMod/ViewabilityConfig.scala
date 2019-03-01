package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewabilityConfig extends js.Object {
  /**
    * Similar to `viewAreaCoveragePercentThreshold`, but considers the percent of the item that is visible,
    * rather than the fraction of the viewable area it covers.
    */
  var itemVisiblePercentThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum amount of time (in milliseconds) that an item must be physically viewable before the
    * viewability callback will be fired. A high number means that scrolling through content without
    * stopping will not mark the content as viewable.
    */
  var minimumViewTime: js.UndefOr[scala.Double] = js.undefined
  /**
    * Percent of viewport that must be covered for a partially occluded item to count as
    * "viewable", 0-100. Fully visible items are always considered viewable. A value of 0 means
    * that a single pixel in the viewport makes the item viewable, and a value of 100 means that
    * an item must be either entirely visible or cover the entire viewport to count as viewable.
    */
  var viewAreaCoveragePercentThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Nothing is considered viewable until the user scrolls or `recordInteraction` is called after
    * render.
    */
  var waitForInteraction: js.UndefOr[scala.Boolean] = js.undefined
}

object ViewabilityConfig {
  @scala.inline
  def apply(
    itemVisiblePercentThreshold: scala.Int | scala.Double = null,
    minimumViewTime: scala.Int | scala.Double = null,
    viewAreaCoveragePercentThreshold: scala.Int | scala.Double = null,
    waitForInteraction: js.UndefOr[scala.Boolean] = js.undefined
  ): ViewabilityConfig = {
    val __obj = js.Dynamic.literal()
    if (itemVisiblePercentThreshold != null) __obj.updateDynamic("itemVisiblePercentThreshold")(itemVisiblePercentThreshold.asInstanceOf[js.Any])
    if (minimumViewTime != null) __obj.updateDynamic("minimumViewTime")(minimumViewTime.asInstanceOf[js.Any])
    if (viewAreaCoveragePercentThreshold != null) __obj.updateDynamic("viewAreaCoveragePercentThreshold")(viewAreaCoveragePercentThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForInteraction)) __obj.updateDynamic("waitForInteraction")(waitForInteraction)
    __obj.asInstanceOf[ViewabilityConfig]
  }
}

