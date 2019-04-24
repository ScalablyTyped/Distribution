package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetIOSOptions extends js.Object {
  var anchor: js.UndefOr[scala.Double] = js.undefined
  var cancelButtonIndex: js.UndefOr[scala.Double] = js.undefined
  var destructiveButtonIndex: js.UndefOr[scala.Double] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var options: js.Array[java.lang.String]
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ActionSheetIOSOptions {
  @scala.inline
  def apply(
    options: js.Array[java.lang.String],
    anchor: scala.Int | scala.Double = null,
    cancelButtonIndex: scala.Int | scala.Double = null,
    destructiveButtonIndex: scala.Int | scala.Double = null,
    message: java.lang.String = null,
    tintColor: java.lang.String = null,
    title: java.lang.String = null
  ): ActionSheetIOSOptions = {
    val __obj = js.Dynamic.literal(options = options)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (cancelButtonIndex != null) __obj.updateDynamic("cancelButtonIndex")(cancelButtonIndex.asInstanceOf[js.Any])
    if (destructiveButtonIndex != null) __obj.updateDynamic("destructiveButtonIndex")(destructiveButtonIndex.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ActionSheetIOSOptions]
  }
}

