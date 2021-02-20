package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StObject
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
  implicit class CalendarListBasePropsMutableBuilder[Self <: CalendarListBaseProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendarHeight(value: Double): Self = StObject.set(x, "calendarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarHeightUndefined: Self = StObject.set(x, "calendarHeight", js.undefined)
    
    @scala.inline
    def setCalendarWidth(value: Double): Self = StObject.set(x, "calendarWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarWidthUndefined: Self = StObject.set(x, "calendarWidth", js.undefined)
    
    @scala.inline
    def setFutureScrollRange(value: Double): Self = StObject.set(x, "futureScrollRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFutureScrollRangeUndefined: Self = StObject.set(x, "futureScrollRange", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setPagingEnabled(value: Boolean): Self = StObject.set(x, "pagingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingEnabledUndefined: Self = StObject.set(x, "pagingEnabled", js.undefined)
    
    @scala.inline
    def setPastScrollRange(value: Double): Self = StObject.set(x, "pastScrollRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPastScrollRangeUndefined: Self = StObject.set(x, "pastScrollRange", js.undefined)
    
    @scala.inline
    def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
    
    @scala.inline
    def setScrollsToTop(value: Boolean): Self = StObject.set(x, "scrollsToTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollsToTopUndefined: Self = StObject.set(x, "scrollsToTop", js.undefined)
    
    @scala.inline
    def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setShowScrollIndicator(value: Boolean): Self = StObject.set(x, "showScrollIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowScrollIndicatorUndefined: Self = StObject.set(x, "showScrollIndicator", js.undefined)
  }
}
