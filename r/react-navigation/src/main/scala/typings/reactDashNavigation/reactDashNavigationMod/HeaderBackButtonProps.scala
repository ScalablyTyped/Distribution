package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderBackButtonProps extends js.Object {
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var pressColorAndroid: js.UndefOr[String] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var truncatedTitle: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object HeaderBackButtonProps {
  @scala.inline
  def apply(
    onPress: () => Unit = null,
    pressColorAndroid: String = null,
    tintColor: String = null,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null,
    truncatedTitle: String = null,
    width: Int | Double = null
  ): HeaderBackButtonProps = {
    val __obj = js.Dynamic.literal()
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (pressColorAndroid != null) __obj.updateDynamic("pressColorAndroid")(pressColorAndroid)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (truncatedTitle != null) __obj.updateDynamic("truncatedTitle")(truncatedTitle)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderBackButtonProps]
  }
}

