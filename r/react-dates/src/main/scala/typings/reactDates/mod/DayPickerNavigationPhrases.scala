package typings.reactDates.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayPickerNavigationPhrases extends StObject {
  
  var jumpToNextMonth: js.UndefOr[String] = js.undefined
  
  var jumpToPrevMonth: js.UndefOr[String] = js.undefined
}
object DayPickerNavigationPhrases {
  
  inline def apply(): DayPickerNavigationPhrases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPickerNavigationPhrases]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DayPickerNavigationPhrases] (val x: Self) extends AnyVal {
    
    inline def setJumpToNextMonth(value: String): Self = StObject.set(x, "jumpToNextMonth", value.asInstanceOf[js.Any])
    
    inline def setJumpToNextMonthUndefined: Self = StObject.set(x, "jumpToNextMonth", js.undefined)
    
    inline def setJumpToPrevMonth(value: String): Self = StObject.set(x, "jumpToPrevMonth", value.asInstanceOf[js.Any])
    
    inline def setJumpToPrevMonthUndefined: Self = StObject.set(x, "jumpToPrevMonth", js.undefined)
  }
}
