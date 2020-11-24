package typings.reactDates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-dates.react-dates.CalendarMonthGridShape, 'enableOutsideDays' | 'firstDayOfWeek' | 'daySize' | 'isRTL' | 'transitionDuration' | 'verticalBorderSpacing' | 'horizontalMonthPadding' | 'modifiers' | 'renderCalendarDay' | 'renderDayContents' | 'onDayClick' | 'onDayMouseEnter' | 'onDayMouseLeave' | 'monthFormat' | 'dayAriaLabelFormat'> */
@js.native
trait PickCalendarMonthGridShap extends js.Object {
  
  var dayAriaLabelFormat: js.UndefOr[js.Any] = js.native
  
  var daySize: js.UndefOr[js.Any] = js.native
  
  var enableOutsideDays: js.UndefOr[js.Any] = js.native
  
  var firstDayOfWeek: js.UndefOr[js.Any] = js.native
  
  var horizontalMonthPadding: js.UndefOr[js.Any] = js.native
  
  var isRTL: js.UndefOr[js.Any] = js.native
  
  var modifiers: js.UndefOr[js.Any] = js.native
  
  var monthFormat: js.UndefOr[js.Any] = js.native
  
  var onDayClick: js.UndefOr[js.Any] = js.native
  
  var onDayMouseEnter: js.UndefOr[js.Any] = js.native
  
  var onDayMouseLeave: js.UndefOr[js.Any] = js.native
  
  var renderCalendarDay: js.UndefOr[js.Any] = js.native
  
  var renderDayContents: js.UndefOr[js.Any] = js.native
  
  var transitionDuration: js.UndefOr[js.Any] = js.native
  
  var verticalBorderSpacing: js.UndefOr[js.Any] = js.native
}
object PickCalendarMonthGridShap {
  
  @scala.inline
  def apply(): PickCalendarMonthGridShap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCalendarMonthGridShap]
  }
  
  @scala.inline
  implicit class PickCalendarMonthGridShapOps[Self <: PickCalendarMonthGridShap] (val x: Self) extends AnyVal {
    
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
    def setDayAriaLabelFormat(value: js.Any): Self = this.set("dayAriaLabelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayAriaLabelFormat: Self = this.set("dayAriaLabelFormat", js.undefined)
    
    @scala.inline
    def setDaySize(value: js.Any): Self = this.set("daySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaySize: Self = this.set("daySize", js.undefined)
    
    @scala.inline
    def setEnableOutsideDays(value: js.Any): Self = this.set("enableOutsideDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableOutsideDays: Self = this.set("enableOutsideDays", js.undefined)
    
    @scala.inline
    def setFirstDayOfWeek(value: js.Any): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    
    @scala.inline
    def setHorizontalMonthPadding(value: js.Any): Self = this.set("horizontalMonthPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalMonthPadding: Self = this.set("horizontalMonthPadding", js.undefined)
    
    @scala.inline
    def setIsRTL(value: js.Any): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    
    @scala.inline
    def setModifiers(value: js.Any): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    
    @scala.inline
    def setMonthFormat(value: js.Any): Self = this.set("monthFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthFormat: Self = this.set("monthFormat", js.undefined)
    
    @scala.inline
    def setOnDayClick(value: js.Any): Self = this.set("onDayClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDayClick: Self = this.set("onDayClick", js.undefined)
    
    @scala.inline
    def setOnDayMouseEnter(value: js.Any): Self = this.set("onDayMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDayMouseEnter: Self = this.set("onDayMouseEnter", js.undefined)
    
    @scala.inline
    def setOnDayMouseLeave(value: js.Any): Self = this.set("onDayMouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDayMouseLeave: Self = this.set("onDayMouseLeave", js.undefined)
    
    @scala.inline
    def setRenderCalendarDay(value: js.Any): Self = this.set("renderCalendarDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderCalendarDay: Self = this.set("renderCalendarDay", js.undefined)
    
    @scala.inline
    def setRenderDayContents(value: js.Any): Self = this.set("renderDayContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderDayContents: Self = this.set("renderDayContents", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: js.Any): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    
    @scala.inline
    def setVerticalBorderSpacing(value: js.Any): Self = this.set("verticalBorderSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalBorderSpacing: Self = this.set("verticalBorderSpacing", js.undefined)
  }
}
