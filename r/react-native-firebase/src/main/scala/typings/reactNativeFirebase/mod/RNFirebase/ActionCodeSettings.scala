package typings.reactNativeFirebase.mod.RNFirebase

import typings.reactNativeFirebase.anon.BundleId
import typings.reactNativeFirebase.anon.InstallApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCodeSettings extends js.Object {
  var android: InstallApp
  var handleCodeInApp: js.UndefOr[Boolean] = js.undefined
  var iOS: BundleId
  var url: String
}

object ActionCodeSettings {
  @scala.inline
  def apply(
    android: InstallApp,
    iOS: BundleId,
    url: String,
    handleCodeInApp: js.UndefOr[Boolean] = js.undefined
  ): ActionCodeSettings = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], iOS = iOS.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(handleCodeInApp)) __obj.updateDynamic("handleCodeInApp")(handleCodeInApp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeSettings]
  }
}

