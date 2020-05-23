package typings.reactNativeCollapsible.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeCollapsible.reactNativeCollapsibleStrings.bottom
import typings.reactNativeCollapsible.reactNativeCollapsibleStrings.center
import typings.reactNativeCollapsible.reactNativeCollapsibleStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleProps extends js.Object {
  /**
    * Alignment of the content when transitioning, can be top, center or bottom
    *
    * @default top
    */
  var align: js.UndefOr[top | center | bottom] = js.undefined
  /**
    * Whether to show the child components or not
    *
    * @default true
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  /**
    * Which height should the component collapse to
    *
    * @default 0
    */
  var collapsedHeight: js.UndefOr[Double] = js.undefined
  /**
    * Duration of transition in milliseconds
    *
    * @default 300
    */
  var duration: js.UndefOr[Double] = js.undefined
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
  var enablePointerEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * Function called when the animation finished
    */
  var onAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional styling for the container
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object CollapsibleProps {
  @scala.inline
  def apply(
    align: top | center | bottom = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsedHeight: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easing: EasingMode | js.Any = null,
    enablePointerEvents: js.UndefOr[Boolean] = js.undefined,
    onAnimationEnd: () => Unit = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): CollapsibleProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsedHeight)) __obj.updateDynamic("collapsedHeight")(collapsedHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePointerEvents)) __obj.updateDynamic("enablePointerEvents")(enablePointerEvents.get.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction0(onAnimationEnd))
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsibleProps]
  }
}

