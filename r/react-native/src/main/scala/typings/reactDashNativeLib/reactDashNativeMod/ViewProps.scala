package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ViewProps
  extends AccessibilityProps
     with ViewPropsAndroid
     with ViewPropsIOS
     with GestureResponderHandlers
     with Touchable {
  /**
       * This defines how far a touch event can start away from the view.
       * Typical interface guidelines recommend touch targets that are at least
       * 30 - 40 points/density-independent pixels. If a Touchable view has
       * a height of 20 the touchable height can be extended to 40 with
       * hitSlop={{top: 10, bottom: 10, left: 0, right: 0}}
       * NOTE The touch area never extends past the parent view bounds and
       * the Z-index of sibling views always takes precedence if a touch
       * hits two overlapping views.
       */
  var hitSlop: js.UndefOr[Insets] = js.undefined
  /**
       * Used to reference react managed views from native code.
       */
  var nativeID: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Invoked on mount and layout changes with
       *
       * {nativeEvent: { layout: {x, y, width, height}}}.
       */
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, scala.Unit]] = js.undefined
  /**
       *
       * In the absence of auto property, none is much like CSS's none value. box-none is as if you had applied the CSS class:
       *
       * .box-none {
       *   pointer-events: none;
       * }
       * .box-none * {
       *   pointer-events: all;
       * }
       *
       * box-only is the equivalent of
       *
       * .box-only {
       *   pointer-events: all;
       * }
       * .box-only * {
       *   pointer-events: none;
       * }
       *
       * But since pointerEvents does not affect layout/appearance, and we are already deviating from the spec by adding additional modes,
       * we opt to not include pointerEvents on style. On some platforms, we would need to implement it as a className anyways. Using style or not is an implementation detail of the platform.
       */
  var pointerEvents: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.`box-none` | reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.`box-only` | reactDashNativeLib.reactDashNativeLibStrings.auto
  ] = js.undefined
  /**
       *
       * This is a special performance property exposed by RCTView and is useful for scrolling content when there are many subviews,
       * most of which are offscreen. For this property to be effective, it must be applied to a view that contains many subviews that extend outside its bound.
       * The subviews must also have overflow: hidden, as should the containing view (or one of its superviews).
       */
  var removeClippedSubviews: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
       * Used to locate this view in end-to-end tests.
       */
  var testID: js.UndefOr[java.lang.String] = js.undefined
}

