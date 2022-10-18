package typings.reactDayPicker.mod

import typings.dateFns.mod.Locale
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactDayPicker.anon.RequiredClassNames
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The value of the {@link DayPickerContext} extends the props from DayPicker
  * with default and cleaned up values.
  */
trait DayPickerContextValue
  extends StObject
     with DayPickerBase {
  
  @JSName("captionLayout")
  var captionLayout_DayPickerContextValue: CaptionLayout
  
  @JSName("classNames")
  var classNames_DayPickerContextValue: RequiredClassNames
  
  @JSName("formatters")
  var formatters_DayPickerContextValue: Formatters
  
  @JSName("labels")
  var labels_DayPickerContextValue: Labels
  
  @JSName("locale")
  var locale_DayPickerContextValue: Locale
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var mode: DaySelectionMode
  
  @JSName("modifiersClassNames")
  var modifiersClassNames_DayPickerContextValue: ModifiersClassNames
  
  @JSName("modifiers")
  var modifiers_DayPickerContextValue: DayModifiers
  
  @JSName("numberOfMonths")
  var numberOfMonths_DayPickerContextValue: Double
  
  var onSelect: js.UndefOr[SelectSingleEventHandler | SelectMultipleEventHandler | SelectRangeEventHandler] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  @JSName("styles")
  var styles_DayPickerContextValue: Styles
  
  @JSName("today")
  var today_DayPickerContextValue: js.Date
}
object DayPickerContextValue {
  
  inline def apply(
    captionLayout: CaptionLayout,
    classNames: RequiredClassNames,
    formatters: Formatters,
    labels: Labels,
    locale: Locale,
    mode: DaySelectionMode,
    modifiers: DayModifiers,
    modifiersClassNames: ModifiersClassNames,
    numberOfMonths: Double,
    styles: Styles,
    today: js.Date
  ): DayPickerContextValue = {
    val __obj = js.Dynamic.literal(captionLayout = captionLayout.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], formatters = formatters.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], modifiersClassNames = modifiersClassNames.asInstanceOf[js.Any], numberOfMonths = numberOfMonths.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayPickerContextValue]
  }
  
  extension [Self <: DayPickerContextValue](x: Self) {
    
    inline def setCaptionLayout(value: CaptionLayout): Self = StObject.set(x, "captionLayout", value.asInstanceOf[js.Any])
    
    inline def setClassNames(value: RequiredClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setFormatters(value: Formatters): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMode(value: DaySelectionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModifiers(value: DayModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersClassNames(value: ModifiersClassNames): Self = StObject.set(x, "modifiersClassNames", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
    
    inline def setOnSelect(
      value: (js.UndefOr[js.Array[js.Date] | js.Date | DateRange], /* selectedDay */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ MouseEvent[Element, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onSelect", js.Any.fromFunction4(value))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setStyles(value: Styles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setToday(value: js.Date): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
  }
}
