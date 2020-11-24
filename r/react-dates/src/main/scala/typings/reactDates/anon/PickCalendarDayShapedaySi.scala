package typings.reactDates.anon

import typings.moment.mod.Moment
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactDates.mod.CalendarDayPhrases
import typings.reactDates.mod.ModifiersShape
import typings.std.HTMLTableDataCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-dates.react-dates.CalendarDayShape, 'daySize' | 'onDayClick' | 'onDayMouseEnter' | 'onDayMouseLeave' | 'renderDayContents' | 'isFocused' | 'phrases'> */
@js.native
trait PickCalendarDayShapedaySi extends js.Object {
  
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
  implicit class PickCalendarDayShapedaySiOps[Self <: PickCalendarDayShapedaySi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDaySize(value: Double): Self = this.set("daySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaySize: Self = this.set("daySize", js.undefined)
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    
    @scala.inline
    def setOnDayClick(
      value: (/* day */ Moment, /* event */ MouseEvent[HTMLTableDataCellElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onDayClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDayClick: Self = this.set("onDayClick", js.undefined)
    
    @scala.inline
    def setOnDayMouseEnter(
      value: (/* day */ Moment, /* event */ MouseEvent[HTMLTableDataCellElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onDayMouseEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDayMouseEnter: Self = this.set("onDayMouseEnter", js.undefined)
    
    @scala.inline
    def setOnDayMouseLeave(
      value: (/* day */ Moment, /* event */ MouseEvent[HTMLTableDataCellElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onDayMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDayMouseLeave: Self = this.set("onDayMouseLeave", js.undefined)
    
    @scala.inline
    def setPhrases(value: CalendarDayPhrases): Self = this.set("phrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhrases: Self = this.set("phrases", js.undefined)
    
    @scala.inline
    def setRenderDayContents(value: (/* day */ Moment, /* modifiers */ ModifiersShape) => ReactNode): Self = this.set("renderDayContents", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderDayContents: Self = this.set("renderDayContents", js.undefined)
    
    @scala.inline
    def setRenderDayContentsNull: Self = this.set("renderDayContents", null)
  }
}
