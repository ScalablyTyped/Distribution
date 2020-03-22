package typings.storybookApi.versionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubState extends js.Object {
  var dismissedVersionNotification: js.UndefOr[String] = js.undefined
  var lastVersionCheck: Double
  var versions: Versions with UnknownEntries
}

object SubState {
  @scala.inline
  def apply(
    lastVersionCheck: Double,
    versions: Versions with UnknownEntries,
    dismissedVersionNotification: String = null
  ): SubState = {
    val __obj = js.Dynamic.literal(lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    if (dismissedVersionNotification != null) __obj.updateDynamic("dismissedVersionNotification")(dismissedVersionNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubState]
  }
}

