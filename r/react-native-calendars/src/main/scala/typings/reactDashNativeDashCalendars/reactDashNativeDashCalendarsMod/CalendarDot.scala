package typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarDot extends js.Object {
  var color: String
  var key: String
  var selectedDotColor: js.UndefOr[String] = js.undefined
}

object CalendarDot {
  @scala.inline
  def apply(color: String, key: String, selectedDotColor: String = null): CalendarDot = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (selectedDotColor != null) __obj.updateDynamic("selectedDotColor")(selectedDotColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDot]
  }
}

