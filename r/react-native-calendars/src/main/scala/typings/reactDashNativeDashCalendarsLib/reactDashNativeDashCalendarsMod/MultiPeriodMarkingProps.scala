package typings
package reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPeriodMarkingProps extends _CalendarMarkingProps {
  var markedDates: org.scalablytyped.runtime.StringDictionary[MultiPeriodMarking]
  var markingType: reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.`multi-period`
}

object MultiPeriodMarkingProps {
  @scala.inline
  def apply(
    markedDates: org.scalablytyped.runtime.StringDictionary[MultiPeriodMarking],
    markingType: reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.`multi-period`
  ): MultiPeriodMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates, markingType = markingType)
  
    __obj.asInstanceOf[MultiPeriodMarkingProps]
  }
}

