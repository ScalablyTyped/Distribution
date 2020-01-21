package typings.reactNativeDatepicker.mod

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerCustomStylesProps extends js.Object {
  var btnCancel: js.UndefOr[StyleProp[_]] = js.undefined
  var btnConfirm: js.UndefOr[StyleProp[_]] = js.undefined
  var btnTextCancel: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var btnTextConfirm: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var dateIcon: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  var dateInput: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var datePicker: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var datePickerCon: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var dateText: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var dateTouchBody: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var disabled: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var placeholderText: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}

object DatePickerCustomStylesProps {
  @scala.inline
  def apply(
    btnCancel: StyleProp[_] = null,
    btnConfirm: StyleProp[_] = null,
    btnTextCancel: StyleProp[TextStyle] = null,
    btnTextConfirm: StyleProp[TextStyle] = null,
    dateIcon: StyleProp[ImageStyle] = null,
    dateInput: StyleProp[ViewStyle] = null,
    datePicker: StyleProp[ViewStyle] = null,
    datePickerCon: StyleProp[ViewStyle] = null,
    dateText: StyleProp[TextStyle] = null,
    dateTouchBody: StyleProp[ViewStyle] = null,
    disabled: StyleProp[ViewStyle] = null,
    placeholderText: StyleProp[TextStyle] = null
  ): DatePickerCustomStylesProps = {
    val __obj = js.Dynamic.literal()
    if (btnCancel != null) __obj.updateDynamic("btnCancel")(btnCancel.asInstanceOf[js.Any])
    if (btnConfirm != null) __obj.updateDynamic("btnConfirm")(btnConfirm.asInstanceOf[js.Any])
    if (btnTextCancel != null) __obj.updateDynamic("btnTextCancel")(btnTextCancel.asInstanceOf[js.Any])
    if (btnTextConfirm != null) __obj.updateDynamic("btnTextConfirm")(btnTextConfirm.asInstanceOf[js.Any])
    if (dateIcon != null) __obj.updateDynamic("dateIcon")(dateIcon.asInstanceOf[js.Any])
    if (dateInput != null) __obj.updateDynamic("dateInput")(dateInput.asInstanceOf[js.Any])
    if (datePicker != null) __obj.updateDynamic("datePicker")(datePicker.asInstanceOf[js.Any])
    if (datePickerCon != null) __obj.updateDynamic("datePickerCon")(datePickerCon.asInstanceOf[js.Any])
    if (dateText != null) __obj.updateDynamic("dateText")(dateText.asInstanceOf[js.Any])
    if (dateTouchBody != null) __obj.updateDynamic("dateTouchBody")(dateTouchBody.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (placeholderText != null) __obj.updateDynamic("placeholderText")(placeholderText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerCustomStylesProps]
  }
}

