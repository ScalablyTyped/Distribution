package typings.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDismissedVersionNotification extends js.Object {
  var dismissedVersionNotification: String
  var versions: AnonCurrent
}

object AnonDismissedVersionNotification {
  @scala.inline
  def apply(dismissedVersionNotification: String, versions: AnonCurrent): AnonDismissedVersionNotification = {
    val __obj = js.Dynamic.literal(dismissedVersionNotification = dismissedVersionNotification.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDismissedVersionNotification]
  }
}

