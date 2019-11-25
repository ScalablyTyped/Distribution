package typings.reactDashWidgets.libCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarMessages extends js.Object {
  /**
    * Title and screen reader text for the left arrow button.
    * @default: "navigate back"
    */
  var moveBack: js.UndefOr[String] = js.undefined
  /**
    * Title and screen reader text for the right arrow button.
    * @default: "navigate forward"
    */
  var moveForward: js.UndefOr[String] = js.undefined
}

object CalendarMessages {
  @scala.inline
  def apply(moveBack: String = null, moveForward: String = null): CalendarMessages = {
    val __obj = js.Dynamic.literal()
    if (moveBack != null) __obj.updateDynamic("moveBack")(moveBack.asInstanceOf[js.Any])
    if (moveForward != null) __obj.updateDynamic("moveForward")(moveForward.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarMessages]
  }
}

