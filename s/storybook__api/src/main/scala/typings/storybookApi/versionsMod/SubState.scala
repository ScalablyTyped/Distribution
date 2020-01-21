package typings.storybookApi.versionsMod

import typings.storybookApi.VersionsUnknownEntries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubState extends js.Object {
  var dismissedVersionNotification: js.UndefOr[String] = js.undefined
  var lastVersionCheck: Double
  var versions: VersionsUnknownEntries
}

object SubState {
  @scala.inline
  def apply(
    lastVersionCheck: Double,
    versions: VersionsUnknownEntries,
    dismissedVersionNotification: String = null
  ): SubState = {
    val __obj = js.Dynamic.literal(lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    if (dismissedVersionNotification != null) __obj.updateDynamic("dismissedVersionNotification")(dismissedVersionNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubState]
  }
}

