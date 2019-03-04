package typings
package reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMarkingProps extends _CalendarMarkingProps {
  var markedDates: org.scalablytyped.runtime.StringDictionary[CustomMarking]
  var markingType: reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.custom
}

object CustomMarkingProps {
  @scala.inline
  def apply(
    markedDates: org.scalablytyped.runtime.StringDictionary[CustomMarking],
    markingType: reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.custom
  ): CustomMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates, markingType = markingType)
  
    __obj.asInstanceOf[CustomMarkingProps]
  }
}

