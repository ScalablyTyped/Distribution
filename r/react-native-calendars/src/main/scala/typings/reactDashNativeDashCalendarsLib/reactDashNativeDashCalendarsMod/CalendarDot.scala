package typings
package reactDashNativeDashCalendarsLib.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarDot extends js.Object {
  var color: java.lang.String
  var key: java.lang.String
  var selectedDotColor: js.UndefOr[java.lang.String] = js.undefined
}

object CalendarDot {
  @scala.inline
  def apply(color: java.lang.String, key: java.lang.String, selectedDotColor: java.lang.String = null): CalendarDot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("key")(key)
    if (selectedDotColor != null) __obj.updateDynamic("selectedDotColor")(selectedDotColor)
    __obj.asInstanceOf[CalendarDot]
  }
}

