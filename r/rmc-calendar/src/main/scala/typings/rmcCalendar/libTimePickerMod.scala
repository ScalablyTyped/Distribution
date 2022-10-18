package typings.rmcCalendar

import typings.react.mod.PureComponent
import typings.rmcCalendar.libDateDataTypesMod.Models.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTimePickerMod {
  
  @JSImport("rmc-calendar/lib/TimePicker", JSImport.Default)
  @js.native
  open class default () extends TimePicker
  /* static members */
  object default {
    
    @JSImport("rmc-calendar/lib/TimePicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-calendar/lib/TimePicker", "default.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    inline def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait PropsType extends StObject {
    
    var clientHeight: js.UndefOr[Double] = js.undefined
    
    var defaultValue: js.UndefOr[js.Date] = js.undefined
    
    var locale: Locale
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var onValueChange: js.UndefOr[js.Function1[/* time */ js.Date, Unit]] = js.undefined
    
    var pickerPrefixCls: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[js.Date] = js.undefined
  }
  object PropsType {
    
    inline def apply(locale: Locale): PropsType = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    extension [Self <: PropsType](x: Self) {
      
      inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      inline def setClientHeightUndefined: Self = StObject.set(x, "clientHeight", js.undefined)
      
      inline def setDefaultValue(value: js.Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setOnValueChange(value: /* time */ js.Date => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setPickerPrefixClsUndefined: Self = StObject.set(x, "pickerPrefixCls", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait StateType extends StObject
  
  @js.native
  trait TimePicker extends PureComponent[PropsType, StateType, Any] {
    
    def getMaxTime(): js.UndefOr[js.Date] = js.native
    def getMaxTime(date: js.Date): js.UndefOr[js.Date] = js.native
    
    def getMinTime(): js.UndefOr[js.Date] = js.native
    def getMinTime(date: js.Date): js.UndefOr[js.Date] = js.native
    
    def onDateChange(date: js.Date): Unit = js.native
  }
}
