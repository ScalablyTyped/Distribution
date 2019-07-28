package typings.reactDashNativeDashDialog.reactDashNativeDashDialogMod

import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerProps extends js.Object {
  var blurComponentIOS: js.UndefOr[ReactNode] = js.undefined
  var buttonSeparatorStyle: js.UndefOr[ViewStyle] = js.undefined
  var children: js.Array[ReactNode]
  var contentStyle: js.UndefOr[ViewStyle] = js.undefined
  var footerStyle: js.UndefOr[ViewStyle] = js.undefined
  var headerStyle: js.UndefOr[ViewStyle] = js.undefined
  /**
    * default: false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ContainerProps {
  @scala.inline
  def apply(
    children: js.Array[ReactNode],
    blurComponentIOS: ReactNode = null,
    buttonSeparatorStyle: ViewStyle = null,
    contentStyle: ViewStyle = null,
    footerStyle: ViewStyle = null,
    headerStyle: ViewStyle = null,
    visible: js.UndefOr[Boolean] = js.undefined
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

