package typings.reactNativeGoby.mod.Goby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentStatus extends js.Object
/**
  * Indicates the status of a deployment (after installing and restarting).
  */
@JSImport("react-native-goby", "Goby.DeploymentStatus")
@js.native
object DeploymentStatus extends js.Object {
  
  /**
    * The deployment failed (and was rolled back).
    */
  @js.native
  sealed trait FAILED extends DeploymentStatus
  
  /**
    * The deployment succeeded.
    */
  @js.native
  sealed trait SUCCEEDED extends DeploymentStatus
}
