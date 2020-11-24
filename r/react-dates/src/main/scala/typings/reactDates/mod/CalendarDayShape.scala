package typings.reactDates.mod

import typings.moment.mod.Moment
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactDates.reactDatesNumbers.`-1`
import typings.reactDates.reactDatesNumbers.`0`
import typings.std.HTMLTableDataCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarDayShape extends js.Object {
  
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
  implicit class CalendarDayShapeOps[Self <: CalendarDayShape] (val x: Self) extends AnyVal {
    
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
    def setAriaLabelFormat(value: String): Self = this.set("ariaLabelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelFormat: Self = this.set("ariaLabelFormat", js.undefined)
    
    @scala.inline
    def setDay(value: Moment): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setDayNull: Self = this.set("day", null)
    
    @scala.inline
    def setDaySize(value: Double): Self = this.set("daySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaySize: Self = this.set("daySize", js.undefined)
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    
    @scala.inline
    def setIsOutsideDay(value: Boolean): Self = this.set("isOutsideDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOutsideDay: Self = this.set("isOutsideDay", js.undefined)
    
    @scala.inline
    def setModifiers(value: ModifiersShape): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    
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
    
    @scala.inline
    def setTabIndex(value: `0` | `-1`): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
  }
}
