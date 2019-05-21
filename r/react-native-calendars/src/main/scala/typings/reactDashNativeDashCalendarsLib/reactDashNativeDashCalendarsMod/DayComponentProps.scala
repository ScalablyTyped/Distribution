package typings
package reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayComponentProps extends js.Object {
  var date: DateObject
  var marking: reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibNumbers.`false` | js.Array[Marking]
  var state: reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.Empty | reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.selected | reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.disabled | reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.today
  var theme: CalendarTheme
  def onLongPress(date: DateObject): js.Any
  def onPress(date: DateObject): js.Any
}

object DayComponentProps {
  @scala.inline
  def apply(
    date: DateObject,
    marking: reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibNumbers.`false` | js.Array[Marking],
    onLongPress: DateObject => js.Any,
    onPress: DateObject => js.Any,
    state: reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.Empty | reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.selected | reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.disabled | reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.today,
    theme: CalendarTheme
  ): DayComponentProps = {
    val __obj = js.Dynamic.literal(date = date, marking = marking.asInstanceOf[js.Any], onLongPress = js.Any.fromFunction1(onLongPress), onPress = js.Any.fromFunction1(onPress), state = state.asInstanceOf[js.Any], theme = theme)
  
    __obj.asInstanceOf[DayComponentProps]
  }
}

