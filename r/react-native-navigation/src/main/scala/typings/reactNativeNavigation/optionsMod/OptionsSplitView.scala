package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.auto
import typings.reactNativeNavigation.reactNativeNavigationStrings.hidden
import typings.reactNativeNavigation.reactNativeNavigationStrings.leading
import typings.reactNativeNavigation.reactNativeNavigationStrings.overlay
import typings.reactNativeNavigation.reactNativeNavigationStrings.trailing
import typings.reactNativeNavigation.reactNativeNavigationStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsSplitView extends js.Object {
  /**
    * Master view display mode
    * @default 'auto'
    */
  var displayMode: js.UndefOr[auto | visible | hidden | overlay] = js.undefined
  /**
    * Set the maximum width of master view
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
    * Set the minimum width of master view
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
    * Master view side. Leading is left. Trailing is right.
    * @default 'leading'
    */
  var primaryEdge: js.UndefOr[leading | trailing] = js.undefined
}

object OptionsSplitView {
  @scala.inline
  def apply(
    displayMode: auto | visible | hidden | overlay = null,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    primaryEdge: leading | trailing = null
  ): OptionsSplitView = {
    val __obj = js.Dynamic.literal()
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (primaryEdge != null) __obj.updateDynamic("primaryEdge")(primaryEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsSplitView]
  }
}

