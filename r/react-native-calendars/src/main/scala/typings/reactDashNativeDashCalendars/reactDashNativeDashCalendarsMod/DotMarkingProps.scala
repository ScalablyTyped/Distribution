package typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotMarkingProps extends _CalendarMarkingProps {
  var markedDates: StringDictionary[DotMarking]
  var markingType: js.UndefOr[simple] = js.undefined
}

object DotMarkingProps {
  @scala.inline
  def apply(markedDates: StringDictionary[DotMarking], markingType: simple = null): DotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any])
    if (markingType != null) __obj.updateDynamic("markingType")(markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotMarkingProps]
  }
}

