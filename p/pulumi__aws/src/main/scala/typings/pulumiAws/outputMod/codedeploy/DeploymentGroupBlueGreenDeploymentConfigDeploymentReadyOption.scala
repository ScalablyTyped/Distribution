package typings.pulumiAws.outputMod.codedeploy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption extends StObject {
  
  /**
    * When to reroute traffic from an original environment to a replacement environment in a blue/green deployment.
    * * `CONTINUE_DEPLOYMENT`: Register new instances with the load balancer immediately after the new application revision is installed on the instances in the replacement environment.
    * * `STOP_DEPLOYMENT`: Do not register new instances with load balancer unless traffic is rerouted manually. If traffic is not rerouted manually before the end of the specified wait period, the deployment status is changed to Stopped.
    */
  var actionOnTimeout: js.UndefOr[String] = js.undefined
  
  /**
    * The number of minutes to wait before the status of a blue/green deployment changed to Stopped if rerouting is not started manually. Applies only to the `STOP_DEPLOYMENT` option for `actionOnTimeout`.
    */
  var waitTimeInMinutes: js.UndefOr[Double] = js.undefined
}
object DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption {
  
  inline def apply(): DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption]
  }
  
  extension [Self <: DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption](x: Self) {
    
    inline def setActionOnTimeout(value: String): Self = StObject.set(x, "actionOnTimeout", value.asInstanceOf[js.Any])
    
    inline def setActionOnTimeoutUndefined: Self = StObject.set(x, "actionOnTimeout", js.undefined)
    
    inline def setWaitTimeInMinutes(value: Double): Self = StObject.set(x, "waitTimeInMinutes", value.asInstanceOf[js.Any])
    
    inline def setWaitTimeInMinutesUndefined: Self = StObject.set(x, "waitTimeInMinutes", js.undefined)
  }
}
