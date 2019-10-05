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
    val __obj = js.Dynamic.literal(android = android, iOS = iOS, url = url)
    if (!js.isUndefined(handleCodeInApp)) __obj.updateDynamic("handleCodeInApp")(handleCodeInApp)
    __obj.asInstanceOf[ActionCodeSettings]
  }
}

