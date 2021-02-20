package typings.reactDates.mod

import typings.moment.mod.Moment
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactDates.reactDatesNumbers.`-1`
import typings.reactDates.reactDatesNumbers.`0`
import typings.std.HTMLTableDataCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarDayShape extends StObject {
  
  var ariaLabelFormat: js.UndefOr[String] = js.native
  
  var day: js.UndefOr[Moment | Null] = js.native
  
  var daySize: js.UndefOr[Double] = js.native
  
  var isFocused: js.UndefOr[Boolean] = js.native
  
  var isOutsideDay: js.UndefOr[Boolean] = js.native
  
  var modifiers: js.UndefOr[ModifiersShape] = js.native
  
  var onDayClick: js.UndefOr[
    js.Function2[
      /* day */ Moment, 
      /* event */ MouseEvent[HTMLTableDataCellElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
  
  var onDayMouseEnter: js.UndefOr[
    js.Function2[
      /* day */ Moment, 
      /* event */ MouseEvent[HTMLTableDataCellElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
  
  var onDayMouseLeave: js.UndefOr[
    js.Function2[
      /* day */ Moment, 
      /* event */ MouseEvent[HTMLTableDataCellElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.native
  
  // internationalization
  var phrases: js.UndefOr[CalendarDayPhrases] = js.native
  
  var renderDayContents: js.UndefOr[
    (js.Function2[/* day */ Moment, /* modifiers */ ModifiersShape, ReactNode]) | Null
  ] = js.native
  
  var tabIndex: js.UndefOr[`0` | `-1`] = js.native
}
object CalendarDayShape {
  
  @scala.inline
  def apply(): CalendarDayShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarDayShape]
  }
  
  @scala.inline
  implicit class CalendarDayShapeMutableBuilder[Self <: CalendarDayShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAriaLabelFormat(value: String): Self = StObject.set(x, "ariaLabelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabelFormatUndefined: Self = StObject.set(x, "ariaLabelFormat", js.undefined)
    
    @scala.inline
    def setDay(value: Moment): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayNull: Self = StObject.set(x, "day", null)
    
    @scala.inline
    def setDaySize(value: Double): Self = StObject.set(x, "daySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaySizeUndefined: Self = StObject.set(x, "daySize", js.undefined)
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
    @scala.inline
    def setIsOutsideDay(value: Boolean): Self = StObject.set(x, "isOutsideDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOutsideDayUndefined: Self = StObject.set(x, "isOutsideDay", js.undefined)
    
    @scala.inline
    def setModifiers(value: ModifiersShape): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    @scala.inline
    def setOnDayClick(
      value: (/* day */ Moment, /* event */ MouseEvent[HTMLTableDataCellElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onDayClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
    
    @scala.inline
    def setOnDayMouseEnter(
      value: (/* day */ Moment, /* event */ MouseEvent[HTMLTableDataCellElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onDayMouseEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDayMouseEnterUndefined: Self = StObject.set(x, "onDayMouseEnter", js.undefined)
    
    @scala.inline
    def setOnDayMouseLeave(
      value: (/* day */ Moment, /* event */ MouseEvent[HTMLTableDataCellElement, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onDayMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDayMouseLeaveUndefined: Self = StObject.set(x, "onDayMouseLeave", js.undefined)
    
    @scala.inline
    def setPhrases(value: CalendarDayPhrases): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhrasesUndefined: Self = StObject.set(x, "phrases", js.undefined)
    
    @scala.inline
    def setRenderDayContents(value: (/* day */ Moment, /* modifiers */ ModifiersShape) => ReactNode): Self = StObject.set(x, "renderDayContents", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderDayContentsNull: Self = StObject.set(x, "renderDayContents", null)
    
    @scala.inline
    def setRenderDayContentsUndefined: Self = StObject.set(x, "renderDayContents", js.undefined)
    
    @scala.inline
    def setTabIndex(value: `0` | `-1`): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
  }
}
