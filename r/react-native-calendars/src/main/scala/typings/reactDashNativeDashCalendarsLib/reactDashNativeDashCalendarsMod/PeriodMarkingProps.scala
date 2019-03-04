package typings
package reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeriodMarkingProps extends _CalendarMarkingProps {
  var markedDates: org.scalablytyped.runtime.StringDictionary[PeriodMarking]
  var markingType: reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.period
}

object PeriodMarkingProps {
  @scala.inline
  def apply(
    markedDates: org.scalablytyped.runtime.StringDictionary[PeriodMarking],
    markingType: reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.period
  ): PeriodMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates, markingType = markingType)
  
    __obj.asInstanceOf[PeriodMarkingProps]
  }
}

