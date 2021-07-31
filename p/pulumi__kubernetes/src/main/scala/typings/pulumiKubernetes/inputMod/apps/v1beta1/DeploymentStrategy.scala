package typings.pulumiKubernetes.inputMod.apps.v1beta1

import typings.pulumiPulumi.outputMod.Input
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
  var rollingUpdate: js.UndefOr[Input[RollingUpdateDeployment]] = js.undefined
  
  /**
    * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object DeploymentStrategy {
  
  @scala.inline
  def apply(): DeploymentStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentStrategy]
  }
  
  @scala.inline
  implicit class DeploymentStrategyMutableBuilder[Self <: DeploymentStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRollingUpdate(value: Input[RollingUpdateDeployment]): Self = StObject.set(x, "rollingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollingUpdateUndefined: Self = StObject.set(x, "rollingUpdate", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
