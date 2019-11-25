package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase

import typings.reactDashNativeDashFirebase.Anon_BundleId
import typings.reactDashNativeDashFirebase.Anon_InstallApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCodeSettings extends js.Object {
  var android: Anon_InstallApp
  var handleCodeInApp: js.UndefOr[Boolean] = js.undefined
  var iOS: Anon_BundleId
  var url: String
}

object ActionCodeSettings {
  @scala.inline
  def apply(
    android: Anon_InstallApp,
    iOS: Anon_BundleId,
    url: String,
    handleCodeInApp: js.UndefOr[Boolean] = js.undefined
  ): ActionCodeSettings = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], iOS = iOS.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(handleCodeInApp)) __obj.updateDynamic("handleCodeInApp")(handleCodeInApp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeSettings]
  }
}

