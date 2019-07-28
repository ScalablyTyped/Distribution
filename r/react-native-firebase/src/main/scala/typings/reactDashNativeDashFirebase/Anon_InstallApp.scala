package typings.reactDashNativeDashFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InstallApp extends js.Object {
  var installApp: js.UndefOr[Boolean] = js.undefined
  var minimumVersion: js.UndefOr[String] = js.undefined
  var packageName: String
}

object Anon_InstallApp {
  @scala.inline
  def apply(packageName: String, installApp: js.UndefOr[Boolean] = js.undefined, minimumVersion: String = null): Anon_InstallApp = {
    val __obj = js.Dynamic.literal(packageName = packageName)
    if (!js.isUndefined(installApp)) __obj.updateDynamic("installApp")(installApp)
    if (minimumVersion != null) __obj.updateDynamic("minimumVersion")(minimumVersion)
    __obj.asInstanceOf[Anon_InstallApp]
  }
}

