package typings.reactNativeGestureHandler.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainedTouchableProperties extends js.Object {
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object ContainedTouchableProperties {
  @scala.inline
  def apply(containerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined): ContainedTouchableProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(containerStyle)) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainedTouchableProperties]
  }
}

