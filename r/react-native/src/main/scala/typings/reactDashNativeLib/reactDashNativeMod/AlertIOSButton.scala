package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertIOSButton extends js.Object {
  var onPress: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.cancel | reactDashNativeLib.reactDashNativeLibStrings.destructive
  ] = js.undefined
  var text: java.lang.String
}

object AlertIOSButton {
  @scala.inline
  def apply(
    text: java.lang.String,
    onPress: /* message */ js.UndefOr[java.lang.String] => scala.Unit = null,
    style: reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.cancel | reactDashNativeLib.reactDashNativeLibStrings.destructive = null
  ): AlertIOSButton = {
    val __obj = js.Dynamic.literal(text = text)
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertIOSButton]
  }
}

