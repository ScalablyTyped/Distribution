package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCalendars.reactNativeCalendarsStrings.`multi-dot`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiDotMarkingProps
  extends StObject
     with _CalendarMarkingProps {
  
  var markedDates: StringDictionary[MultiDotMarking]
  
  var markingType: `multi-dot`
}
object MultiDotMarkingProps {
  
  @scala.inline
  def apply(markedDates: StringDictionary[MultiDotMarking]): MultiDotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = "multi-dot")
    __obj.asInstanceOf[MultiDotMarkingProps]
  }
  
  @scala.inline
  implicit class MultiDotMarkingPropsMutableBuilder[Self <: MultiDotMarkingProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarkedDates(value: StringDictionary[MultiDotMarking]): Self = StObject.set(x, "markedDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkingType(value: `multi-dot`): Self = StObject.set(x, "markingType", value.asInstanceOf[js.Any])
  }
}
