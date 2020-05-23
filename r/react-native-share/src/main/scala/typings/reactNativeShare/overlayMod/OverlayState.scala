package typings.reactNativeShare.overlayMod

import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayState extends js.Object {
  var fadeAnim: Value
  var overlayStyle: StyleProp[ViewProps]
}

object OverlayState {
  @scala.inline
  def apply(fadeAnim: Value, overlayStyle: js.UndefOr[Null | StyleProp[ViewProps]] = js.undefined): OverlayState = {
    val __obj = js.Dynamic.literal(fadeAnim = fadeAnim.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayStyle)) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayState]
  }
}

