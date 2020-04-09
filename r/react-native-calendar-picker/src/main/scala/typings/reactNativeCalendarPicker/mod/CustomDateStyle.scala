package typings.reactNativeCalendarPicker.mod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDateStyle extends js.Object {
  var containerStyle: js.UndefOr[ViewStyle] = js.undefined
  var date: MomentParsable
  var style: js.UndefOr[ViewStyle] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}

object CustomDateStyle {
  @scala.inline
  def apply(
    date: MomentParsable,
    containerStyle: ViewStyle = null,
    style: ViewStyle = null,
    textStyle: TextStyle = null
  ): CustomDateStyle = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDateStyle]
  }
}

