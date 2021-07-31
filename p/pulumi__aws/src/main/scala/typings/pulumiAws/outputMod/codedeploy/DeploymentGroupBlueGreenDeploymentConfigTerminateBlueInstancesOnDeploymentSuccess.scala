package typings.pulumiAws.outputMod.codedeploy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess extends StObject {
  
  /**
    * The action to take on instances in the original environment after a successful blue/green deployment.
    * * `TERMINATE`: Instances are terminated after a specified wait time.
    * * `KEEP_ALIVE`: Instances are left running after they are deregistered from the load balancer and removed from the deployment group.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * The number of minutes to wait after a successful blue/green deployment before terminating instances from the original environment.
    */
  var terminationWaitTimeInMinutes: js.UndefOr[Double] = js.undefined
}
object DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess {
  
  @scala.inline
  def apply(): DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess]
  }
  
  @scala.inline
  implicit class DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessMutableBuilder[Self <: DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setTerminationWaitTimeInMinutes(value: Double): Self = StObject.set(x, "terminationWaitTimeInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationWaitTimeInMinutesUndefined: Self = StObject.set(x, "terminationWaitTimeInMinutes", js.undefined)
  }
}
