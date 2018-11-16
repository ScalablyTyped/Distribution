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

