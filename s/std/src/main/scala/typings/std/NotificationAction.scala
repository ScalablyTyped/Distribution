package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationAction extends js.Object {
  var action: java.lang.String
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var title: java.lang.String
}

object NotificationAction {
  @scala.inline
  def apply(action: java.lang.String, title: java.lang.String, icon: java.lang.String = null): NotificationAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationAction]
  }
}

