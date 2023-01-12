package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeekCalendarProps
  extends StObject
     with CalendarListBaseProps {
  
  /**
    * whether to have shadow/elevation for the calendar
    */
  var allowShadow: js.UndefOr[Boolean] = js.undefined
}
object WeekCalendarProps {
  
  inline def apply(): WeekCalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeekCalendarProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WeekCalendarProps] (val x: Self) extends AnyVal {
    
    inline def setAllowShadow(value: Boolean): Self = StObject.set(x, "allowShadow", value.asInstanceOf[js.Any])
    
    inline def setAllowShadowUndefined: Self = StObject.set(x, "allowShadow", js.undefined)
  }
}
