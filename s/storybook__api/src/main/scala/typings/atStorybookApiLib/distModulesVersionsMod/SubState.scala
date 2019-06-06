package typings
package atStorybookApiLib.distModulesVersionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubState extends js.Object {
  var dismissedVersionNotification: js.UndefOr[java.lang.String] = js.undefined
  var lastVersionCheck: scala.Double
  var versions: atStorybookApiLib.Anon_CurrentKey
}

object SubState {
  @scala.inline
  def apply(
    lastVersionCheck: scala.Double,
    versions: atStorybookApiLib.Anon_CurrentKey,
    dismissedVersionNotification: java.lang.String = null
  ): SubState = {
    val __obj = js.Dynamic.literal(lastVersionCheck = lastVersionCheck, versions = versions)
    if (dismissedVersionNotification != null) __obj.updateDynamic("dismissedVersionNotification")(dismissedVersionNotification)
    __obj.asInstanceOf[SubState]
  }
}

