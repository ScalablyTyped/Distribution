package typings.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DismissedVersionNotification extends js.Object {
  var dismissedVersionNotification: String
  var versions: Current
}

object DismissedVersionNotification {
  @scala.inline
  def apply(dismissedVersionNotification: String, versions: Current): DismissedVersionNotification = {
    val __obj = js.Dynamic.literal(dismissedVersionNotification = dismissedVersionNotification.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DismissedVersionNotification]
  }
}

