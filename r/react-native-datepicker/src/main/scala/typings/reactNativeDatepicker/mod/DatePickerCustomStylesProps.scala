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
    btnCancel: js.UndefOr[Null | StyleProp[_]] = js.undefined,
    btnConfirm: js.UndefOr[Null | StyleProp[_]] = js.undefined,
    btnTextCancel: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    btnTextConfirm: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    dateIcon: js.UndefOr[Null | StyleProp[ImageStyle]] = js.undefined,
    dateInput: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    datePicker: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    datePickerCon: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    dateText: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    dateTouchBody: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    disabled: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    placeholderText: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined
  ): DatePickerCustomStylesProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(btnCancel)) __obj.updateDynamic("btnCancel")(btnCancel.asInstanceOf[js.Any])
    if (!js.isUndefined(btnConfirm)) __obj.updateDynamic("btnConfirm")(btnConfirm.asInstanceOf[js.Any])
    if (!js.isUndefined(btnTextCancel)) __obj.updateDynamic("btnTextCancel")(btnTextCancel.asInstanceOf[js.Any])
    if (!js.isUndefined(btnTextConfirm)) __obj.updateDynamic("btnTextConfirm")(btnTextConfirm.asInstanceOf[js.Any])
    if (!js.isUndefined(dateIcon)) __obj.updateDynamic("dateIcon")(dateIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(dateInput)) __obj.updateDynamic("dateInput")(dateInput.asInstanceOf[js.Any])
    if (!js.isUndefined(datePicker)) __obj.updateDynamic("datePicker")(datePicker.asInstanceOf[js.Any])
    if (!js.isUndefined(datePickerCon)) __obj.updateDynamic("datePickerCon")(datePickerCon.asInstanceOf[js.Any])
    if (!js.isUndefined(dateText)) __obj.updateDynamic("dateText")(dateText.asInstanceOf[js.Any])
    if (!js.isUndefined(dateTouchBody)) __obj.updateDynamic("dateTouchBody")(dateTouchBody.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(placeholderText)) __obj.updateDynamic("placeholderText")(placeholderText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerCustomStylesProps]
  }
}

