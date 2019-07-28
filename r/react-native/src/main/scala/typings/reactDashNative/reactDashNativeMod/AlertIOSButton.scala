package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.cancel
import typings.reactDashNative.reactDashNativeStrings.default
import typings.reactDashNative.reactDashNativeStrings.destructive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertIOSButton extends js.Object {
  var onPress: js.UndefOr[js.Function1[/* message */ js.UndefOr[String], Unit]] = js.undefined
  var style: js.UndefOr[default | cancel | destructive] = js.undefined
  var text: String
}

object AlertIOSButton {
  @scala.inline
  def apply(
    text: String,
    onPress: /* message */ js.UndefOr[String] => Unit = null,
    style: default | cancel | destructive = null
  ): AlertIOSButton = {
    val __obj = js.Dynamic.literal(text = text)
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertIOSButton]
  }
}

