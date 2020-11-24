package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentConfigTrafficRoutingConfig extends js.Object {
  
  /**
    * The time based canary configuration information. If `type` is `TimeBasedLinear`, use `timeBasedLinear` instead.
    */
  var timeBasedCanary: js.UndefOr[DeploymentConfigTrafficRoutingConfigTimeBasedCanary] = js.native
  
  /**
    * The time based linear configuration information. If `type` is `TimeBasedCanary`, use `timeBasedCanary` instead.
    */
  var timeBasedLinear: js.UndefOr[DeploymentConfigTrafficRoutingConfigTimeBasedLinear] = js.native
  
  /**
    * Type of traffic routing config. One of `TimeBasedCanary`, `TimeBasedLinear`, `AllAtOnce`.
    */
  var `type`: js.UndefOr[String] = js.native
}
object DeploymentConfigTrafficRoutingConfig {
  
  @scala.inline
  def apply(): DeploymentConfigTrafficRoutingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfigTrafficRoutingConfig]
  }
  
  @scala.inline
  implicit class DeploymentConfigTrafficRoutingConfigOps[Self <: DeploymentConfigTrafficRoutingConfig] (val x: Self) extends AnyVal {
    
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
    def setTimeBasedCanary(value: DeploymentConfigTrafficRoutingConfigTimeBasedCanary): Self = this.set("timeBasedCanary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeBasedCanary: Self = this.set("timeBasedCanary", js.undefined)
    
    @scala.inline
    def setTimeBasedLinear(value: DeploymentConfigTrafficRoutingConfigTimeBasedLinear): Self = this.set("timeBasedLinear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeBasedLinear: Self = this.set("timeBasedLinear", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
