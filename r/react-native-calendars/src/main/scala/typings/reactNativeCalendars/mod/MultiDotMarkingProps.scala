package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCalendars.reactNativeCalendarsStrings.`multi-dot`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiDotMarkingProps extends _CalendarMarkingProps {
  
  var markedDates: StringDictionary[MultiDotMarking] = js.native
  
  var markingType: `multi-dot` = js.native
}
object MultiDotMarkingProps {
  
  @scala.inline
  def apply(markedDates: StringDictionary[MultiDotMarking], markingType: `multi-dot`): MultiDotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
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
