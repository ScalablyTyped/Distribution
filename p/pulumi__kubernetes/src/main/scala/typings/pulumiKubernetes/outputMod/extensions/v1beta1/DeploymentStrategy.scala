package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DeploymentStrategy describes how to replace existing pods with new ones.
  */
trait DeploymentStrategy extends StObject {
  
  /**
    * Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
    */
  var rollingUpdate: RollingUpdateDeployment
  
  /**
    * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
    */
  var `type`: String
}
object DeploymentStrategy {
  
  @scala.inline
  def apply(rollingUpdate: RollingUpdateDeployment, `type`: String): DeploymentStrategy = {
    val __obj = js.Dynamic.literal(rollingUpdate = rollingUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentStrategy]
  }
  
  @scala.inline
  implicit class DeploymentStrategyMutableBuilder[Self <: DeploymentStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRollingUpdate(value: RollingUpdateDeployment): Self = StObject.set(x, "rollingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
