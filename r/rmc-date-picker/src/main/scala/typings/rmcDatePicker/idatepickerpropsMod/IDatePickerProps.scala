package typings.rmcDatePicker.idatepickerpropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatePickerProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var date: js.UndefOr[js.Any] = js.native
  
  var defaultDate: js.UndefOr[js.Any] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var formatDay: js.UndefOr[js.Function2[/* day */ Double, /* date */ js.UndefOr[js.Any], _]] = js.native
  
  var formatMonth: js.UndefOr[js.Function2[/* month */ Double, /* date */ js.UndefOr[js.Any], _]] = js.native
  
  var itemStyle: js.UndefOr[js.Any] = js.native
  
  var locale: js.UndefOr[js.Any] = js.native
  
  var maxDate: js.UndefOr[js.Any] = js.native
  
  var maxHour: js.UndefOr[Double] = js.native
  
  var maxMinute: js.UndefOr[Double] = js.native
  
  var minDate: js.UndefOr[js.Any] = js.native
  
  var minHour: js.UndefOr[Double] = js.native
  
  var minMinute: js.UndefOr[Double] = js.native
  
  var minuteStep: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var onDateChange: js.UndefOr[js.Function1[/* date */ js.Any, Unit]] = js.native
  
  /** web only */
  var onScrollChange: js.UndefOr[js.Function3[/* date */ js.Any, /* vals */ js.Any, /* index */ Double, Unit]] = js.native
  
  var onValueChange: js.UndefOr[js.Function2[/* vals */ js.Any, /* index */ Double, Unit]] = js.native
  
  var pickerPrefixCls: js.UndefOr[String] = js.native
  
  /** web only */
  var prefixCls: js.UndefOr[String] = js.native
  
  var rootNativeProps: js.UndefOr[js.Object] = js.native
  
  var style: js.UndefOr[js.Any] = js.native
  
  var use12Hours: js.UndefOr[Boolean] = js.native
}
object IDatePickerProps {
  
  @scala.inline
  def apply(): IDatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePickerProps]
  }
  
  @scala.inline
  implicit class IDatePickerPropsOps[Self <: IDatePickerProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDate(value: js.Any): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDefaultDate(value: js.Any): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDate: Self = this.set("defaultDate", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFormatDay(value: (/* day */ Double, /* date */ js.UndefOr[js.Any]) => _): Self = this.set("formatDay", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFormatDay: Self = this.set("formatDay", js.undefined)
    
    @scala.inline
    def setFormatMonth(value: (/* month */ Double, /* date */ js.UndefOr[js.Any]) => _): Self = this.set("formatMonth", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFormatMonth: Self = this.set("formatMonth", js.undefined)
    
    @scala.inline
    def setItemStyle(value: js.Any): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: js.Any): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMaxHour(value: Double): Self = this.set("maxHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHour: Self = this.set("maxHour", js.undefined)
    
    @scala.inline
    def setMaxMinute(value: Double): Self = this.set("maxMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxMinute: Self = this.set("maxMinute", js.undefined)
    
    @scala.inline
    def setMinDate(value: js.Any): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMinHour(value: Double): Self = this.set("minHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHour: Self = this.set("minHour", js.undefined)
    
    @scala.inline
    def setMinMinute(value: Double): Self = this.set("minMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinMinute: Self = this.set("minMinute", js.undefined)
    
    @scala.inline
    def setMinuteStep(value: Double): Self = this.set("minuteStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteStep: Self = this.set("minuteStep", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOnDateChange(value: /* date */ js.Any => Unit): Self = this.set("onDateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDateChange: Self = this.set("onDateChange", js.undefined)
    
    @scala.inline
    def setOnScrollChange(value: (/* date */ js.Any, /* vals */ js.Any, /* index */ Double) => Unit): Self = this.set("onScrollChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnScrollChange: Self = this.set("onScrollChange", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: (/* vals */ js.Any, /* index */ Double) => Unit): Self = this.set("onValueChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    
    @scala.inline
    def setPickerPrefixCls(value: String): Self = this.set("pickerPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerPrefixCls: Self = this.set("pickerPrefixCls", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setRootNativeProps(value: js.Object): Self = this.set("rootNativeProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootNativeProps: Self = this.set("rootNativeProps", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUse12Hours(value: Boolean): Self = this.set("use12Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUse12Hours: Self = this.set("use12Hours", js.undefined)
  }
}
