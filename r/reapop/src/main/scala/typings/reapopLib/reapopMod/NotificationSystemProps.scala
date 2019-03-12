package typings
package reapopLib.reapopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationSystemProps extends js.Object {
  var filter: js.UndefOr[js.Function1[/* notification */ Notification, scala.Boolean]] = js.undefined
  var theme: NotificationSystemTheme
}

object NotificationSystemProps {
  @scala.inline
  def apply(theme: NotificationSystemTheme, filter: /* notification */ Notification => scala.Boolean = null): NotificationSystemProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    __obj.asInstanceOf[NotificationSystemProps]
  }
}

