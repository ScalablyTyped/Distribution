package typings.reactNativeDatepicker.mod

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerCustomStylesProps extends js.Object {
  
  var btnCancel: js.UndefOr[StyleProp[_]] = js.native
  
  var btnConfirm: js.UndefOr[StyleProp[_]] = js.native
  
  var btnTextCancel: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var btnTextConfirm: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var dateIcon: js.UndefOr[StyleProp[ImageStyle]] = js.native
  
  var dateInput: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var datePicker: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var datePickerCon: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var dateText: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var dateTouchBody: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var disabled: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var placeholderText: js.UndefOr[StyleProp[TextStyle]] = js.native
}
object DatePickerCustomStylesProps {
  
  @scala.inline
  def apply(): DatePickerCustomStylesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerCustomStylesProps]
  }
  
  @scala.inline
  implicit class DatePickerCustomStylesPropsOps[Self <: DatePickerCustomStylesProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBtnCancel(value: StyleProp[_]): Self = this.set("btnCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBtnCancel: Self = this.set("btnCancel", js.undefined)
    
    @scala.inline
    def setBtnCancelNull: Self = this.set("btnCancel", null)
    
    @scala.inline
    def setBtnConfirm(value: StyleProp[_]): Self = this.set("btnConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBtnConfirm: Self = this.set("btnConfirm", js.undefined)
    
    @scala.inline
    def setBtnConfirmNull: Self = this.set("btnConfirm", null)
    
    @scala.inline
    def setBtnTextCancel(value: StyleProp[TextStyle]): Self = this.set("btnTextCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBtnTextCancel: Self = this.set("btnTextCancel", js.undefined)
    
    @scala.inline
    def setBtnTextCancelNull: Self = this.set("btnTextCancel", null)
    
    @scala.inline
    def setBtnTextConfirm(value: StyleProp[TextStyle]): Self = this.set("btnTextConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBtnTextConfirm: Self = this.set("btnTextConfirm", js.undefined)
    
    @scala.inline
    def setBtnTextConfirmNull: Self = this.set("btnTextConfirm", null)
    
    @scala.inline
    def setDateIcon(value: StyleProp[ImageStyle]): Self = this.set("dateIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateIcon: Self = this.set("dateIcon", js.undefined)
    
    @scala.inline
    def setDateIconNull: Self = this.set("dateIcon", null)
    
    @scala.inline
    def setDateInput(value: StyleProp[ViewStyle]): Self = this.set("dateInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateInput: Self = this.set("dateInput", js.undefined)
    
    @scala.inline
    def setDateInputNull: Self = this.set("dateInput", null)
    
    @scala.inline
    def setDatePicker(value: StyleProp[ViewStyle]): Self = this.set("datePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatePicker: Self = this.set("datePicker", js.undefined)
    
    @scala.inline
    def setDatePickerNull: Self = this.set("datePicker", null)
    
    @scala.inline
    def setDatePickerCon(value: StyleProp[ViewStyle]): Self = this.set("datePickerCon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatePickerCon: Self = this.set("datePickerCon", js.undefined)
    
    @scala.inline
    def setDatePickerConNull: Self = this.set("datePickerCon", null)
    
    @scala.inline
    def setDateText(value: StyleProp[TextStyle]): Self = this.set("dateText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateText: Self = this.set("dateText", js.undefined)
    
    @scala.inline
    def setDateTextNull: Self = this.set("dateText", null)
    
    @scala.inline
    def setDateTouchBody(value: StyleProp[ViewStyle]): Self = this.set("dateTouchBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTouchBody: Self = this.set("dateTouchBody", js.undefined)
    
    @scala.inline
    def setDateTouchBodyNull: Self = this.set("dateTouchBody", null)
    
    @scala.inline
    def setDisabled(value: StyleProp[ViewStyle]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisabledNull: Self = this.set("disabled", null)
    
    @scala.inline
    def setPlaceholderText(value: StyleProp[TextStyle]): Self = this.set("placeholderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderText: Self = this.set("placeholderText", js.undefined)
    
    @scala.inline
    def setPlaceholderTextNull: Self = this.set("placeholderText", null)
  }
}
