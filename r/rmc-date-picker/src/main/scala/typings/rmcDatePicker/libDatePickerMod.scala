package typings.rmcDatePicker

import typings.react.mod.Component
import typings.rmcDatePicker.anon.Am
import typings.rmcDatePicker.anon.Cols
import typings.rmcDatePicker.anon.Date
import typings.rmcDatePicker.anon.Key
import typings.rmcDatePicker.anon.Value
import typings.rmcDatePicker.libIdatepickerpropsMod.IDatePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatePickerMod {
  
  @JSImport("rmc-date-picker/lib/DatePicker", JSImport.Default)
  @js.native
  open class default () extends DatePicker
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rmc-date-picker/lib/DatePicker", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rmc-date-picker/lib/DatePicker", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-date-picker/lib/DatePicker", "default.defaultProps.locale")
      @js.native
      def locale: Am = js.native
      inline def locale_=(x: Am): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-date-picker/lib/DatePicker", "default.defaultProps.minuteStep")
      @js.native
      def minuteStep: Double = js.native
      inline def minuteStep_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minuteStep")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-date-picker/lib/DatePicker", "default.defaultProps.mode")
      @js.native
      def mode: String = js.native
      inline def mode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
      
      inline def onDateChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDateChange")().asInstanceOf[Unit]
      
      @JSImport("rmc-date-picker/lib/DatePicker", "default.defaultProps.pickerPrefixCls")
      @js.native
      def pickerPrefixCls: String = js.native
      inline def pickerPrefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pickerPrefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-date-picker/lib/DatePicker", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-date-picker/lib/DatePicker", "default.defaultProps.use12Hours")
      @js.native
      def use12Hours: Boolean = js.native
      inline def use12Hours_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("use12Hours")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DatePicker extends Component[IDatePickerProps, Any, Any] {
    
    def clipDate(date: Any): Any = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MDatePicker(nextProps: Any): Unit = js.native
    
    var defaultMaxDate: Any = js.native
    
    var defaultMinDate: Any = js.native
    
    def getDate(): Any = js.native
    
    def getDateData(): js.Array[Key] = js.native
    
    def getDefaultMaxDate(): Any = js.native
    
    def getDefaultMinDate(): Any = js.native
    
    def getDisplayHour(rawHour: Any): Any = js.native
    
    def getMaxDate(): Any = js.native
    
    def getMaxDay(): Any = js.native
    
    def getMaxHour(): Any = js.native
    
    def getMaxMinute(): Any = js.native
    
    def getMaxMonth(): Any = js.native
    
    def getMaxYear(): Any = js.native
    
    def getMinDate(): Any = js.native
    
    def getMinDay(): Any = js.native
    
    def getMinHour(): Any = js.native
    
    def getMinMinute(): Any = js.native
    
    def getMinMonth(): Any = js.native
    
    def getMinYear(): Any = js.native
    
    def getNewDate(values: Any, index: Any): Any = js.native
    
    def getTimeData(date: Any): Cols = js.native
    
    def getValue(): Any = js.native
    
    def getValueCols(): Value = js.native
    
    def onScrollChange(values: Any, index: Any): Unit = js.native
    
    def onValueChange(values: Any, index: Any): Unit = js.native
    
    def setAmPm(date: Any, index: Any): Unit = js.native
    
    def setHours(date: Any, hour: Any): Unit = js.native
    
    @JSName("state")
    var state_DatePicker: Date = js.native
  }
}
