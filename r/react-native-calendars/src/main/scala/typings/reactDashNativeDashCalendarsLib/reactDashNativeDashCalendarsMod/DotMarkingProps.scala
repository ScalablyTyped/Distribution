package typings
package reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotMarkingProps extends _CalendarMarkingProps {
  var markedDates: org.scalablytyped.runtime.StringDictionary[DotMarking]
  var markingType: js.UndefOr[reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.simple] = js.undefined
}

object DotMarkingProps {
  @scala.inline
  def apply(
    markedDates: org.scalablytyped.runtime.StringDictionary[DotMarking],
    markingType: reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.simple = null
  ): DotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates)
    if (markingType != null) __obj.updateDynamic("markingType")(markingType)
    __obj.asInstanceOf[DotMarkingProps]
  }
}

