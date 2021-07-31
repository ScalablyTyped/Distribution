package typings.rcPicker

import typings.rcPicker.dateBodyMod.DateRender
import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.DisabledTime
import typings.rcPicker.interfaceMod.DisabledTimes
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.NullableDateType
import typings.rcPicker.interfaceMod.OnSelect
import typings.rcPicker.interfaceMod.PanelMode
import typings.rcPicker.interfaceMod.PanelRefProps
import typings.rcPicker.rcPickerStrings.key
import typings.rcPicker.rcPickerStrings.mouse
import typings.rcPicker.rcPickerStrings.submit
import typings.rcPicker.timePanelMod.SharedTimeProps
import typings.rcPicker.uiUtilMod.KeyboardConfig
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datetimePanelMod {
  
  @JSImport("rc-picker/es/panels/DatetimePanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](props: DatetimePanelProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined parent std.Omit<rc-picker.rc-picker/es/panels/DatePanel.DatePanelProps<DateType>, 'disabledHours' | 'disabledMinutes' | 'disabledSeconds'> */
  trait DatetimePanelProps[DateType] extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var dateRender: js.UndefOr[DateRender[DateType]] = js.undefined
    
    var defaultPickerValue: js.UndefOr[DateType] = js.undefined
    
    var defaultValue: js.UndefOr[DateType] = js.undefined
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
    
    var disabledTime: js.UndefOr[DisabledTime[DateType]] = js.undefined
    
    var generateConfig: GenerateConfig[DateType]
    
    var keyboardConfig: js.UndefOr[KeyboardConfig] = js.undefined
    
    var locale: Locale
    
    var nextIcon: js.UndefOr[ReactNode] = js.undefined
    
    var onPanelChange: js.Function2[/* mode */ PanelMode | Null, /* viewValue */ DateType, Unit]
    
    var onSelect: OnSelect[DateType]
    
    var onViewDateChange: js.Function1[/* value */ DateType, Unit]
    
    var operationRef: MutableRefObject[PanelRefProps]
    
    var panelName: js.UndefOr[String] = js.undefined
    
    var prefixCls: String
    
    var prefixColumn: js.UndefOr[js.Function1[/* date */ DateType, ReactNode]] = js.undefined
    
    var prevIcon: js.UndefOr[ReactNode] = js.undefined
    
    var rowClassName: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.undefined
    
    var showTime: js.UndefOr[Boolean | SharedTimeProps[DateType]] = js.undefined
    
    var superNextIcon: js.UndefOr[ReactNode] = js.undefined
    
    var superPrevIcon: js.UndefOr[ReactNode] = js.undefined
    
    var value: js.UndefOr[NullableDateType[DateType]] = js.undefined
    
    var viewDate: DateType
  }
  object DatetimePanelProps {
    
    @scala.inline
    def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      locale: Locale,
      onPanelChange: (/* mode */ PanelMode | Null, /* viewValue */ DateType) => Unit,
      onSelect: (DateType, /* type */ key | mouse | submit) => Unit,
      onViewDateChange: /* value */ DateType => Unit,
      operationRef: MutableRefObject[PanelRefProps],
      prefixCls: String,
      viewDate: DateType
    ): DatetimePanelProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onPanelChange = js.Any.fromFunction2(onPanelChange), onSelect = js.Any.fromFunction2(onSelect), onViewDateChange = js.Any.fromFunction1(onViewDateChange), operationRef = operationRef.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatetimePanelProps[DateType]]
    }
    
    @scala.inline
    implicit class DatetimePanelPropsMutableBuilder[Self <: DatetimePanelProps[?], DateType] (val x: Self & DatetimePanelProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setDateRender(value: (DateType, DateType) => ReactNode): Self = StObject.set(x, "dateRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDateRenderUndefined: Self = StObject.set(x, "dateRender", js.undefined)
      
      @scala.inline
      def setDefaultPickerValue(value: DateType): Self = StObject.set(x, "defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPickerValueUndefined: Self = StObject.set(x, "defaultPickerValue", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: DateType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setDisabledTime(value: /* date */ DateType | Null => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardConfig(value: KeyboardConfig): Self = StObject.set(x, "keyboardConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardConfigUndefined: Self = StObject.set(x, "keyboardConfig", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIcon(value: ReactNode): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      @scala.inline
      def setOnPanelChange(value: (/* mode */ PanelMode | Null, /* viewValue */ DateType) => Unit): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelect(value: (DateType, /* type */ key | mouse | submit) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnViewDateChange(value: /* value */ DateType => Unit): Self = StObject.set(x, "onViewDateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOperationRef(value: MutableRefObject[PanelRefProps]): Self = StObject.set(x, "operationRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelName(value: String): Self = StObject.set(x, "panelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelNameUndefined: Self = StObject.set(x, "panelName", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixColumn(value: /* date */ DateType => ReactNode): Self = StObject.set(x, "prefixColumn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixColumnUndefined: Self = StObject.set(x, "prefixColumn", js.undefined)
      
      @scala.inline
      def setPrevIcon(value: ReactNode): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      @scala.inline
      def setRowClassName(value: /* date */ DateType => String): Self = StObject.set(x, "rowClassName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowClassNameUndefined: Self = StObject.set(x, "rowClassName", js.undefined)
      
      @scala.inline
      def setShowTime(value: Boolean | SharedTimeProps[DateType]): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
      
      @scala.inline
      def setSuperNextIcon(value: ReactNode): Self = StObject.set(x, "superNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperNextIconUndefined: Self = StObject.set(x, "superNextIcon", js.undefined)
      
      @scala.inline
      def setSuperPrevIcon(value: ReactNode): Self = StObject.set(x, "superPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperPrevIconUndefined: Self = StObject.set(x, "superPrevIcon", js.undefined)
      
      @scala.inline
      def setValue(value: NullableDateType[DateType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
}
