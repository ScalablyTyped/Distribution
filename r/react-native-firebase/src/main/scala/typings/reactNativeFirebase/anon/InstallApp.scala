package typings.reactNativeFirebase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallApp extends js.Object {
  var installApp: js.UndefOr[Boolean] = js.native
  var minimumVersion: js.UndefOr[String] = js.native
  var packageName: String = js.native
}

object InstallApp {
  @scala.inline
  def apply(packageName: String): InstallApp = {
    val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallApp]
  }
  @scala.inline
  implicit class InstallAppOps[Self <: InstallApp] (val x: Self) extends AnyVal {
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
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstallApp(value: Boolean): Self = this.set("installApp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallApp: Self = this.set("installApp", js.undefined)
    @scala.inline
    def setMinimumVersion(value: String): Self = this.set("minimumVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumVersion: Self = this.set("minimumVersion", js.undefined)
  }
  
}

