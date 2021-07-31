package typings.rcPicker

import typings.rcPicker.dateBodyMod.DateRender
import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Components
import typings.rcPicker.interfaceMod.DisabledTime
import typings.rcPicker.interfaceMod.DisabledTimes
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.OnPanelChange
import typings.rcPicker.interfaceMod.PanelMode
import typings.rcPicker.interfaceMod.PickerMode
import typings.rcPicker.monthBodyMod.MonthCellRender
import typings.rcPicker.rcPickerStrings.date
import typings.rcPicker.rcPickerStrings.ltr
import typings.rcPicker.rcPickerStrings.rtl
import typings.rcPicker.rcPickerStrings.time
import typings.rcPicker.timePanelMod.SharedTimeProps
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Exclude
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerPanelMod {
  
  @JSImport("rc-picker/es/PickerPanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](props: PickerPanelProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait PickerPanelBaseProps[DateType]
    extends StObject
       with PickerPanelSharedProps[DateType]
       with PickerPanelProps[DateType] {
    
    var picker: Exclude[PickerMode, date | time]
  }
  object PickerPanelBaseProps {
    
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): PickerPanelBaseProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerPanelBaseProps[DateType]]
    }
    
    @scala.inline
    implicit class PickerPanelBasePropsMutableBuilder[Self <: PickerPanelBaseProps[?], DateType] (val x: Self & PickerPanelBaseProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setPicker(value: Exclude[PickerMode, date | time]): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    }
  }
  
  trait PickerPanelDateProps[DateType]
    extends StObject
       with PickerPanelSharedProps[DateType]
       with PickerPanelProps[DateType] {
    
    var disabledTime: js.UndefOr[DisabledTime[DateType]] = js.undefined
    
    var picker: js.UndefOr[date] = js.undefined
    
    var showNow: js.UndefOr[Boolean] = js.undefined
    
    var showTime: js.UndefOr[Boolean | SharedTimeProps[DateType]] = js.undefined
    
    var showToday: js.UndefOr[Boolean] = js.undefined
  }
  object PickerPanelDateProps {
    
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): PickerPanelDateProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerPanelDateProps[DateType]]
    }
    
    @scala.inline
    implicit class PickerPanelDatePropsMutableBuilder[Self <: PickerPanelDateProps[?], DateType] (val x: Self & PickerPanelDateProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setDisabledTime(value: /* date */ DateType | Null => DisabledTimes): Self = StObject.set(x, "disabledTime", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
      
      @scala.inline
      def setPicker(value: date): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
      
      @scala.inline
      def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
      
      @scala.inline
      def setShowTime(value: Boolean | SharedTimeProps[DateType]): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
      
      @scala.inline
      def setShowToday(value: Boolean): Self = StObject.set(x, "showToday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTodayUndefined: Self = StObject.set(x, "showToday", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcPicker.pickerPanelMod.PickerPanelBaseProps[DateType]
    - typings.rcPicker.pickerPanelMod.PickerPanelDateProps[DateType]
    - typings.rcPicker.pickerPanelMod.PickerPanelTimeProps[DateType]
  */
  trait PickerPanelProps[DateType] extends StObject
  object PickerPanelProps {
    
    @scala.inline
    def PickerPanelBaseProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): typings.rcPicker.pickerPanelMod.PickerPanelBaseProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rcPicker.pickerPanelMod.PickerPanelBaseProps[DateType]]
    }
    
    @scala.inline
    def PickerPanelDateProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): typings.rcPicker.pickerPanelMod.PickerPanelDateProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rcPicker.pickerPanelMod.PickerPanelDateProps[DateType]]
    }
    
    @scala.inline
    def PickerPanelTimeProps[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): typings.rcPicker.pickerPanelMod.PickerPanelTimeProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = "time")
      __obj.asInstanceOf[typings.rcPicker.pickerPanelMod.PickerPanelTimeProps[DateType]]
    }
  }
  
  trait PickerPanelSharedProps[DateType] extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    /** @private Internal usage. Do not use in your production env */
    var components: js.UndefOr[Components] = js.undefined
    
    var dateRender: js.UndefOr[DateRender[DateType]] = js.undefined
    
    /** [Legacy] Set default display picker view date */
    var defaultPickerValue: js.UndefOr[DateType] = js.undefined
    
    var defaultValue: js.UndefOr[DateType] = js.undefined
    
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
    
    var generateConfig: GenerateConfig[DateType]
    
    /** @private This is internal usage. Do not use in your production env */
    var hideHeader: js.UndefOr[Boolean] = js.undefined
    
    var locale: Locale
    
    /** @deprecated Will be removed in next big version. Please use `mode` instead */
    var mode: js.UndefOr[PanelMode] = js.undefined
    
    var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onOk: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.undefined
    
    var onPanelChange: js.UndefOr[OnPanelChange[DateType]] = js.undefined
    
    /** @private This is internal usage. Do not use in your production env */
    var onPickerValueChange: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.undefined
    
    /** [Legacy] Set default display picker view date */
    var pickerValue: js.UndefOr[DateType] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, ReactNode]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[DateType | Null] = js.undefined
  }
  object PickerPanelSharedProps {
    
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): PickerPanelSharedProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerPanelSharedProps[DateType]]
    }
    
    @scala.inline
    implicit class PickerPanelSharedPropsMutableBuilder[Self <: PickerPanelSharedProps[?], DateType] (val x: Self & PickerPanelSharedProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
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
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideHeader(value: Boolean): Self = StObject.set(x, "hideHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideHeaderUndefined: Self = StObject.set(x, "hideHeader", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: PanelMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMonthCellRender(value: (DateType, /* locale */ Locale) => ReactNode): Self = StObject.set(x, "monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMonthCellRenderUndefined: Self = StObject.set(x, "monthCellRender", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ DateType => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* date */ DateType => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOnPanelChange(value: (DateType, /* mode */ PanelMode) => Unit): Self = StObject.set(x, "onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPanelChangeUndefined: Self = StObject.set(x, "onPanelChange", js.undefined)
      
      @scala.inline
      def setOnPickerValueChange(value: /* date */ DateType => Unit): Self = StObject.set(x, "onPickerValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPickerValueChangeUndefined: Self = StObject.set(x, "onPickerValueChange", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* value */ DateType => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPickerValue(value: DateType): Self = StObject.set(x, "pickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerValueUndefined: Self = StObject.set(x, "pickerValue", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRenderExtraFooter(value: /* mode */ PanelMode => ReactNode): Self = StObject.set(x, "renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderExtraFooterUndefined: Self = StObject.set(x, "renderExtraFooter", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rcPicker.timePanelMod.SharedTimeProps because var conflicts: defaultValue. Inlined format, showNow, showHour, showMinute, showSecond, use12Hours, hourStep, minuteStep, secondStep, hideDisabledOptions */ trait PickerPanelTimeProps[DateType]
    extends StObject
       with PickerPanelSharedProps[DateType]
       with PickerPanelProps[DateType]
       with DisabledTimes {
    
    var format: js.UndefOr[String] = js.undefined
    
    var hideDisabledOptions: js.UndefOr[Boolean] = js.undefined
    
    var hourStep: js.UndefOr[Double] = js.undefined
    
    var minuteStep: js.UndefOr[Double] = js.undefined
    
    var picker: time
    
    var secondStep: js.UndefOr[Double] = js.undefined
    
    var showHour: js.UndefOr[Boolean] = js.undefined
    
    var showMinute: js.UndefOr[Boolean] = js.undefined
    
    var showNow: js.UndefOr[Boolean] = js.undefined
    
    var showSecond: js.UndefOr[Boolean] = js.undefined
    
    var use12Hours: js.UndefOr[Boolean] = js.undefined
  }
  object PickerPanelTimeProps {
    
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): PickerPanelTimeProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = "time")
      __obj.asInstanceOf[PickerPanelTimeProps[DateType]]
    }
    
    @scala.inline
    implicit class PickerPanelTimePropsMutableBuilder[Self <: PickerPanelTimeProps[?], DateType] (val x: Self & PickerPanelTimeProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHideDisabledOptions(value: Boolean): Self = StObject.set(x, "hideDisabledOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideDisabledOptionsUndefined: Self = StObject.set(x, "hideDisabledOptions", js.undefined)
      
      @scala.inline
      def setHourStep(value: Double): Self = StObject.set(x, "hourStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourStepUndefined: Self = StObject.set(x, "hourStep", js.undefined)
      
      @scala.inline
      def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
      
      @scala.inline
      def setPicker(value: time): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondStep(value: Double): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
      
      @scala.inline
      def setShowHour(value: Boolean): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHourUndefined: Self = StObject.set(x, "showHour", js.undefined)
      
      @scala.inline
      def setShowMinute(value: Boolean): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMinuteUndefined: Self = StObject.set(x, "showMinute", js.undefined)
      
      @scala.inline
      def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
      
      @scala.inline
      def setShowSecond(value: Boolean): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSecondUndefined: Self = StObject.set(x, "showSecond", js.undefined)
      
      @scala.inline
      def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse12HoursUndefined: Self = StObject.set(x, "use12Hours", js.undefined)
    }
  }
}
