package typings
package reactDashNativeDashVersionDashNumberLib.reactDashNativeDashVersionDashNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionNumber extends js.Object {
  var appVersion: js.UndefOr[java.lang.String] = js.undefined
  var buildVersion: js.UndefOr[java.lang.String] = js.undefined
  var bundleIdentifier: js.UndefOr[java.lang.String] = js.undefined
}

object VersionNumber {
  @scala.inline
  def apply(
    appVersion: java.lang.String = null,
    buildVersion: java.lang.String = null,
    bundleIdentifier: java.lang.String = null
  ): VersionNumber = {
    val __obj = js.Dynamic.literal()
    if (appVersion != null) __obj.updateDynamic("appVersion")(appVersion)
    if (buildVersion != null) __obj.updateDynamic("buildVersion")(buildVersion)
    if (bundleIdentifier != null) __obj.updateDynamic("bundleIdentifier")(bundleIdentifier)
    __obj.asInstanceOf[VersionNumber]
  }
}

