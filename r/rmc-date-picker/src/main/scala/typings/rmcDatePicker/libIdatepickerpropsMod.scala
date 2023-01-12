package typings.rmcDatePicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIdatepickerpropsMod {
  
  trait IDatePickerProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var date: js.UndefOr[Any] = js.undefined
    
    var defaultDate: js.UndefOr[Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var formatDay: js.UndefOr[js.Function2[/* day */ Double, /* date */ js.UndefOr[Any], Any]] = js.undefined
    
    var formatMonth: js.UndefOr[js.Function2[/* month */ Double, /* date */ js.UndefOr[Any], Any]] = js.undefined
    
    var itemStyle: js.UndefOr[Any] = js.undefined
    
    var locale: js.UndefOr[Any] = js.undefined
    
    var maxDate: js.UndefOr[Any] = js.undefined
    
    var maxHour: js.UndefOr[Double] = js.undefined
    
    var maxMinute: js.UndefOr[Double] = js.undefined
    
    var minDate: js.UndefOr[Any] = js.undefined
    
    var minHour: js.UndefOr[Double] = js.undefined
    
    var minMinute: js.UndefOr[Double] = js.undefined
    
    var minuteStep: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[String] = js.undefined
    
    var onDateChange: js.UndefOr[js.Function1[/* date */ Any, Unit]] = js.undefined
    
    /** web only */
    var onScrollChange: js.UndefOr[js.Function3[/* date */ Any, /* vals */ Any, /* index */ Double, Unit]] = js.undefined
    
    var onValueChange: js.UndefOr[js.Function2[/* vals */ Any, /* index */ Double, Unit]] = js.undefined
    
    var pickerPrefixCls: js.UndefOr[String] = js.undefined
    
    /** web only */
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var rootNativeProps: js.UndefOr[js.Object] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
    
    var use12Hours: js.UndefOr[Boolean] = js.undefined
  }
  object IDatePickerProps {
    
    inline def apply(): IDatePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDatePickerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDatePickerProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDefaultDate(value: Any): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFormatDay(value: (/* day */ Double, /* date */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "formatDay", js.Any.fromFunction2(value))
      
      inline def setFormatDayUndefined: Self = StObject.set(x, "formatDay", js.undefined)
      
      inline def setFormatMonth(value: (/* month */ Double, /* date */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "formatMonth", js.Any.fromFunction2(value))
      
      inline def setFormatMonthUndefined: Self = StObject.set(x, "formatMonth", js.undefined)
      
      inline def setItemStyle(value: Any): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: Any): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMaxHour(value: Double): Self = StObject.set(x, "maxHour", value.asInstanceOf[js.Any])
      
      inline def setMaxHourUndefined: Self = StObject.set(x, "maxHour", js.undefined)
      
      inline def setMaxMinute(value: Double): Self = StObject.set(x, "maxMinute", value.asInstanceOf[js.Any])
      
      inline def setMaxMinuteUndefined: Self = StObject.set(x, "maxMinute", js.undefined)
      
      inline def setMinDate(value: Any): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinHour(value: Double): Self = StObject.set(x, "minHour", value.asInstanceOf[js.Any])
      
      inline def setMinHourUndefined: Self = StObject.set(x, "minHour", js.undefined)
      
      inline def setMinMinute(value: Double): Self = StObject.set(x, "minMinute", value.asInstanceOf[js.Any])
      
      inline def setMinMinuteUndefined: Self = StObject.set(x, "minMinute", js.undefined)
      
      inline def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      inline def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnDateChange(value: /* date */ Any => Unit): Self = StObject.set(x, "onDateChange", js.Any.fromFunction1(value))
      
      inline def setOnDateChangeUndefined: Self = StObject.set(x, "onDateChange", js.undefined)
      
      inline def setOnScrollChange(value: (/* date */ Any, /* vals */ Any, /* index */ Double) => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction3(value))
      
      inline def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      inline def setOnValueChange(value: (/* vals */ Any, /* index */ Double) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction2(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setPickerPrefixClsUndefined: Self = StObject.set(x, "pickerPrefixCls", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRootNativeProps(value: js.Object): Self = StObject.set(x, "rootNativeProps", value.asInstanceOf[js.Any])
      
      inline def setRootNativePropsUndefined: Self = StObject.set(x, "rootNativeProps", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
      
      inline def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
    }
  }
}
