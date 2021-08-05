package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCalendars.reactNativeCalendarsStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DotMarkingProps
  extends StObject
     with _CalendarMarkingProps {
  
  var markedDates: StringDictionary[DotMarking]
  
  var markingType: js.UndefOr[simple] = js.undefined
}
object DotMarkingProps {
  
  inline def apply(markedDates: StringDictionary[DotMarking]): DotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotMarkingProps]
  }
  
  extension [Self <: DotMarkingProps](x: Self) {
    
    inline def setMarkedDates(value: StringDictionary[DotMarking]): Self = StObject.set(x, "markedDates", value.asInstanceOf[js.Any])
    
    inline def setMarkingType(value: simple): Self = StObject.set(x, "markingType", value.asInstanceOf[js.Any])
    
    inline def setMarkingTypeUndefined: Self = StObject.set(x, "markingType", js.undefined)
  }
}
