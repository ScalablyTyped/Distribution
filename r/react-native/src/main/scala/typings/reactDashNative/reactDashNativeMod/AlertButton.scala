package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.cancel
import typings.reactDashNative.reactDashNativeStrings.default
import typings.reactDashNative.reactDashNativeStrings.destructive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertButton extends js.Object {
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[default | cancel | destructive] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AlertButton {
  @scala.inline
  def apply(onPress: () => Unit = null, style: default | cancel | destructive = null, text: String = null): AlertButton = {
    val __obj = js.Dynamic.literal()
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[AlertButton]
  }
}

