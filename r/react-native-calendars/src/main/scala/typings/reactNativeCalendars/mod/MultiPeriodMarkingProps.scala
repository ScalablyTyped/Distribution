package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCalendars.reactNativeCalendarsStrings.`multi-period`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiPeriodMarkingProps
  extends StObject
     with _CalendarMarkingProps {
  
  var markedDates: StringDictionary[MultiPeriodMarking]
  
  var markingType: `multi-period`
}
object MultiPeriodMarkingProps {
  
  inline def apply(markedDates: StringDictionary[MultiPeriodMarking]): MultiPeriodMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = "multi-period")
    __obj.asInstanceOf[MultiPeriodMarkingProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiPeriodMarkingProps] (val x: Self) extends AnyVal {
    
    inline def setMarkedDates(value: StringDictionary[MultiPeriodMarking]): Self = StObject.set(x, "markedDates", value.asInstanceOf[js.Any])
    
    inline def setMarkingType(value: `multi-period`): Self = StObject.set(x, "markingType", value.asInstanceOf[js.Any])
  }
}
