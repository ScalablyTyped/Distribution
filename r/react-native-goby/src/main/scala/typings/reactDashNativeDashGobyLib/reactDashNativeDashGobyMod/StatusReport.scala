package typings
package reactDashNativeDashGobyLib.reactDashNativeDashGobyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusReport extends js.Object {
  /**
    * The version of the app that was deployed (for a native app upgrade).
    */
  var appVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Details of the package that was deployed (or attempted to).
    */
  var `package`: js.UndefOr[Package] = js.undefined
  /**
    * Deployment key used when deploying the previous package.
    */
  var previousDeploymentKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The label (v#) of the package that was upgraded from.
    */
  var previousLabelOrAppVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the deployment succeeded or failed.
    */
  var status: reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.DeploymentStatus
}

