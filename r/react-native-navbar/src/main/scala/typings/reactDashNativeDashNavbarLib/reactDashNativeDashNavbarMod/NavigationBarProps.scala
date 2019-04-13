package typings
package reactDashNativeDashNavbarLib.reactDashNativeDashNavbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBarProps extends js.Object {
  var leftButton: js.UndefOr[NavigationBarButton | reactLib.reactMod.ReactElement[_] | scala.Null] = js.undefined
  var rightButton: js.UndefOr[NavigationBarButton | reactLib.reactMod.ReactElement[_] | scala.Null] = js.undefined
  var statusBar: js.UndefOr[StatusBar] = js.undefined
  var style: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[NavigationBarTitle | reactLib.reactMod.ReactElement[_] | scala.Null] = js.undefined
}

object NavigationBarProps {
  @scala.inline
  def apply(
    leftButton: NavigationBarButton | reactLib.reactMod.ReactElement[_] = null,
    rightButton: NavigationBarButton | reactLib.reactMod.ReactElement[_] = null,
    statusBar: StatusBar = null,
    style: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    tintColor: java.lang.String = null,
    title: NavigationBarTitle | reactLib.reactMod.ReactElement[_] = null
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

