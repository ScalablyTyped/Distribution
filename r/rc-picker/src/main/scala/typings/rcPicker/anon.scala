package typings.rcPicker

import typings.rcPicker.esInterfaceMod.CustomFormat
import typings.rcPicker.esInterfaceMod.Locale
import typings.rcPicker.esInterfaceMod.NullableDateType
import typings.rcPicker.esInterfaceMod.PanelMode
import typings.rcPicker.esInterfaceMod.PickerMode
import typings.rcPicker.esInterfaceMod.RangeValue
import typings.rcPicker.rcPickerStrings.time
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.MutableRefObject
import typings.std.EventTarget
import typings.std.HTMLInputElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BlurToCancel extends StObject {
    
    var blurToCancel: js.UndefOr[Boolean] = js.native
    
    var currentFocusedKey: js.UndefOr[MutableRefObject[String]] = js.native
    
    def forwardKeyDown(e: KeyboardEvent[HTMLInputElement]): Boolean = js.native
    
    def isClickOutside(): Boolean = js.native
    def isClickOutside(clickElement: EventTarget): Boolean = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    def onCancel(): Unit = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    def onKeyDown(e: KeyboardEvent[HTMLInputElement], preventDefault: js.Function0[Unit]): Unit = js.native
    
    def onSubmit(): Unit | Boolean = js.native
    
    var open: Boolean = js.native
    
    def triggerOpen(open: Boolean): Unit = js.native
    
    var value: String = js.native
  }
  
  trait CellDate[DateType] extends StObject {
    
    var cellDate: DateType
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
    
    var generateConfig: typings.rcPicker.esGenerateMod.GenerateConfig[DateType]
    
    var mode: Omit[PanelMode, time]
  }
  object CellDate {
    
    inline def apply[DateType](
      cellDate: DateType,
      generateConfig: typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
      mode: Omit[PanelMode, time]
    ): CellDate[DateType] = {
      val __obj = js.Dynamic.literal(cellDate = cellDate.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellDate[DateType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellDate[?], DateType] (val x: Self & CellDate[DateType]) extends AnyVal {
      
      inline def setCellDate(value: DateType): Self = StObject.set(x, "cellDate", value.asInstanceOf[js.Any])
      
      inline def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      inline def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      inline def setGenerateConfig(value: typings.rcPicker.esGenerateMod.GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Omit[PanelMode, time]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait CellPrefixCls[DateType] extends StObject {
    
    var cellPrefixCls: String
    
    var generateConfig: typings.rcPicker.esGenerateMod.GenerateConfig[DateType]
    
    var hoverRangedValue: js.UndefOr[RangeValue[DateType]] = js.undefined
    
    def isInView(date: DateType): Boolean
    
    def isSameCell(current: NullableDateType[DateType], target: NullableDateType[DateType]): Boolean
    
    def offsetCell(date: DateType, offset: Double): DateType
    
    var rangedValue: js.UndefOr[RangeValue[DateType]] = js.undefined
    
    var today: js.UndefOr[NullableDateType[DateType]] = js.undefined
    
    var value: js.UndefOr[NullableDateType[DateType]] = js.undefined
  }
  object CellPrefixCls {
    
    inline def apply[DateType](
      cellPrefixCls: String,
      generateConfig: typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
      isInView: DateType => Boolean,
      isSameCell: (NullableDateType[DateType], NullableDateType[DateType]) => Boolean,
      offsetCell: (DateType, Double) => DateType
    ): CellPrefixCls[DateType] = {
      val __obj = js.Dynamic.literal(cellPrefixCls = cellPrefixCls.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], isInView = js.Any.fromFunction1(isInView), isSameCell = js.Any.fromFunction2(isSameCell), offsetCell = js.Any.fromFunction2(offsetCell))
      __obj.asInstanceOf[CellPrefixCls[DateType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellPrefixCls[?], DateType] (val x: Self & CellPrefixCls[DateType]) extends AnyVal {
      
      inline def setCellPrefixCls(value: String): Self = StObject.set(x, "cellPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setGenerateConfig(value: typings.rcPicker.esGenerateMod.GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setHoverRangedValue(value: RangeValue[DateType]): Self = StObject.set(x, "hoverRangedValue", value.asInstanceOf[js.Any])
      
      inline def setHoverRangedValueNull: Self = StObject.set(x, "hoverRangedValue", null)
      
      inline def setHoverRangedValueUndefined: Self = StObject.set(x, "hoverRangedValue", js.undefined)
      
      inline def setIsInView(value: DateType => Boolean): Self = StObject.set(x, "isInView", js.Any.fromFunction1(value))
      
      inline def setIsSameCell(value: (NullableDateType[DateType], NullableDateType[DateType]) => Boolean): Self = StObject.set(x, "isSameCell", js.Any.fromFunction2(value))
      
      inline def setOffsetCell(value: (DateType, Double) => DateType): Self = StObject.set(x, "offsetCell", js.Any.fromFunction2(value))
      
      inline def setRangedValue(value: RangeValue[DateType]): Self = StObject.set(x, "rangedValue", value.asInstanceOf[js.Any])
      
      inline def setRangedValueNull: Self = StObject.set(x, "rangedValue", null)
      
      inline def setRangedValueUndefined: Self = StObject.set(x, "rangedValue", js.undefined)
      
      inline def setToday(value: NullableDateType[DateType]): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      inline def setTodayNull: Self = StObject.set(x, "today", null)
      
      inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      inline def setValue(value: NullableDateType[DateType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait DefaultDates[DateType] extends StObject {
    
    var defaultDates: js.UndefOr[RangeValue[DateType]] = js.undefined
    
    var generateConfig: typings.rcPicker.esGenerateMod.GenerateConfig[DateType]
    
    var picker: PickerMode
    
    var values: RangeValue[DateType]
  }
  object DefaultDates {
    
    inline def apply[DateType](generateConfig: typings.rcPicker.esGenerateMod.GenerateConfig[DateType], picker: PickerMode): DefaultDates[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any], values = null)
      __obj.asInstanceOf[DefaultDates[DateType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultDates[?], DateType] (val x: Self & DefaultDates[DateType]) extends AnyVal {
      
      inline def setDefaultDates(value: RangeValue[DateType]): Self = StObject.set(x, "defaultDates", value.asInstanceOf[js.Any])
      
      inline def setDefaultDatesNull: Self = StObject.set(x, "defaultDates", null)
      
      inline def setDefaultDatesUndefined: Self = StObject.set(x, "defaultDates", js.undefined)
      
      inline def setGenerateConfig(value: typings.rcPicker.esGenerateMod.GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setPicker(value: PickerMode): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      inline def setValues(value: RangeValue[DateType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesNull: Self = StObject.set(x, "values", null)
    }
  }
  
  trait Disabled[DateType] extends StObject {
    
    var disabled: js.Tuple2[Boolean, Boolean]
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
    
    var generateConfig: typings.rcPicker.esGenerateMod.GenerateConfig[DateType]
    
    var locale: Locale
    
    var picker: PickerMode
    
    var selectedValue: RangeValue[DateType]
  }
  object Disabled {
    
    inline def apply[DateType](
      disabled: js.Tuple2[Boolean, Boolean],
      generateConfig: typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
      locale: Locale,
      picker: PickerMode
    ): Disabled[DateType] = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any], selectedValue = null)
      __obj.asInstanceOf[Disabled[DateType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Disabled[?], DateType] (val x: Self & Disabled[DateType]) extends AnyVal {
      
      inline def setDisabled(value: js.Tuple2[Boolean, Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      inline def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      inline def setGenerateConfig(value: typings.rcPicker.esGenerateMod.GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setPicker(value: PickerMode): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      inline def setSelectedValue(value: RangeValue[DateType]): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      inline def setSelectedValueNull: Self = StObject.set(x, "selectedValue", null)
    }
  }
  
  trait Focused extends StObject {
    
    var focused: Boolean
    
    var typing: Boolean
  }
  object Focused {
    
    inline def apply(focused: Boolean, typing: Boolean): Focused = {
      val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Focused]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Focused] (val x: Self) extends AnyVal {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setTyping(value: Boolean): Self = StObject.set(x, "typing", value.asInstanceOf[js.Any])
    }
  }
  
  trait Format[DateType] extends StObject {
    
    def format(locale: String, date: DateType, format: String): String
    
    /** A proxy for getting locale with moment or other locale library */
    var getShortMonths: js.UndefOr[js.Function1[/* locale */ String, js.Array[String]]] = js.undefined
    
    /** A proxy for getting locale with moment or other locale library */
    var getShortWeekDays: js.UndefOr[js.Function1[/* locale */ String, js.Array[String]]] = js.undefined
    
    def getWeek(locale: String, value: DateType): Double
    
    def getWeekFirstDate(locale: String, value: DateType): DateType
    
    def getWeekFirstDay(locale: String): Double
    
    /** Should only return validate date instance */
    def parse(locale: String, text: String, formats: js.Array[String]): DateType | Null
  }
  object Format {
    
    inline def apply[DateType](
      format: (String, DateType, String) => String,
      getWeek: (String, DateType) => Double,
      getWeekFirstDate: (String, DateType) => DateType,
      getWeekFirstDay: String => Double,
      parse: (String, String, js.Array[String]) => DateType | Null
    ): Format[DateType] = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction3(format), getWeek = js.Any.fromFunction2(getWeek), getWeekFirstDate = js.Any.fromFunction2(getWeekFirstDate), getWeekFirstDay = js.Any.fromFunction1(getWeekFirstDay), parse = js.Any.fromFunction3(parse))
      __obj.asInstanceOf[Format[DateType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Format[?], DateType] (val x: Self & Format[DateType]) extends AnyVal {
      
      inline def setFormat(value: (String, DateType, String) => String): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
      
      inline def setGetShortMonths(value: /* locale */ String => js.Array[String]): Self = StObject.set(x, "getShortMonths", js.Any.fromFunction1(value))
      
      inline def setGetShortMonthsUndefined: Self = StObject.set(x, "getShortMonths", js.undefined)
      
      inline def setGetShortWeekDays(value: /* locale */ String => js.Array[String]): Self = StObject.set(x, "getShortWeekDays", js.Any.fromFunction1(value))
      
      inline def setGetShortWeekDaysUndefined: Self = StObject.set(x, "getShortWeekDays", js.undefined)
      
      inline def setGetWeek(value: (String, DateType) => Double): Self = StObject.set(x, "getWeek", js.Any.fromFunction2(value))
      
      inline def setGetWeekFirstDate(value: (String, DateType) => DateType): Self = StObject.set(x, "getWeekFirstDate", js.Any.fromFunction2(value))
      
      inline def setGetWeekFirstDay(value: String => Double): Self = StObject.set(x, "getWeekFirstDay", js.Any.fromFunction1(value))
      
      inline def setParse(value: (String, String, js.Array[String]) => DateType | Null): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
    }
  }
  
  trait FormatList[DateType] extends StObject {
    
    var formatList: js.Array[String | CustomFormat[DateType]]
    
    var generateConfig: typings.rcPicker.esGenerateMod.GenerateConfig[DateType]
    
    var locale: Locale
  }
  object FormatList {
    
    inline def apply[DateType](
      formatList: js.Array[String | CustomFormat[DateType]],
      generateConfig: typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
      locale: Locale
    ): FormatList[DateType] = {
      val __obj = js.Dynamic.literal(formatList = formatList.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatList[DateType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatList[?], DateType] (val x: Self & FormatList[DateType]) extends AnyVal {
      
      inline def setFormatList(value: js.Array[String | CustomFormat[DateType]]): Self = StObject.set(x, "formatList", value.asInstanceOf[js.Any])
      
      inline def setFormatListVarargs(value: (String | CustomFormat[DateType])*): Self = StObject.set(x, "formatList", js.Array(value*))
      
      inline def setGenerateConfig(value: typings.rcPicker.esGenerateMod.GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  trait GenerateConfig[DateType] extends StObject {
    
    var format: String | CustomFormat[DateType]
    
    var generateConfig: typings.rcPicker.esGenerateMod.GenerateConfig[DateType]
    
    var locale: Locale
  }
  object GenerateConfig {
    
    inline def apply[DateType](
      format: String | CustomFormat[DateType],
      generateConfig: typings.rcPicker.esGenerateMod.GenerateConfig[DateType],
      locale: Locale
    ): GenerateConfig[DateType] = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateConfig[DateType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenerateConfig[?], DateType] (val x: Self & GenerateConfig[DateType]) extends AnyVal {
      
      inline def setFormat(value: String | CustomFormat[DateType]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatFunction1(value: DateType => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setGenerateConfig(value: typings.rcPicker.esGenerateMod.GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  trait Label extends StObject {
    
    var label: String
    
    def onClick(): Unit
    
    def onMouseEnter(): Unit
    
    def onMouseLeave(): Unit
  }
  object Label {
    
    inline def apply(label: String, onClick: () => Unit, onMouseEnter: () => Unit, onMouseLeave: () => Unit): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave))
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnMouseEnter(value: () => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction0(value))
      
      inline def setOnMouseLeave(value: () => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction0(value))
    }
  }
  
  trait OnTextChange extends StObject {
    
    def onTextChange(text: String): Unit
    
    /** Must useMemo, to assume that `valueTexts` only match on the first change */
    var valueTexts: js.Array[String]
  }
  object OnTextChange {
    
    inline def apply(onTextChange: String => Unit, valueTexts: js.Array[String]): OnTextChange = {
      val __obj = js.Dynamic.literal(onTextChange = js.Any.fromFunction1(onTextChange), valueTexts = valueTexts.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnTextChange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnTextChange] (val x: Self) extends AnyVal {
      
      inline def setOnTextChange(value: String => Unit): Self = StObject.set(x, "onTextChange", js.Any.fromFunction1(value))
      
      inline def setValueTexts(value: js.Array[String]): Self = StObject.set(x, "valueTexts", value.asInstanceOf[js.Any])
      
      inline def setValueTextsVarargs(value: String*): Self = StObject.set(x, "valueTexts", js.Array(value*))
    }
  }
}
