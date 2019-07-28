package typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsStrings.period
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeriodMarkingProps extends _CalendarMarkingProps {
  var markedDates: StringDictionary[PeriodMarking]
  var markingType: period
}

object PeriodMarkingProps {
  @scala.inline
  def apply(markedDates: StringDictionary[PeriodMarking], markingType: period): PeriodMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates, markingType = markingType)
  
    __obj.asInstanceOf[PeriodMarkingProps]
  }
}

