package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.AnonColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFieldStyle extends js.Object {
  var highlightColor: js.UndefOr[String] = js.undefined
  var textInputStyle: js.UndefOr[AnonColor] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
}

object TextFieldStyle {
  @scala.inline
  def apply(highlightColor: String = null, textInputStyle: AnonColor = null, tintColor: String = null): TextFieldStyle = {
    val __obj = js.Dynamic.literal()
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor.asInstanceOf[js.Any])
    if (textInputStyle != null) __obj.updateDynamic("textInputStyle")(textInputStyle.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldStyle]
  }
}

