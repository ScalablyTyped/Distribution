package typings.reactDashNativeDashShare.buttonMod

import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.ImageSourcePropType
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextProps
import typings.reactDashNative.reactDashNativeMod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var buttonStyle: StyleProp[ViewProps]
  var children: ReactNode
  var iconSrc: ImageSourcePropType
  var textStyle: StyleProp[TextProps]
  def onPress(): Unit
}

object ButtonProps {
  @scala.inline
  def apply(
    iconSrc: ImageSourcePropType,
    onPress: () => Unit,
    buttonStyle: StyleProp[ViewProps] = null,
    children: ReactNode = null,
    textStyle: StyleProp[TextProps] = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal(iconSrc = iconSrc.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

