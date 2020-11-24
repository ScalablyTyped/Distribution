package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption extends js.Object {
  
  /**
    * When to reroute traffic from an original environment to a replacement environment in a blue/green deployment.
    * * `CONTINUE_DEPLOYMENT`: Register new instances with the load balancer immediately after the new application revision is installed on the instances in the replacement environment.
    * * `STOP_DEPLOYMENT`: Do not register new instances with load balancer unless traffic is rerouted manually. If traffic is not rerouted manually before the end of the specified wait period, the deployment status is changed to Stopped.
    */
  var actionOnTimeout: js.UndefOr[String] = js.native
  
  /**
    * The number of minutes to wait before the status of a blue/green deployment changed to Stopped if rerouting is not started manually. Applies only to the `STOP_DEPLOYMENT` option for `actionOnTimeout`.
    */
  var waitTimeInMinutes: js.UndefOr[Double] = js.native
}
object DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption {
  
  @scala.inline
  def apply(): DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption]
  }
  
  @scala.inline
  implicit class DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOptionOps[Self <: DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionOnTimeout(value: String): Self = this.set("actionOnTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionOnTimeout: Self = this.set("actionOnTimeout", js.undefined)
    
    @scala.inline
    def setWaitTimeInMinutes(value: Double): Self = this.set("waitTimeInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitTimeInMinutes: Self = this.set("waitTimeInMinutes", js.undefined)
  }
}
