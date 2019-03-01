package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsSplitView extends js.Object {
  /**
    * Master view display mode
    * @default 'auto'
    */
  var displayMode: js.UndefOr[
    reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.auto | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.visible | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.hidden | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.overlay
  ] = js.undefined
  /**
    * Set the maximum width of master view
    */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set the minimum width of master view
    */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Master view side. Leading is left. Trailing is right.
    * @default 'leading'
    */
  var primaryEdge: js.UndefOr[
    reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.leading | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.trailing
  ] = js.undefined
}

object OptionsSplitView {
  @scala.inline
  def apply(
    displayMode: reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.auto | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.visible | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.hidden | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.overlay = null,
    maxWidth: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    primaryEdge: reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.leading | reactDashNativeDashNavigationLib.reactDashNativeDashNavigationLibStrings.trailing = null
  ): OptionsSplitView = {
    val __obj = js.Dynamic.literal()
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (primaryEdge != null) __obj.updateDynamic("primaryEdge")(primaryEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsSplitView]
  }
}

