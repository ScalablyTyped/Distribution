package typings
package reactDashNativeDashDialogLib.reactDashNativeDashDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerProps extends js.Object {
  var blurComponentIOS: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var buttonSeparatorStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var children: js.Array[reactLib.reactMod.ReactNs.ReactNode]
  var contentStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var footerStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var headerStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  /**
    * default: false
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ContainerProps {
  @scala.inline
  def apply(
    children: js.Array[reactLib.reactMod.ReactNs.ReactNode],
    blurComponentIOS: reactLib.reactMod.ReactNs.ReactNode = null,
    buttonSeparatorStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    contentStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    footerStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    headerStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ContainerProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (blurComponentIOS != null) __obj.updateDynamic("blurComponentIOS")(blurComponentIOS.asInstanceOf[js.Any])
    if (buttonSeparatorStyle != null) __obj.updateDynamic("buttonSeparatorStyle")(buttonSeparatorStyle)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (footerStyle != null) __obj.updateDynamic("footerStyle")(footerStyle)
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ContainerProps]
  }
}

