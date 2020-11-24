package typings.reactNativeCalendars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarListBaseProps extends CalendarBaseProps {
  
  /**
    *  Set custom calendar heigth.
    */
  var calendarHeight: js.UndefOr[Double] = js.native
  
  /**
    *  Set custom calendar width.
    */
  var calendarWidth: js.UndefOr[Double] = js.native
  
  /**
    *  Max amount of months allowed to scroll to the future. Default = 50
    */
  var futureScrollRange: js.UndefOr[Double] = js.native
  
  /**
    *  Enable horizontal scrolling, default = false
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  
  /**
    *  Enable paging on horizontal, default = false
    */
  var pagingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    *  Max amount of months allowed to scroll to the past. Default = 50
    */
  var pastScrollRange: js.UndefOr[Double] = js.native
  
  /**
    *  Enable or disable scrolling of calendar list
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    *  When true, the calendar list scrolls to top when the status bar is tapped. Default = true
    */
  var scrollsToTop: js.UndefOr[Boolean] = js.native
  
  /**
    * Initially selected day
    */
  var selected: js.UndefOr[String] = js.native
  
  /**
    *  Enable or disable vertical scroll indicator. Default = false
    */
  var showScrollIndicator: js.UndefOr[Boolean] = js.native
}
object CalendarListBaseProps {
  
  @scala.inline
  def apply(): CalendarListBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarListBaseProps]
  }
  
  @scala.inline
  implicit class CalendarListBasePropsOps[Self <: CalendarListBaseProps] (val x: Self) extends AnyVal {
    
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
    def setCalendarHeight(value: Double): Self = this.set("calendarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarHeight: Self = this.set("calendarHeight", js.undefined)
    
    @scala.inline
    def setCalendarWidth(value: Double): Self = this.set("calendarWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarWidth: Self = this.set("calendarWidth", js.undefined)
    
    @scala.inline
    def setFutureScrollRange(value: Double): Self = this.set("futureScrollRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFutureScrollRange: Self = this.set("futureScrollRange", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setPagingEnabled(value: Boolean): Self = this.set("pagingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagingEnabled: Self = this.set("pagingEnabled", js.undefined)
    
    @scala.inline
    def setPastScrollRange(value: Double): Self = this.set("pastScrollRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePastScrollRange: Self = this.set("pastScrollRange", js.undefined)
    
    @scala.inline
    def setScrollEnabled(value: Boolean): Self = this.set("scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollEnabled: Self = this.set("scrollEnabled", js.undefined)
    
    @scala.inline
    def setScrollsToTop(value: Boolean): Self = this.set("scrollsToTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollsToTop: Self = this.set("scrollsToTop", js.undefined)
    
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setShowScrollIndicator(value: Boolean): Self = this.set("showScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowScrollIndicator: Self = this.set("showScrollIndicator", js.undefined)
  }
}
