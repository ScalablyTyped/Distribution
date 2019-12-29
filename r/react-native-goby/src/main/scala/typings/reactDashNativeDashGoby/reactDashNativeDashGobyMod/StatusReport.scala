package typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod

import typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.Goby.DeploymentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusReport extends js.Object {
  /**
    * Details of the package that was deployed (or attempted to).
    */
  @JSName("package")
  var _package: js.UndefOr[Package] = js.undefined
  /**
    * The version of the app that was deployed (for a native app upgrade).
    */
  var appVersion: js.UndefOr[String] = js.undefined
  /**
    * Deployment key used when deploying the previous package.
    */
  var previousDeploymentKey: js.UndefOr[String] = js.undefined
  /**
    * The label (v#) of the package that was upgraded from.
    */
  var previousLabelOrAppVersion: js.UndefOr[String] = js.undefined
  /**
    * Whether the deployment succeeded or failed.
    */
  var status: DeploymentStatus
}

object StatusReport {
  @scala.inline
  def apply(
    status: DeploymentStatus,
    _package: Package = null,
    appVersion: String = null,
    previousDeploymentKey: String = null,
    previousLabelOrAppVersion: String = null
  ): StatusReport = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (appVersion != null) __obj.updateDynamic("appVersion")(appVersion.asInstanceOf[js.Any])
    if (previousDeploymentKey != null) __obj.updateDynamic("previousDeploymentKey")(previousDeploymentKey.asInstanceOf[js.Any])
    if (previousLabelOrAppVersion != null) __obj.updateDynamic("previousLabelOrAppVersion")(previousLabelOrAppVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusReport]
  }
}

