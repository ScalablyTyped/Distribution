package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetIOSOptions extends js.Object {
  var anchor: js.UndefOr[Double] = js.undefined
  var cancelButtonIndex: js.UndefOr[Double] = js.undefined
  var destructiveButtonIndex: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var options: js.Array[String]
  var tintColor: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object ActionSheetIOSOptions {
  @scala.inline
  def apply(
    options: js.Array[String],
    anchor: Int | Double = null,
    cancelButtonIndex: Int | Double = null,
    destructiveButtonIndex: Int | Double = null,
    message: String = null,
    tintColor: String = null,
    title: String = null
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

