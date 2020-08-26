package typings.reactNativeFirebase.mod.RNFirebase

import typings.reactNativeFirebase.anon.BundleId
import typings.reactNativeFirebase.anon.InstallApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionCodeSettings extends js.Object {
  var android: InstallApp = js.native
  var handleCodeInApp: js.UndefOr[Boolean] = js.native
  var iOS: BundleId = js.native
  var url: String = js.native
}

object ActionCodeSettings {
  @scala.inline
  def apply(android: InstallApp, iOS: BundleId, url: String): ActionCodeSettings = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], iOS = iOS.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeSettings]
  }
  @scala.inline
  implicit class ActionCodeSettingsOps[Self <: ActionCodeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAndroid(value: InstallApp): Self = this.set("android", value.asInstanceOf[js.Any])
    @scala.inline
    def setIOS(value: BundleId): Self = this.set("iOS", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandleCodeInApp(value: Boolean): Self = this.set("handleCodeInApp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleCodeInApp: Self = this.set("handleCodeInApp", js.undefined)
  }
  
}

