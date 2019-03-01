package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewPropsIOS extends js.Object {
  /**
    * Provides an array of custom actions available for accessibility.
    * @platform ios
    */
  var accessibilityActions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A Boolean value indicating whether VoiceOver should ignore the elements within views that are siblings of the receiver.
    * @platform ios
    */
  var accessibilityViewIsModal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When `accessible` is true, the system will try to invoke this function
    * when the user performs an accessibility custom action.
    * @platform ios
    */
  var onAccessibilityAction: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
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
  var shouldRasterizeIOS: js.UndefOr[scala.Boolean] = js.undefined
}

object ViewPropsIOS {
  @scala.inline
  def apply(
    accessibilityActions: js.Array[java.lang.String] = null,
    accessibilityViewIsModal: js.UndefOr[scala.Boolean] = js.undefined,
    onAccessibilityAction: js.Function0[scala.Unit] = null,
    shouldRasterizeIOS: js.UndefOr[scala.Boolean] = js.undefined
  ): ViewPropsIOS = {
    val __obj = js.Dynamic.literal()
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions)
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal)
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(onAccessibilityAction)
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS)
    __obj.asInstanceOf[ViewPropsIOS]
  }
}

