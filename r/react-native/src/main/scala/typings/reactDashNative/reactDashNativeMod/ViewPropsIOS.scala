package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewPropsIOS extends TVViewPropsIOS {
  /**
    * Provides an array of custom actions available for accessibility.
    * @platform ios
    */
  var accessibilityActions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A Boolean value indicating whether VoiceOver should ignore the elements within views that are siblings of the receiver.
    * @platform ios
    */
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  /**
    * When `accessible` is true, the system will try to invoke this function
    * when the user performs an accessibility custom action.
    * @platform ios
    */
  var onAccessibilityAction: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Whether this view should be rendered as a bitmap before compositing.
    *
    * On iOS, this is useful for animations and interactions that do not modify this component's dimensions nor its children;
    * for example, when translating the position of a static view, rasterization allows the renderer to reuse a cached bitmap of a static view
    * and quickly composite it during each frame.
    *
    * Rasterization incurs an off-screen drawing pass and the bitmap consumes memory.
    * Test and measure when using this property.
    */
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
}

object ViewPropsIOS {
  @scala.inline
  def apply(
    accessibilityActions: js.Array[String] = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    onAccessibilityAction: () => Unit = null,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null
  ): ViewPropsIOS = {
    val __obj = js.Dynamic.literal()
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions)
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal)
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus)
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable)
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction0(onAccessibilityAction))
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS)
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties)
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewPropsIOS]
  }
}

