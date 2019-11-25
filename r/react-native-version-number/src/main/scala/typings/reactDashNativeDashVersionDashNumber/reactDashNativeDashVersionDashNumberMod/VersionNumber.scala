package typings.reactDashNativeDashVersionDashNumber.reactDashNativeDashVersionDashNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionNumber extends js.Object {
  var appVersion: js.UndefOr[String] = js.undefined
  var buildVersion: js.UndefOr[String] = js.undefined
  var bundleIdentifier: js.UndefOr[String] = js.undefined
}

object VersionNumber {
  @scala.inline
  def apply(appVersion: String = null, buildVersion: String = null, bundleIdentifier: String = null): VersionNumber = {
    val __obj = js.Dynamic.literal()
    if (appVersion != null) __obj.updateDynamic("appVersion")(appVersion.asInstanceOf[js.Any])
    if (buildVersion != null) __obj.updateDynamic("buildVersion")(buildVersion.asInstanceOf[js.Any])
    if (bundleIdentifier != null) __obj.updateDynamic("bundleIdentifier")(bundleIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionNumber]
  }
}

