package typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsStrings.`multi-dot`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiDotMarkingProps extends _CalendarMarkingProps {
  var markedDates: StringDictionary[MultiDotMarking]
  var markingType: `multi-dot`
}

object MultiDotMarkingProps {
  @scala.inline
  def apply(markedDates: StringDictionary[MultiDotMarking], markingType: `multi-dot`): MultiDotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates, markingType = markingType)
  
    __obj.asInstanceOf[MultiDotMarkingProps]
  }
}

