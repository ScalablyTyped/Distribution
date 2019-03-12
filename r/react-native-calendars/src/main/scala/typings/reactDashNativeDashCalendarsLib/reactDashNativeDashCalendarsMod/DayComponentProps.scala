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
  def onLongPress(): js.Any
  def onPress(): js.Any
}

object DayComponentProps {
  @scala.inline
  def apply(
    date: DateObject,
    marking: reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibNumbers.`false` | js.Array[Marking],
    onLongPress: () => js.Any,
    onPress: () => js.Any,
    state: reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.Empty | reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.selected | reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.disabled | reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.today,
    theme: CalendarTheme
  ): DayComponentProps = {
    val __obj = js.Dynamic.literal(date = date, marking = marking.asInstanceOf[js.Any], onLongPress = js.Any.fromFunction0(onLongPress), onPress = js.Any.fromFunction0(onPress), state = state.asInstanceOf[js.Any], theme = theme)
  
    __obj.asInstanceOf[DayComponentProps]
  }
}

