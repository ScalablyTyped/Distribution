package typings.reactDashNativeDashNavbar.reactDashNativeDashNavbarMod

import typings.react.reactMod.ReactElement
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBarProps extends js.Object {
  var leftButton: js.UndefOr[NavigationBarButton | ReactElement | Null] = js.undefined
  var rightButton: js.UndefOr[NavigationBarButton | ReactElement | Null] = js.undefined
  var statusBar: js.UndefOr[StatusBar] = js.undefined
  var style: js.UndefOr[ViewStyle] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[NavigationBarTitle | ReactElement | Null] = js.undefined
}

object NavigationBarProps {
  @scala.inline
  def apply(
    leftButton: NavigationBarButton | ReactElement = null,
    rightButton: NavigationBarButton | ReactElement = null,
    statusBar: StatusBar = null,
    style: ViewStyle = null,
    tintColor: String = null,
    title: NavigationBarTitle | ReactElement = null
  ): NavigationBarProps = {
    val __obj = js.Dynamic.literal()
    if (leftButton != null) __obj.updateDynamic("leftButton")(leftButton.asInstanceOf[js.Any])
    if (rightButton != null) __obj.updateDynamic("rightButton")(rightButton.asInstanceOf[js.Any])
    if (statusBar != null) __obj.updateDynamic("statusBar")(statusBar)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarProps]
  }
}

