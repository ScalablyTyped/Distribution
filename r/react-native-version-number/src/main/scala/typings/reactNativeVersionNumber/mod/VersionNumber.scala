package typings.reactNativeVersionNumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionNumber extends js.Object {
  var appVersion: js.UndefOr[String] = js.native
  var buildVersion: js.UndefOr[String] = js.native
  var bundleIdentifier: js.UndefOr[String] = js.native
}

object VersionNumber {
  @scala.inline
  def apply(): VersionNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersionNumber]
  }
  @scala.inline
  implicit class VersionNumberOps[Self <: VersionNumber] (val x: Self) extends AnyVal {
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
    def setAppVersion(value: String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppVersion: Self = this.set("appVersion", js.undefined)
    @scala.inline
    def setBuildVersion(value: String): Self = this.set("buildVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildVersion: Self = this.set("buildVersion", js.undefined)
    @scala.inline
    def setBundleIdentifier(value: String): Self = this.set("bundleIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleIdentifier: Self = this.set("bundleIdentifier", js.undefined)
  }
  
}

