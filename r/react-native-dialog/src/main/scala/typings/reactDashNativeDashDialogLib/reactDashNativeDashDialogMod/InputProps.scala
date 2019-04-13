package typings
package reactDashNativeDashDialogLib.reactDashNativeDashDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputProps[T] extends js.Object {
  var label: js.UndefOr[java.lang.String] = js.undefined
  var textInputRef: js.UndefOr[reactLib.reactMod.Ref[T]] = js.undefined
  var wrapperStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object InputProps {
  @scala.inline
  def apply[T](
    label: java.lang.String = null,
    textInputRef: reactLib.reactMod.Ref[T] = null,
    wrapperStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null
  ): InputProps[T] = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (textInputRef != null) __obj.updateDynamic("textInputRef")(textInputRef.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProps[T]]
  }
}

