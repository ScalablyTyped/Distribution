package typings.reactNative.mod

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
    anchor: js.UndefOr[Double] = js.undefined,
    cancelButtonIndex: js.UndefOr[Double] = js.undefined,
    destructiveButtonIndex: js.UndefOr[Double] = js.undefined,
    message: String = null,
    tintColor: String = null,
    title: String = null
  ): ActionSheetIOSOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (!js.isUndefined(anchor)) __obj.updateDynamic("anchor")(anchor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelButtonIndex)) __obj.updateDynamic("cancelButtonIndex")(cancelButtonIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destructiveButtonIndex)) __obj.updateDynamic("destructiveButtonIndex")(destructiveButtonIndex.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetIOSOptions]
  }
}

