package typings.reactNativeShare.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareSheetProps extends js.Object {
  var children: ReactNode
  var overlayStyle: js.UndefOr[StyleProp[ViewProps]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewProps]] = js.undefined
  var visible: Boolean
  def onCancel(): Unit
}

object ShareSheetProps {
  @scala.inline
  def apply(
    onCancel: () => Unit,
    visible: Boolean,
    children: ReactNode = null,
    overlayStyle: js.UndefOr[Null | StyleProp[ViewProps]] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewProps]] = js.undefined
  ): ShareSheetProps = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), visible = visible.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayStyle)) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareSheetProps]
  }
}

