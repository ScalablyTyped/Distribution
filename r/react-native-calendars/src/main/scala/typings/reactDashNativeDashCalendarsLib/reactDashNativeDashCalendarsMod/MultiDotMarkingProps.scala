package typings
package reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiDotMarkingProps extends _CalendarMarkingProps {
  var markedDates: org.scalablytyped.runtime.StringDictionary[MultiDotMarking]
  var markingType: reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.`multi-dot`
}

object MultiDotMarkingProps {
  @scala.inline
  def apply(
    markedDates: org.scalablytyped.runtime.StringDictionary[MultiDotMarking],
    markingType: reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.`multi-dot`
  ): MultiDotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates, markingType = markingType)
  
    __obj.asInstanceOf[MultiDotMarkingProps]
  }
}

