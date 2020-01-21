package typings.storybookApi

import typings.storybookApi.versionsMod.Version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrent extends js.Object {
  var current: Version | AnonVersion
  var latest: js.UndefOr[Version] = js.undefined
  var next: js.UndefOr[Version] = js.undefined
}

object AnonCurrent {
  @scala.inline
  def apply(current: Version | AnonVersion, latest: Version = null, next: Version = null): AnonCurrent = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    if (latest != null) __obj.updateDynamic("latest")(latest.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrent]
  }
}

