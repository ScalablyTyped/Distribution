package typings.reactDashNativeDashShare.overlayMod

import typings.reactDashNative.reactDashNativeMod.Animated.Value
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayState extends js.Object {
  var fadeAnim: Value
  var overlayStyle: StyleProp[ViewProps]
}

object OverlayState {
  @scala.inline
  def apply(fadeAnim: Value, overlayStyle: StyleProp[ViewProps] = null): OverlayState = {
    val __obj = js.Dynamic.literal(fadeAnim = fadeAnim.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayState]
  }
}

