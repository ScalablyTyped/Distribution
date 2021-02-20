package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCalendars.reactNativeCalendarsStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomMarkingProps extends _CalendarMarkingProps {
  
  var markedDates: StringDictionary[CustomMarking] = js.native
  
  var markingType: custom = js.native
}
object CustomMarkingProps {
  
  @scala.inline
  def apply(markedDates: StringDictionary[CustomMarking], markingType: custom): CustomMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMarkingProps]
  }
  
  @scala.inline
  implicit class CustomMarkingPropsMutableBuilder[Self <: CustomMarkingProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarkedDates(value: StringDictionary[CustomMarking]): Self = StObject.set(x, "markedDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkingType(value: custom): Self = StObject.set(x, "markingType", value.asInstanceOf[js.Any])
  }
}
