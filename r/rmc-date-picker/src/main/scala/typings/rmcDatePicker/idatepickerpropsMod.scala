package typings.rmcDatePicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idatepickerpropsMod {
  
  @js.native
  trait IDatePickerProps extends StObject {
    
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
    implicit class IDatePickerPropsMutableBuilder[Self <: IDatePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDate(value: js.Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDefaultDate(value: js.Any): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFormatDay(value: (/* day */ Double, /* date */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "formatDay", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatDayUndefined: Self = StObject.set(x, "formatDay", js.undefined)
      
      @scala.inline
      def setFormatMonth(value: (/* month */ Double, /* date */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "formatMonth", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatMonthUndefined: Self = StObject.set(x, "formatMonth", js.undefined)
      
      @scala.inline
      def setItemStyle(value: js.Any): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxDate(value: js.Any): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMaxHour(value: Double): Self = StObject.set(x, "maxHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHourUndefined: Self = StObject.set(x, "maxHour", js.undefined)
      
      @scala.inline
      def setMaxMinute(value: Double): Self = StObject.set(x, "maxMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMinuteUndefined: Self = StObject.set(x, "maxMinute", js.undefined)
      
      @scala.inline
      def setMinDate(value: js.Any): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setMinHour(value: Double): Self = StObject.set(x, "minHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHourUndefined: Self = StObject.set(x, "minHour", js.undefined)
      
      @scala.inline
      def setMinMinute(value: Double): Self = StObject.set(x, "minMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinMinuteUndefined: Self = StObject.set(x, "minMinute", js.undefined)
      
      @scala.inline
      def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnDateChange(value: /* date */ js.Any => Unit): Self = StObject.set(x, "onDateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDateChangeUndefined: Self = StObject.set(x, "onDateChange", js.undefined)
      
      @scala.inline
      def setOnScrollChange(value: (/* date */ js.Any, /* vals */ js.Any, /* index */ Double) => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: (/* vals */ js.Any, /* index */ Double) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerPrefixClsUndefined: Self = StObject.set(x, "pickerPrefixCls", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootNativeProps(value: js.Object): Self = StObject.set(x, "rootNativeProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNativePropsUndefined: Self = StObject.set(x, "rootNativeProps", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
    }
  }
}
