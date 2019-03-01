package typings
package reactDashSplitterDashLayoutLib.reactDashSplitterDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitterLayoutProps extends js.Object {
  /**
    * Custom CSS class name applied to the layout div.
    * You can use this to customize layout style.
    * Refers to the original stylesheet to see what you can customize.
    */
  var customClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Called when dragging finishes.
    *
    * No parameter will be passed to event handlers.
    */
  var onDragEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Called when dragging is started.
    *
    * No parameter will be passed to event handlers.
    */
  var onDragStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Called when the size of secondary pane is changed.
    *
    * Event handlers will be passed with a single parameter of number type representing
    * new size of secondary pane.
    * When percentage is set to false, the value is in pixel size.
    * When percentage is set to true, the value is in percentage.
    */
  var onSecondaryPaneSizeChange: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Determine whether the width of each pane should be calculated in percentage or by pixels.
    * The default value is false, which means width is calculated in pixels.
    *
    * @default false
    */
  var percentage: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Index of the primary pane.
    * Since SplitterLayout supports at most 2 children, only 0 or 1 is allowed.
    *
    * A primary pane is used to show users primary content, while a secondary pane is the other pane.
    * When window size changes and percentage is set to false, primary pane's size is flexible
    * and secondary pane's size is kept unchanged. However, when the window size is not enough
    * for showing both minimal primary pane and minimal secondary pane,
    * the primary pane's size is served first.
    *
    * @default 0
    */
  var primaryIndex: js.UndefOr[TPrimaryIndex] = js.undefined
  /**
    * Minimal size of primary pane.
    * When percentage is set to false, this value is pixel size (25 means 25px).
    * When percentage is set to true, this value is percentage (25 means 25%).
    *
    * @default 0
    */
  var primaryMinSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Initial size of secondary pane when page loads.
    * If this prop is not defined, SplitterLayout tries to split the layout with equal sizes.
    * (Note: equal size may not apply when there are nested layouts.)
    *
    * @default undefined
    */
  var secondaryInitialSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimal size of secondary pane.
    */
  var secondaryMinSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Determine whether the layout should be a horizontal split or a vertical split.
    *
    * @default false
    */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object SplitterLayoutProps {
  @scala.inline
  def apply(
    customClassName: java.lang.String = null,
    onDragEnd: js.Function0[scala.Unit] = null,
    onDragStart: js.Function0[scala.Unit] = null,
    onSecondaryPaneSizeChange: js.Function1[/* value */ scala.Double, scala.Unit] = null,
    percentage: js.UndefOr[scala.Boolean] = js.undefined,
    primaryIndex: TPrimaryIndex = null,
    primaryMinSize: scala.Int | scala.Double = null,
    secondaryInitialSize: scala.Int | scala.Double = null,
    secondaryMinSize: scala.Int | scala.Double = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): SplitterLayoutProps = {
    val __obj = js.Dynamic.literal()
    if (customClassName != null) __obj.updateDynamic("customClassName")(customClassName)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onSecondaryPaneSizeChange != null) __obj.updateDynamic("onSecondaryPaneSizeChange")(onSecondaryPaneSizeChange)
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage)
    if (primaryIndex != null) __obj.updateDynamic("primaryIndex")(primaryIndex)
    if (primaryMinSize != null) __obj.updateDynamic("primaryMinSize")(primaryMinSize.asInstanceOf[js.Any])
    if (secondaryInitialSize != null) __obj.updateDynamic("secondaryInitialSize")(secondaryInitialSize.asInstanceOf[js.Any])
    if (secondaryMinSize != null) __obj.updateDynamic("secondaryMinSize")(secondaryMinSize.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[SplitterLayoutProps]
  }
}

