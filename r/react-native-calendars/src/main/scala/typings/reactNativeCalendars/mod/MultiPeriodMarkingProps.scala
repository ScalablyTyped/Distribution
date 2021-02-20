package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCalendars.reactNativeCalendarsStrings.`multi-period`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiPeriodMarkingProps extends _CalendarMarkingProps {
  
  var markedDates: StringDictionary[MultiPeriodMarking] = js.native
  
  var markingType: `multi-period` = js.native
}
object MultiPeriodMarkingProps {
  
  @scala.inline
  def apply(markedDates: StringDictionary[MultiPeriodMarking], markingType: `multi-period`): MultiPeriodMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPeriodMarkingProps]
  }
  
  @scala.inline
  implicit class MultiPeriodMarkingPropsMutableBuilder[Self <: MultiPeriodMarkingProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarkedDates(value: StringDictionary[MultiPeriodMarking]): Self = StObject.set(x, "markedDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkingType(value: `multi-period`): Self = StObject.set(x, "markingType", value.asInstanceOf[js.Any])
  }
}
