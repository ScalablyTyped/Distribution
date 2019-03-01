package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderBackButtonProps extends js.Object {
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var pressColorAndroid: js.UndefOr[java.lang.String] = js.undefined
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var truncatedTitle: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object HeaderBackButtonProps {
  @scala.inline
  def apply(
    onPress: js.Function0[scala.Unit] = null,
    pressColorAndroid: java.lang.String = null,
    tintColor: java.lang.String = null,
    title: java.lang.String = null,
    titleStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    truncatedTitle: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): HeaderBackButtonProps = {
    val __obj = js.Dynamic.literal()
    if (onPress != null) __obj.updateDynamic("onPress")(onPress)
    if (pressColorAndroid != null) __obj.updateDynamic("pressColorAndroid")(pressColorAndroid)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (truncatedTitle != null) __obj.updateDynamic("truncatedTitle")(truncatedTitle)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderBackButtonProps]
  }
}

