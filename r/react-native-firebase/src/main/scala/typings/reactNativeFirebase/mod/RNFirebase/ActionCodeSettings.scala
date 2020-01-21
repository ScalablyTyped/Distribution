package typings.reactNativeFirebase.mod.RNFirebase

import typings.reactNativeFirebase.AnonBundleId
import typings.reactNativeFirebase.AnonInstallApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCodeSettings extends js.Object {
  var android: AnonInstallApp
  var handleCodeInApp: js.UndefOr[Boolean] = js.undefined
  var iOS: AnonBundleId
  var url: String
}

object ActionCodeSettings {
  @scala.inline
  def apply(
    android: AnonInstallApp,
    iOS: AnonBundleId,
    url: String,
    handleCodeInApp: js.UndefOr[Boolean] = js.undefined
  ): ActionCodeSettings = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], iOS = iOS.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(handleCodeInApp)) __obj.updateDynamic("handleCodeInApp")(handleCodeInApp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeSettings]
  }
}

