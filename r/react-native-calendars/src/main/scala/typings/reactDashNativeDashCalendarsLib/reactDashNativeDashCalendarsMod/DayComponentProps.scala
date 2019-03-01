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
    onLongPress: js.Function0[js.Any],
    onPress: js.Function0[js.Any],
    state: reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.Empty | reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.selected | reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.disabled | reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsLibStrings.today,
    theme: CalendarTheme
  ): DayComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("marking")(marking.asInstanceOf[js.Any])
    __obj.updateDynamic("onLongPress")(onLongPress)
    __obj.updateDynamic("onPress")(onPress)
    __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[DayComponentProps]
  }
}

