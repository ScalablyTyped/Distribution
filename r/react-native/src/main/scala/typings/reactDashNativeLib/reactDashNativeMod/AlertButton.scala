package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertButton extends js.Object {
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.cancel | reactDashNativeLib.reactDashNativeLibStrings.destructive
  ] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object AlertButton {
  @scala.inline
  def apply(
    onPress: () => scala.Unit = null,
    style: reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.cancel | reactDashNativeLib.reactDashNativeLibStrings.destructive = null,
    text: java.lang.String = null
  ): AlertButton = {
    val __obj = js.Dynamic.literal()
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[AlertButton]
  }
}

