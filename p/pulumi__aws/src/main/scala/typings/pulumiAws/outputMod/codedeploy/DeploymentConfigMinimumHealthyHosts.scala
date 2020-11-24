package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentConfigMinimumHealthyHosts extends js.Object {
  
  /**
    * The type can either be `FLEET_PERCENT` or `HOST_COUNT`.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The value when the type is `FLEET_PERCENT` represents the minimum number of healthy instances as
    * a percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at the start of the
    * deployment, AWS CodeDeploy converts the percentage to the equivalent number of instance and rounds up fractional instances.
    * When the type is `HOST_COUNT`, the value represents the minimum number of healthy instances as an absolute value.
    */
  var value: js.UndefOr[Double] = js.native
}
object DeploymentConfigMinimumHealthyHosts {
  
  @scala.inline
  def apply(): DeploymentConfigMinimumHealthyHosts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfigMinimumHealthyHosts]
  }
  
  @scala.inline
  implicit class DeploymentConfigMinimumHealthyHostsOps[Self <: DeploymentConfigMinimumHealthyHosts] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
