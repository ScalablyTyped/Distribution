package typings
package reactDashNativeDashFirebaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InstallApp extends js.Object {
  var installApp: js.UndefOr[scala.Boolean] = js.undefined
  var minimumVersion: js.UndefOr[java.lang.String] = js.undefined
  var packageName: java.lang.String
}

object Anon_InstallApp {
  @scala.inline
  def apply(
    packageName: java.lang.String,
    installApp: js.UndefOr[scala.Boolean] = js.undefined,
    minimumVersion: java.lang.String = null
  ): Anon_InstallApp = {
    val __obj = js.Dynamic.literal(packageName = packageName)
    if (!js.isUndefined(installApp)) __obj.updateDynamic("installApp")(installApp)
    if (minimumVersion != null) __obj.updateDynamic("minimumVersion")(minimumVersion)
    __obj.asInstanceOf[Anon_InstallApp]
  }
}

