package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Notification ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/notification/notification.js
trait NotificationModifierProps extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
}

object NotificationModifierProps {
  @scala.inline
  def apply(color: Color = null): NotificationModifierProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationModifierProps]
  }
}

