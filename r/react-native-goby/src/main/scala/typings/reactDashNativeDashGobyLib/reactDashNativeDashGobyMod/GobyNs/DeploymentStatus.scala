package typings
package reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentStatus extends js.Object

/**
     * Indicates the status of a deployment (after installing and restarting).
     */
@JSImport("react-native-goby/Goby", "DeploymentStatus")
@js.native
object DeploymentStatus extends js.Object {
  /**
           * The deployment failed (and was rolled back).
           */
  @js.native
  sealed trait FAILED
    extends reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.DeploymentStatus
  
  /**
           * The deployment succeeded.
           */
  @js.native
  sealed trait SUCCEEDED
    extends reactDashNativeDashGobyLib.reactDashNativeDashGobyMod.GobyNs.DeploymentStatus
  
}

