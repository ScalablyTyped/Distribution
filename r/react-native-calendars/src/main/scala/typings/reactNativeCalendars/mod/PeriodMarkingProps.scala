package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCalendars.reactNativeCalendarsStrings.period
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeriodMarkingProps extends _CalendarMarkingProps {
  
  var markedDates: StringDictionary[PeriodMarking] = js.native
  
  var markingType: period = js.native
}
object PeriodMarkingProps {
  
  @scala.inline
  def apply(markedDates: StringDictionary[PeriodMarking], markingType: period): PeriodMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeriodMarkingProps]
  }
  
  @scala.inline
  implicit class PeriodMarkingPropsMutableBuilder[Self <: PeriodMarkingProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarkedDates(value: StringDictionary[PeriodMarking]): Self = StObject.set(x, "markedDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkingType(value: period): Self = StObject.set(x, "markingType", value.asInstanceOf[js.Any])
  }
}
