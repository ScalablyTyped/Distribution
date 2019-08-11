package typings.atStorybookApi.distModulesVersionsMod

import typings.atStorybookApi.Anon_Current
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubState extends js.Object {
  var dismissedVersionNotification: js.UndefOr[String] = js.undefined
  var lastVersionCheck: Double
  var versions: Anon_Current
}

object SubState {
  @scala.inline
  def apply(lastVersionCheck: Double, versions: Anon_Current, dismissedVersionNotification: String = null): SubState = {
    val __obj = js.Dynamic.literal(lastVersionCheck = lastVersionCheck, versions = versions)
    if (dismissedVersionNotification != null) __obj.updateDynamic("dismissedVersionNotification")(dismissedVersionNotification)
    __obj.asInstanceOf[SubState]
  }
}

