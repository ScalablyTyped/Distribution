package typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsStrings.`multi-period`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPeriodMarkingProps extends _CalendarMarkingProps {
  var markedDates: StringDictionary[MultiPeriodMarking]
  var markingType: `multi-period`
}

object MultiPeriodMarkingProps {
  @scala.inline
  def apply(markedDates: StringDictionary[MultiPeriodMarking], markingType: `multi-period`): MultiPeriodMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates, markingType = markingType)
  
    __obj.asInstanceOf[MultiPeriodMarkingProps]
  }
}

