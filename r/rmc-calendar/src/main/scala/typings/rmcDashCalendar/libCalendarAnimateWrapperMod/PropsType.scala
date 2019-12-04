package typings.rmcDashCalendar.libCalendarAnimateWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var displayType: js.UndefOr[String] = js.undefined
  var visible: Boolean
}

object PropsType {
  @scala.inline
  def apply(visible: Boolean, className: String = null, displayType: String = null): PropsType = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (displayType != null) __obj.updateDynamic("displayType")(displayType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

