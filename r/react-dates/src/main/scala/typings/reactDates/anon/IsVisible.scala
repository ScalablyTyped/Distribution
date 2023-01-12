package typings.reactDates.anon

import typings.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsVisible extends StObject {
  
  var isVisible: Boolean
  
  var month: Moment
  
  def onMonthSelect(currentMonth: Moment, newMonthVal: String): Unit
  
  def onYearSelect(currentMonth: Moment, newMonthVal: String): Unit
}
object IsVisible {
  
  inline def apply(
    isVisible: Boolean,
    month: Moment,
    onMonthSelect: (Moment, String) => Unit,
    onYearSelect: (Moment, String) => Unit
  ): IsVisible = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], onMonthSelect = js.Any.fromFunction2(onMonthSelect), onYearSelect = js.Any.fromFunction2(onYearSelect))
    __obj.asInstanceOf[IsVisible]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsVisible] (val x: Self) extends AnyVal {
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Moment): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setOnMonthSelect(value: (Moment, String) => Unit): Self = StObject.set(x, "onMonthSelect", js.Any.fromFunction2(value))
    
    inline def setOnYearSelect(value: (Moment, String) => Unit): Self = StObject.set(x, "onYearSelect", js.Any.fromFunction2(value))
  }
}
