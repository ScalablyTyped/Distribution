package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCalendars.reactNativeCalendarsStrings.period
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeriodMarkingProps
  extends StObject
     with _CalendarMarkingProps {
  
  var markedDates: StringDictionary[PeriodMarking]
  
  var markingType: period
}
object PeriodMarkingProps {
  
  inline def apply(markedDates: StringDictionary[PeriodMarking]): PeriodMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = "period")
    __obj.asInstanceOf[PeriodMarkingProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeriodMarkingProps] (val x: Self) extends AnyVal {
    
    inline def setMarkedDates(value: StringDictionary[PeriodMarking]): Self = StObject.set(x, "markedDates", value.asInstanceOf[js.Any])
    
    inline def setMarkingType(value: period): Self = StObject.set(x, "markingType", value.asInstanceOf[js.Any])
  }
}
