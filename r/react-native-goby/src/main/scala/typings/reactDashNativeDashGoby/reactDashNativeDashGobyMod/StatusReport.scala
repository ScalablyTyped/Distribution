package typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod

import typings.reactDashNativeDashGoby.reactDashNativeDashGobyMod.GobyNs.DeploymentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusReport extends js.Object {
  /**
    * The version of the app that was deployed (for a native app upgrade).
    */
  var appVersion: js.UndefOr[String] = js.undefined
  /**
    * Details of the package that was deployed (or attempted to).
    */
  var `package`: js.UndefOr[Package] = js.undefined
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
    appVersion: String = null,
    `package`: Package = null,
    previousDeploymentKey: String = null,
    previousLabelOrAppVersion: String = null
  ): StatusReport = {
    val __obj = js.Dynamic.literal(status = status)
    if (appVersion != null) __obj.updateDynamic("appVersion")(appVersion)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (previousDeploymentKey != null) __obj.updateDynamic("previousDeploymentKey")(previousDeploymentKey)
    if (previousLabelOrAppVersion != null) __obj.updateDynamic("previousLabelOrAppVersion")(previousLabelOrAppVersion)
    __obj.asInstanceOf[StatusReport]
  }
}

