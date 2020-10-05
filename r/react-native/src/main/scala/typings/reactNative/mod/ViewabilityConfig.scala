package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewabilityConfig extends js.Object {
  /**
    * Similar to `viewAreaCoveragePercentThreshold`, but considers the percent of the item that is visible,
    * rather than the fraction of the viewable area it covers.
    */
  var itemVisiblePercentThreshold: js.UndefOr[Double] = js.native
  /**
    * Minimum amount of time (in milliseconds) that an item must be physically viewable before the
    * viewability callback will be fired. A high number means that scrolling through content without
    * stopping will not mark the content as viewable.
    */
  var minimumViewTime: js.UndefOr[Double] = js.native
  /**
    * Percent of viewport that must be covered for a partially occluded item to count as
    * "viewable", 0-100. Fully visible items are always considered viewable. A value of 0 means
    * that a single pixel in the viewport makes the item viewable, and a value of 100 means that
    * an item must be either entirely visible or cover the entire viewport to count as viewable.
    */
  var viewAreaCoveragePercentThreshold: js.UndefOr[Double] = js.native
  /**
    * Nothing is considered viewable until the user scrolls or `recordInteraction` is called after
    * render.
    */
  var waitForInteraction: js.UndefOr[Boolean] = js.native
}

object ViewabilityConfig {
  @scala.inline
  def apply(): ViewabilityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewabilityConfig]
  }
  @scala.inline
  implicit class ViewabilityConfigOps[Self <: ViewabilityConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemVisiblePercentThreshold(value: Double): Self = this.set("itemVisiblePercentThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemVisiblePercentThreshold: Self = this.set("itemVisiblePercentThreshold", js.undefined)
    @scala.inline
    def setMinimumViewTime(value: Double): Self = this.set("minimumViewTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumViewTime: Self = this.set("minimumViewTime", js.undefined)
    @scala.inline
    def setViewAreaCoveragePercentThreshold(value: Double): Self = this.set("viewAreaCoveragePercentThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewAreaCoveragePercentThreshold: Self = this.set("viewAreaCoveragePercentThreshold", js.undefined)
    @scala.inline
    def setWaitForInteraction(value: Boolean): Self = this.set("waitForInteraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForInteraction: Self = this.set("waitForInteraction", js.undefined)
  }
  
}

