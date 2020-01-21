package typings.reactNotifyToast.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationProps extends js.Object {
  var options: js.UndefOr[Options] = js.undefined
}

object NotificationProps {
  @scala.inline
  def apply(options: Options = null): NotificationProps = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationProps]
  }
}

