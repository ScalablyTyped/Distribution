package typings.reactDates.anon

import typings.moment.mod.Moment
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactDates.mod.CalendarDayPhrases
import typings.reactDates.mod.ModifiersShape
import typings.std.HTMLTableDataCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-dates.react-dates.CalendarDayShape, 'daySize' | 'onDayClick' | 'onDayMouseEnter' | 'onDayMouseLeave' | 'renderDayContents' | 'isFocused' | 'phrases'> */
@js.native
trait PickCalendarDayShapedaySi extends StObject {
  
  var daySize: js.UndefOr[Double] = js.native
  
  var isFocused: js.UndefOr[Boolean] = js.native
  
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
  
  var phrases: js.UndefOr[CalendarDayPhrases] = js.native
  
  var renderDayContents: js.UndefOr[
    (js.Function2[/* day */ Moment, /* modifiers */ ModifiersShape, ReactNode]) | Null
  ] = js.native
}
object PickCalendarDayShapedaySi {
  
  @scala.inline
  def apply(): PickCalendarDayShapedaySi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCalendarDayShapedaySi]
  }
  
  @scala.inline
  implicit class PickCalendarDayShapedaySiMutableBuilder[Self <: PickCalendarDayShapedaySi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaySize(value: Double): Self = StObject.set(x, "daySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaySizeUndefined: Self = StObject.set(x, "daySize", js.undefined)
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
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
  }
}
