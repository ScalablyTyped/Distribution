package typings
package reactDashNativeDashCollapsibleLib.reactDashNativeDashCollapsibleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleProps extends js.Object {
  /**
    * Alignment of the content when transitioning, can be top, center or bottom
    *
    * @default top
    */
  var align: js.UndefOr[
    reactDashNativeDashCollapsibleLib.reactDashNativeDashCollapsibleLibStrings.top | reactDashNativeDashCollapsibleLib.reactDashNativeDashCollapsibleLibStrings.center | reactDashNativeDashCollapsibleLib.reactDashNativeDashCollapsibleLibStrings.bottom
  ] = js.undefined
  /**
    * Whether to show the child components or not
    *
    * @default true
    */
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Which height should the component collapse to
    *
    * @default 0
    */
  var collapsedHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Duration of transition in milliseconds
    *
    * @default 300
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Function or function name from Easing (or tween-functions if < RN 0.8). Collapsible will try to combine Easing functions for you if you name them like tween-functions
    *
    * @default easeOutCubic
    */
  var easing: js.UndefOr[EasingMode | js.Any] = js.undefined
  /**
    * Enable pointer events on collapsed view
    * 
    * @default false
    */
  var enablePointerEvents: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Function called when the animation finished
    */
  var onAnimationEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Optional styling for the container
    */
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object CollapsibleProps {
  @scala.inline
  def apply(
    align: reactDashNativeDashCollapsibleLib.reactDashNativeDashCollapsibleLibStrings.top | reactDashNativeDashCollapsibleLib.reactDashNativeDashCollapsibleLibStrings.center | reactDashNativeDashCollapsibleLib.reactDashNativeDashCollapsibleLibStrings.bottom = null,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    collapsedHeight: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    easing: EasingMode | js.Any = null,
    enablePointerEvents: js.UndefOr[scala.Boolean] = js.undefined,
    onAnimationEnd: js.Function0[scala.Unit] = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null
  ): CollapsibleProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (collapsedHeight != null) __obj.updateDynamic("collapsedHeight")(collapsedHeight.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePointerEvents)) __obj.updateDynamic("enablePointerEvents")(enablePointerEvents)
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(onAnimationEnd)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsibleProps]
  }
}

