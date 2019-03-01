package typings
package reactDashWidgetsLib.libCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarMessages extends js.Object {
  /**
    * Title and screen reader text for the left arrow button.
    * @default: "navigate back"
    */
  var moveBack: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Title and screen reader text for the right arrow button.
    * @default: "navigate forward"
    */
  var moveForward: js.UndefOr[java.lang.String] = js.undefined
}

object CalendarMessages {
  @scala.inline
  def apply(moveBack: java.lang.String = null, moveForward: java.lang.String = null): CalendarMessages = {
    val __obj = js.Dynamic.literal()
    if (moveBack != null) __obj.updateDynamic("moveBack")(moveBack)
    if (moveForward != null) __obj.updateDynamic("moveForward")(moveForward)
    __obj.asInstanceOf[CalendarMessages]
  }
}

